package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: TempFilesData): scala.Unit
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    success: js.Function1[TempFilesData, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    count: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    sizeType: js.Array[ImageSizeType] = null,
    sourceType: js.Array[ImageSourceType] = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

