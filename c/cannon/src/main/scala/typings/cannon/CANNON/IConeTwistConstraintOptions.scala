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
  
  @scala.inline
  def apply(): IConeTwistConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConeTwistConstraintOptions]
  }
  
  @scala.inline
  implicit class IConeTwistConstraintOptionsMutableBuilder[Self <: IConeTwistConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisA(value: Vec3): Self = StObject.set(x, "axisA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisAUndefined: Self = StObject.set(x, "axisA", js.undefined)
    
    @scala.inline
    def setAxisB(value: Vec3): Self = StObject.set(x, "axisB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisBUndefined: Self = StObject.set(x, "axisB", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    @scala.inline
    def setPivotA(value: Vec3): Self = StObject.set(x, "pivotA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotAUndefined: Self = StObject.set(x, "pivotA", js.undefined)
    
    @scala.inline
    def setPivotB(value: Vec3): Self = StObject.set(x, "pivotB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotBUndefined: Self = StObject.set(x, "pivotB", js.undefined)
  }
}
