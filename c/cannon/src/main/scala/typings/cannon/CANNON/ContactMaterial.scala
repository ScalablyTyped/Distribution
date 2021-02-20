package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactMaterial extends StObject {
  
  var contactEquationRelaxation: Double = js.native
  
  var contactEquationStiffness: Double = js.native
  
  var friction: Double = js.native
  
  var frictionEquationRelaxation: Double = js.native
  
  var frictionEquationStiffness: Double = js.native
  
  var id: Double = js.native
  
  var materials: js.Array[Material] = js.native
  
  var restitution: Double = js.native
}
object ContactMaterial {
  
  @scala.inline
  def apply(
    contactEquationRelaxation: Double,
    contactEquationStiffness: Double,
    friction: Double,
    frictionEquationRelaxation: Double,
    frictionEquationStiffness: Double,
    id: Double,
    materials: js.Array[Material],
    restitution: Double
  ): ContactMaterial = {
    val __obj = js.Dynamic.literal(contactEquationRelaxation = contactEquationRelaxation.asInstanceOf[js.Any], contactEquationStiffness = contactEquationStiffness.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionEquationRelaxation = frictionEquationRelaxation.asInstanceOf[js.Any], frictionEquationStiffness = frictionEquationStiffness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMaterial]
  }
  
  @scala.inline
  implicit class ContactMaterialMutableBuilder[Self <: ContactMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactEquationRelaxation(value: Double): Self = StObject.set(x, "contactEquationRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEquationStiffness(value: Double): Self = StObject.set(x, "contactEquationStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationRelaxation(value: Double): Self = StObject.set(x, "frictionEquationRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationStiffness(value: Double): Self = StObject.set(x, "frictionEquationStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
  }
}
