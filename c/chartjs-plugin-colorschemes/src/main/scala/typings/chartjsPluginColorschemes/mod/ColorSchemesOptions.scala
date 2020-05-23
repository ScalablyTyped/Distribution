package typings.chartjsPluginColorschemes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemesOptions extends js.Object {
  var custom: js.UndefOr[js.Function1[/* schemeColors */ js.Array[String], js.Array[String] | Unit]] = js.undefined
  var fillAlpha: js.UndefOr[Double] = js.undefined
  var `override`: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var scheme: String | js.Array[String]
}

object ColorSchemesOptions {
  @scala.inline
  def apply(
    scheme: String | js.Array[String],
    custom: /* schemeColors */ js.Array[String] => js.Array[String] | Unit = null,
    fillAlpha: js.UndefOr[Double] = js.undefined,
    `override`: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): ColorSchemesOptions = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (!js.isUndefined(fillAlpha)) __obj.updateDynamic("fillAlpha")(fillAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemesOptions]
  }
}

