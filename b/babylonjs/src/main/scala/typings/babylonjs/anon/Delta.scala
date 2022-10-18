package typings.babylonjs.anon

import typings.babylonjs.collisionsPickingInfoMod.PickingInfo
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: Vector3
  
  var pickInfo: PickingInfo
  
  var position: Vector3
}
object Delta {
  
  inline def apply(delta: Vector3, pickInfo: PickingInfo, position: Vector3): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], pickInfo = pickInfo.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: Vector3): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPickInfo(value: PickingInfo): Self = StObject.set(x, "pickInfo", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
