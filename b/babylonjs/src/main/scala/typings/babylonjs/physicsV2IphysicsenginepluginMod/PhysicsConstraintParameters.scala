package typings.babylonjs.physicsV2IphysicsenginepluginMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsConstraintParameters extends StObject {
  
  /**
    * An axis in the space of the first body which determines how
    * distances/angles are measured for LINEAR_X/ANGULAR_X limits.
    */
  var axisA: js.UndefOr[Vector3] = js.undefined
  
  /**
    * An axis in the space of the second body which determines how
    * distances/angles are measured for LINEAR_X/ANGULAR_X limits.
    */
  var axisB: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Determines if the connected bodies should collide. Generally,
    * it is preferable to set this to false, especially if the constraint
    * positions the bodies so that they overlap. Otherwise, the constraint
    * will "fight" the collision detection and may cause jitter.
    */
  var collision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum distance that can seperate the two pivots.
    * Only used for DISTANCE constraints
    */
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * An axis in the space of the first body which determines how
    * distances/angles are measured for LINEAR_Y/ANGULAR_Y limits.
    */
  var perpAxisA: js.UndefOr[Vector3] = js.undefined
  
  /**
    * An axis in the space of the second body which determines how
    * distances/angles are measured for LINEAR_Y/ANGULAR_Y limits.
    */
  var perpAxisB: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Location of the constraint pivot in the space of first body
    */
  var pivotA: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Location of the constraint pivot in the space of the second body
    */
  var pivotB: js.UndefOr[Vector3] = js.undefined
}
object PhysicsConstraintParameters {
  
  inline def apply(): PhysicsConstraintParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsConstraintParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsConstraintParameters] (val x: Self) extends AnyVal {
    
    inline def setAxisA(value: Vector3): Self = StObject.set(x, "axisA", value.asInstanceOf[js.Any])
    
    inline def setAxisAUndefined: Self = StObject.set(x, "axisA", js.undefined)
    
    inline def setAxisB(value: Vector3): Self = StObject.set(x, "axisB", value.asInstanceOf[js.Any])
    
    inline def setAxisBUndefined: Self = StObject.set(x, "axisB", js.undefined)
    
    inline def setCollision(value: Boolean): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setPerpAxisA(value: Vector3): Self = StObject.set(x, "perpAxisA", value.asInstanceOf[js.Any])
    
    inline def setPerpAxisAUndefined: Self = StObject.set(x, "perpAxisA", js.undefined)
    
    inline def setPerpAxisB(value: Vector3): Self = StObject.set(x, "perpAxisB", value.asInstanceOf[js.Any])
    
    inline def setPerpAxisBUndefined: Self = StObject.set(x, "perpAxisB", js.undefined)
    
    inline def setPivotA(value: Vector3): Self = StObject.set(x, "pivotA", value.asInstanceOf[js.Any])
    
    inline def setPivotAUndefined: Self = StObject.set(x, "pivotA", js.undefined)
    
    inline def setPivotB(value: Vector3): Self = StObject.set(x, "pivotB", value.asInstanceOf[js.Any])
    
    inline def setPivotBUndefined: Self = StObject.set(x, "pivotB", js.undefined)
  }
}
