package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsMassProperties extends StObject {
  
  /**
    * The center of mass, in local space. This is The
    * point the body will rotate around when applying
    * an angular velocity.
    *
    * If not provided, the physics engine will compute
    * an appropriate value.
    */
  var centerOfMass: js.UndefOr[Vector3] = js.undefined
  
  /**
    * The principal moments of inertia of this object
    * for a unit mass. This determines how easy it is
    * for the body to rotate. A value of zero on any
    * axis will be used as infinite interia about that
    * axis.
    *
    * If not provided, the physics engine will compute
    * an appropriate value.
    */
  var inertia: js.UndefOr[Vector3] = js.undefined
  
  /**
    * The rotation rotating from inertia major axis space
    * to parent space (i.e., the rotation which, when
    * applied to the 3x3 inertia tensor causes the inertia
    * tensor to become a diagonal matrix). This determines
    * how the values of inertia are aligned with the parent
    * object.
    *
    * If not provided, the physics engine will compute
    * an appropriate value.
    */
  var inertiaOrientation: js.UndefOr[Quaternion] = js.undefined
  
  /**
    * The total mass of this object, in kilograms. This
    * affects how easy it is to move the body. A value
    * of zero will be used as an infinite mass.
    *
    * If not provided, the physics engine will compute
    * an appropriate value.
    */
  var mass: js.UndefOr[Double] = js.undefined
}
object PhysicsMassProperties {
  
  inline def apply(): PhysicsMassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsMassProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsMassProperties] (val x: Self) extends AnyVal {
    
    inline def setCenterOfMass(value: Vector3): Self = StObject.set(x, "centerOfMass", value.asInstanceOf[js.Any])
    
    inline def setCenterOfMassUndefined: Self = StObject.set(x, "centerOfMass", js.undefined)
    
    inline def setInertia(value: Vector3): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaOrientation(value: Quaternion): Self = StObject.set(x, "inertiaOrientation", value.asInstanceOf[js.Any])
    
    inline def setInertiaOrientationUndefined: Self = StObject.set(x, "inertiaOrientation", js.undefined)
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
  }
}
