package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 用于检测和识别图片中的品牌 LOGO 信息
		 */
trait logoClassifyOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 图像资源地址
  var custom_lib: js.UndefOr[scala.Boolean] = js.undefined
  var image: java.lang.String
   // 是否只检索用户子库，true则只检索用户子库，false(默认)为检索底库+用户子库。
  @JSName("success")
  var success_logoClassifyOptions: js.UndefOr[js.Function1[/* res */ logoClassifyResponse, scala.Unit]] = js.undefined
}

object logoClassifyOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    custom_lib: js.UndefOr[scala.Boolean] = js.undefined,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ logoClassifyResponse, scala.Unit] = null
  ): logoClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(custom_lib)) __obj.updateDynamic("custom_lib")(custom_lib)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[logoClassifyOptions]
  }
}

