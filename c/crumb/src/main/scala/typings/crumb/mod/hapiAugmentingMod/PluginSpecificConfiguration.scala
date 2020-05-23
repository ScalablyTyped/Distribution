package typings.crumb.mod.hapiAugmentingMod

import typings.crumb.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[Boolean | Key] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(crumb: Boolean | Key = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crumb != null) __obj.updateDynamic("crumb")(crumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

