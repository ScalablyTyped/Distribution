package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchCustomFieldParams extends StObject {
  
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
}
object PatchCustomFieldParams {
  
  @scala.inline
  def apply(): PatchCustomFieldParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldParams]
  }
  
  @scala.inline
  implicit class PatchCustomFieldParamsMutableBuilder[Self <: PatchCustomFieldParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableIssueTypes(value: js.Array[Double]): Self = StObject.set(x, "applicableIssueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableIssueTypesUndefined: Self = StObject.set(x, "applicableIssueTypes", js.undefined)
    
    @scala.inline
    def setApplicableIssueTypesVarargs(value: Double*): Self = StObject.set(x, "applicableIssueTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
