package typings
package crumbLib.crumbMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[scala.Boolean | crumbLib.Anon_Key] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(crumb: scala.Boolean | crumbLib.Anon_Key = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crumb != null) __obj.updateDynamic("crumb")(crumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

