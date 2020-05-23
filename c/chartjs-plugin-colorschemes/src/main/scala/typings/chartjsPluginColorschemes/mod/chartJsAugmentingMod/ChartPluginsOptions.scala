package typings.chartjsPluginColorschemes.mod.chartJsAugmentingMod

import typings.chartjsPluginColorschemes.mod.ColorSchemesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPluginsOptions extends js.Object {
  var colorschemes: js.UndefOr[ColorSchemesOptions] = js.undefined
}

object ChartPluginsOptions {
  @scala.inline
  def apply(colorschemes: ColorSchemesOptions = null): ChartPluginsOptions = {
    val __obj = js.Dynamic.literal()
    if (colorschemes != null) __obj.updateDynamic("colorschemes")(colorschemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPluginsOptions]
  }
}

