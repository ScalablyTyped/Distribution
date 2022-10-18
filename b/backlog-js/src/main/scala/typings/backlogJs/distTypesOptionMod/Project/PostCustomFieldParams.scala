package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCustomFieldParams extends StObject {
  
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var typeId: FieldType
}
object PostCustomFieldParams {
  
  inline def apply(name: String, typeId: FieldType): PostCustomFieldParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldParams]
  }
  
  extension [Self <: PostCustomFieldParams](x: Self) {
    
    inline def setApplicableIssueTypes(value: js.Array[Double]): Self = StObject.set(x, "applicableIssueTypes", value.asInstanceOf[js.Any])
    
    inline def setApplicableIssueTypesUndefined: Self = StObject.set(x, "applicableIssueTypes", js.undefined)
    
    inline def setApplicableIssueTypesVarargs(value: Double*): Self = StObject.set(x, "applicableIssueTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTypeId(value: FieldType): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
