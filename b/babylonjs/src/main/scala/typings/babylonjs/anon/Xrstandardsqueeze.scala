package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xrstandardsqueeze extends StObject {
  
  var `xr-standard-squeeze`: RootNodeName = js.native
  
  var `xr-standard-thumbstick`: RootNodeName = js.native
  
  var `xr-standard-touchpad`: LabelAnchorNodeName = js.native
  
  var `xr-standard-trigger`: RootNodeName = js.native
}
object Xrstandardsqueeze {
  
  @scala.inline
  def apply(
    `xr-standard-squeeze`: RootNodeName,
    `xr-standard-thumbstick`: RootNodeName,
    `xr-standard-touchpad`: LabelAnchorNodeName,
    `xr-standard-trigger`: RootNodeName
  ): Xrstandardsqueeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-squeeze")(`xr-standard-squeeze`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-trigger")(`xr-standard-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardsqueeze]
  }
  
  @scala.inline
  implicit class XrstandardsqueezeMutableBuilder[Self <: Xrstandardsqueeze] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setXr-standard-squeeze`(value: RootNodeName): Self = StObject.set(x, "xr-standard-squeeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXr-standard-thumbstick`(value: RootNodeName): Self = StObject.set(x, "xr-standard-thumbstick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXr-standard-touchpad`(value: LabelAnchorNodeName): Self = StObject.set(x, "xr-standard-touchpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXr-standard-trigger`(value: RootNodeName): Self = StObject.set(x, "xr-standard-trigger", value.asInstanceOf[js.Any])
  }
}
