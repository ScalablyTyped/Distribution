package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用户向服务请求检测图像中的主体位置。
		 */
trait DetectIdentifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var image: java.lang.String
   // 如果检测主体是人，主体区域是否带上人脸部分，0-不带人脸区域，其他-带人脸区域，裁剪类需求推荐带人脸，检索/识别类需求推荐不带人脸。默认取1，带人脸。
  @JSName("success")
  var success_DetectIdentifyOptions: js.UndefOr[js.Function1[/* res */ DetectIdentifyResponse, scala.Unit]] = js.undefined
   // 图像资源地址
  var with_face: js.UndefOr[scala.Double] = js.undefined
}

object DetectIdentifyOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ DetectIdentifyResponse, scala.Unit] = null,
    with_face: scala.Int | scala.Double = null
  ): DetectIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (with_face != null) __obj.updateDynamic("with_face")(with_face.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyOptions]
  }
}

