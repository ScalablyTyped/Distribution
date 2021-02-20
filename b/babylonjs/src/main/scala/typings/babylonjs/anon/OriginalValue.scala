package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.RuntimeAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalValue extends StObject {
  
  var additiveAnimations: js.Array[RuntimeAnimation] = js.native
  
  var animations: js.Array[RuntimeAnimation] = js.native
  
  var originalValue: Matrix = js.native
  
  var totalAdditiveWeight: Double = js.native
  
  var totalWeight: Double = js.native
}
object OriginalValue {
  
  @scala.inline
  def apply(
    additiveAnimations: js.Array[RuntimeAnimation],
    animations: js.Array[RuntimeAnimation],
    originalValue: Matrix,
    totalAdditiveWeight: Double,
    totalWeight: Double
  ): OriginalValue = {
    val __obj = js.Dynamic.literal(additiveAnimations = additiveAnimations.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalAdditiveWeight = totalAdditiveWeight.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
  
  @scala.inline
  implicit class OriginalValueMutableBuilder[Self <: OriginalValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditiveAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "additiveAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "additiveAnimations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setOriginalValue(value: Matrix): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAdditiveWeight(value: Double): Self = StObject.set(x, "totalAdditiveWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalWeight(value: Double): Self = StObject.set(x, "totalWeight", value.asInstanceOf[js.Any])
  }
}
