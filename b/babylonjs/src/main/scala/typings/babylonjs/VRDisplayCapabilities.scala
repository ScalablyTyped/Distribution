package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRDisplayCapabilities extends StObject {
  
  val canPresent: Boolean
  
  val hasExternalDisplay: Boolean
  
  val hasOrientation: Boolean
  
  val hasPosition: Boolean
  
  val maxLayers: Double
}
object VRDisplayCapabilities {
  
  inline def apply(
    canPresent: Boolean,
    hasExternalDisplay: Boolean,
    hasOrientation: Boolean,
    hasPosition: Boolean,
    maxLayers: Double
  ): VRDisplayCapabilities = {
    val __obj = js.Dynamic.literal(canPresent = canPresent.asInstanceOf[js.Any], hasExternalDisplay = hasExternalDisplay.asInstanceOf[js.Any], hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], maxLayers = maxLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VRDisplayCapabilities] (val x: Self) extends AnyVal {
    
    inline def setCanPresent(value: Boolean): Self = StObject.set(x, "canPresent", value.asInstanceOf[js.Any])
    
    inline def setHasExternalDisplay(value: Boolean): Self = StObject.set(x, "hasExternalDisplay", value.asInstanceOf[js.Any])
    
    inline def setHasOrientation(value: Boolean): Self = StObject.set(x, "hasOrientation", value.asInstanceOf[js.Any])
    
    inline def setHasPosition(value: Boolean): Self = StObject.set(x, "hasPosition", value.asInstanceOf[js.Any])
    
    inline def setMaxLayers(value: Double): Self = StObject.set(x, "maxLayers", value.asInstanceOf[js.Any])
  }
}
