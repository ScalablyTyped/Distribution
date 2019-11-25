package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的动物信息
		 */
trait animalClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 返回预测得分top结果数，默认为6
  @JSName("success")
  var success_animalClassifyOptions: js.UndefOr[js.Function1[/* res */ animalClassifyResponse, Unit]] = js.undefined
   // 图像资源地址
  var top_num: js.UndefOr[Double] = js.undefined
}

object animalClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ animalClassifyResponse => Unit = null,
    top_num: Int | Double = null
  ): animalClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (top_num != null) __obj.updateDynamic("top_num")(top_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyOptions]
  }
}

