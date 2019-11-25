package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的植物信息
		 */
trait plantClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图像资源地址
  @JSName("success")
  var success_plantClassifyOptions: js.UndefOr[js.Function1[/* res */ plantClassifyResponse, Unit]] = js.undefined
}

object plantClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ plantClassifyResponse => Unit = null
  ): plantClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[plantClassifyOptions]
  }
}

