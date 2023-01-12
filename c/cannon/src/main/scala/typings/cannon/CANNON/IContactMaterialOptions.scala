package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContactMaterialOptions extends StObject {
  
  var contactEquationRelaxation: js.UndefOr[Double] = js.undefined
  
  var contactEquationStiffness: js.UndefOr[Double] = js.undefined
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var frictionEquationRelaxation: js.UndefOr[Double] = js.undefined
  
  var frictionEquationStiffness: js.UndefOr[Double] = js.undefined
  
  var restitution: js.UndefOr[Double] = js.undefined
}
object IContactMaterialOptions {
  
  inline def apply(): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContactMaterialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContactMaterialOptions] (val x: Self) extends AnyVal {
    
    inline def setContactEquationRelaxation(value: Double): Self = StObject.set(x, "contactEquationRelaxation", value.asInstanceOf[js.Any])
    
    inline def setContactEquationRelaxationUndefined: Self = StObject.set(x, "contactEquationRelaxation", js.undefined)
    
    inline def setContactEquationStiffness(value: Double): Self = StObject.set(x, "contactEquationStiffness", value.asInstanceOf[js.Any])
    
    inline def setContactEquationStiffnessUndefined: Self = StObject.set(x, "contactEquationStiffness", js.undefined)
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionEquationRelaxation(value: Double): Self = StObject.set(x, "frictionEquationRelaxation", value.asInstanceOf[js.Any])
    
    inline def setFrictionEquationRelaxationUndefined: Self = StObject.set(x, "frictionEquationRelaxation", js.undefined)
    
    inline def setFrictionEquationStiffness(value: Double): Self = StObject.set(x, "frictionEquationStiffness", value.asInstanceOf[js.Any])
    
    inline def setFrictionEquationStiffnessUndefined: Self = StObject.set(x, "frictionEquationStiffness", js.undefined)
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}
