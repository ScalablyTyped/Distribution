package typings.chartjsPluginCrosshair.mod.chartJsAugmentingMod

import typings.chartjsPluginCrosshair.chartjsPluginCrosshairStrings.interpolate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionModeRegistry extends js.Object {
  
  var interpolate: typings.chartjsPluginCrosshair.chartjsPluginCrosshairStrings.interpolate = js.native
}
object InteractionModeRegistry {
  
  @scala.inline
  def apply(interpolate: interpolate): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(interpolate = interpolate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionModeRegistry]
  }
  
  @scala.inline
  implicit class InteractionModeRegistryOps[Self <: InteractionModeRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterpolate(value: interpolate): Self = this.set("interpolate", value.asInstanceOf[js.Any])
  }
}
