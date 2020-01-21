package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
		 */
trait GeneralIdentifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图像资源地址
  @JSName("success")
  var success_GeneralIdentifyOptions: js.UndefOr[js.Function1[/* res */ GeneralIdentifyResponse, Unit]] = js.undefined
}

object GeneralIdentifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ GeneralIdentifyResponse => Unit = null
  ): GeneralIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GeneralIdentifyOptions]
  }
}

