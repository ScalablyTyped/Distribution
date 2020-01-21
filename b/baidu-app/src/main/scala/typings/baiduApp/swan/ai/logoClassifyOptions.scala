package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的品牌 LOGO 信息
		 */
trait logoClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var custom_lib: js.UndefOr[Boolean] = js.undefined
  var image: String
   // 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库。
  @JSName("success")
  var success_logoClassifyOptions: js.UndefOr[js.Function1[/* res */ logoClassifyResponse, Unit]] = js.undefined
}

object logoClassifyOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    custom_lib: js.UndefOr[Boolean] = js.undefined,
    fail: js.Any => Unit = null,
    success: /* res */ logoClassifyResponse => Unit = null
  ): logoClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(custom_lib)) __obj.updateDynamic("custom_lib")(custom_lib.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[logoClassifyOptions]
  }
}

