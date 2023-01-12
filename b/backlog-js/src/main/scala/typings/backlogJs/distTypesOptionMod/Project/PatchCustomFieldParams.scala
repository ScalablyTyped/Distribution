package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchCustomFieldParams extends StObject {
  
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object PatchCustomFieldParams {
  
  inline def apply(): PatchCustomFieldParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchCustomFieldParams] (val x: Self) extends AnyVal {
    
    inline def setApplicableIssueTypes(value: js.Array[Double]): Self = StObject.set(x, "applicableIssueTypes", value.asInstanceOf[js.Any])
    
    inline def setApplicableIssueTypesUndefined: Self = StObject.set(x, "applicableIssueTypes", js.undefined)
    
    inline def setApplicableIssueTypesVarargs(value: Double*): Self = StObject.set(x, "applicableIssueTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
