package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCustomFieldParams extends js.Object {
  
  var applicableIssueTypes: js.UndefOr[js.Array[Double]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var typeId: FieldType = js.native
}
object PostCustomFieldParams {
  
  @scala.inline
  def apply(name: String, typeId: FieldType): PostCustomFieldParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldParams]
  }
  
  @scala.inline
  implicit class PostCustomFieldParamsOps[Self <: PostCustomFieldParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeId(value: FieldType): Self = this.set("typeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableIssueTypesVarargs(value: Double*): Self = this.set("applicableIssueTypes", js.Array(value :_*))
    
    @scala.inline
    def setApplicableIssueTypes(value: js.Array[Double]): Self = this.set("applicableIssueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableIssueTypes: Self = this.set("applicableIssueTypes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
