package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConeTwistConstraintOptions extends StObject {
  
  var axisA: js.UndefOr[Vec3] = js.undefined
  
  var axisB: js.UndefOr[Vec3] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
  
  var pivotA: js.UndefOr[Vec3] = js.undefined
  
  var pivotB: js.UndefOr[Vec3] = js.undefined
}
object IConeTwistConstraintOptions {
  
  inline def apply(): IConeTwistConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConeTwistConstraintOptions]
  }
  
  extension [Self <: IConeTwistConstraintOptions](x: Self) {
    
    inline def setAxisA(value: Vec3): Self = StObject.set(x, "axisA", value.asInstanceOf[js.Any])
    
    inline def setAxisAUndefined: Self = StObject.set(x, "axisA", js.undefined)
    
    inline def setAxisB(value: Vec3): Self = StObject.set(x, "axisB", value.asInstanceOf[js.Any])
    
    inline def setAxisBUndefined: Self = StObject.set(x, "axisB", js.undefined)
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    inline def setPivotA(value: Vec3): Self = StObject.set(x, "pivotA", value.asInstanceOf[js.Any])
    
    inline def setPivotAUndefined: Self = StObject.set(x, "pivotA", js.undefined)
    
    inline def setPivotB(value: Vec3): Self = StObject.set(x, "pivotB", value.asInstanceOf[js.Any])
    
    inline def setPivotBUndefined: Self = StObject.set(x, "pivotB", js.undefined)
  }
}
