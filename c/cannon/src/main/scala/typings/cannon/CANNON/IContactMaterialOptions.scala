package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactMaterialOptions extends StObject {
  
  var contactEquationRelaxation: js.UndefOr[Double] = js.native
  
  var contactEquationStiffness: js.UndefOr[Double] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var frictionEquationRelaxation: js.UndefOr[Double] = js.native
  
  var frictionEquationStiffness: js.UndefOr[Double] = js.native
  
  var restitution: js.UndefOr[Double] = js.native
}
object IContactMaterialOptions {
  
  @scala.inline
  def apply(): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContactMaterialOptions]
  }
  
  @scala.inline
  implicit class IContactMaterialOptionsMutableBuilder[Self <: IContactMaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactEquationRelaxation(value: Double): Self = StObject.set(x, "contactEquationRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEquationRelaxationUndefined: Self = StObject.set(x, "contactEquationRelaxation", js.undefined)
    
    @scala.inline
    def setContactEquationStiffness(value: Double): Self = StObject.set(x, "contactEquationStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEquationStiffnessUndefined: Self = StObject.set(x, "contactEquationStiffness", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationRelaxation(value: Double): Self = StObject.set(x, "frictionEquationRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationRelaxationUndefined: Self = StObject.set(x, "frictionEquationRelaxation", js.undefined)
    
    @scala.inline
    def setFrictionEquationStiffness(value: Double): Self = StObject.set(x, "frictionEquationStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionEquationStiffnessUndefined: Self = StObject.set(x, "frictionEquationStiffness", js.undefined)
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}
