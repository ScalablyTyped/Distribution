package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.RuntimeAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalAdditiveWeight extends StObject {
  
  var additiveAnimations: js.Array[RuntimeAnimation]
  
  var animations: js.Array[RuntimeAnimation]
  
  var originalValue: Quaternion
  
  var totalAdditiveWeight: Double
  
  var totalWeight: Double
}
object TotalAdditiveWeight {
  
  inline def apply(
    additiveAnimations: js.Array[RuntimeAnimation],
    animations: js.Array[RuntimeAnimation],
    originalValue: Quaternion,
    totalAdditiveWeight: Double,
    totalWeight: Double
  ): TotalAdditiveWeight = {
    val __obj = js.Dynamic.literal(additiveAnimations = additiveAnimations.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalAdditiveWeight = totalAdditiveWeight.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalAdditiveWeight]
  }
  
  extension [Self <: TotalAdditiveWeight](x: Self) {
    
    inline def setAdditiveAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "additiveAnimations", value.asInstanceOf[js.Any])
    
    inline def setAdditiveAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "additiveAnimations", js.Array(value :_*))
    
    inline def setAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    inline def setOriginalValue(value: Quaternion): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setTotalAdditiveWeight(value: Double): Self = StObject.set(x, "totalAdditiveWeight", value.asInstanceOf[js.Any])
    
    inline def setTotalWeight(value: Double): Self = StObject.set(x, "totalWeight", value.asInstanceOf[js.Any])
  }
}
