package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
  var current: js.UndefOr[java.lang.String] = js.undefined
  /** 需要预览的图片链接列表 */
  var urls: js.Array[java.lang.String]
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    current: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (current != null) __obj.updateDynamic("current")(current)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

