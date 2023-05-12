package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Physics6DoFLimit extends StObject {
  
  /**
    * The axis ID to limit
    */
  var axis: PhysicsConstraintAxis
  
  /**
    * An optional maximum limit for the axis.
    * Corresponds to a distance in meters for linear axes, an angle in radians for angular axes.
    */
  var maxLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional minimum limit for the axis.
    * Corresponds to a distance in meters for linear axes, an angle in radians for angular axes.
    */
  var minLimit: js.UndefOr[Double] = js.undefined
}
object Physics6DoFLimit {
  
  inline def apply(axis: PhysicsConstraintAxis): Physics6DoFLimit = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Physics6DoFLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Physics6DoFLimit] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: PhysicsConstraintAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
    
    inline def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
    
    inline def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
  }
}
