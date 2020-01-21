package typings.cspHtmlWebpackPlugin.mod.htmlWebpackPluginAugmentingMod

import typings.cspHtmlWebpackPlugin.AnonPolicy
import typings.cspHtmlWebpackPlugin.mod.AdditionalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cspPlugin: js.UndefOr[AdditionalOptions with AnonPolicy] = js.undefined
}

object Options {
  @scala.inline
  def apply(cspPlugin: AdditionalOptions with AnonPolicy = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cspPlugin != null) __obj.updateDynamic("cspPlugin")(cspPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

