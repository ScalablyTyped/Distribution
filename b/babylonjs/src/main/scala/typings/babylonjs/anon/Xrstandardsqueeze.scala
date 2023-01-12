package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xrstandardsqueeze extends StObject {
  
  var `xr-standard-squeeze`: RootNodeName
  
  var `xr-standard-thumbstick`: RootNodeName
  
  var `xr-standard-touchpad`: LabelAnchorNodeName
  
  var `xr-standard-trigger`: RootNodeName
}
object Xrstandardsqueeze {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Xrstandardsqueeze] (val x: Self) extends AnyVal {
    
    inline def `setXr-standard-squeeze`(value: RootNodeName): Self = StObject.set(x, "xr-standard-squeeze", value.asInstanceOf[js.Any])
    
    inline def `setXr-standard-thumbstick`(value: RootNodeName): Self = StObject.set(x, "xr-standard-thumbstick", value.asInstanceOf[js.Any])
    
    inline def `setXr-standard-touchpad`(value: LabelAnchorNodeName): Self = StObject.set(x, "xr-standard-touchpad", value.asInstanceOf[js.Any])
    
    inline def `setXr-standard-trigger`(value: RootNodeName): Self = StObject.set(x, "xr-standard-trigger", value.asInstanceOf[js.Any])
  }
}
