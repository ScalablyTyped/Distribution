package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAttributesToFindingsRequest extends js.Object {
  
  /**
    * The array of attributes that you want to assign to specified findings.
    */
  var attributes: UserAttributeList = js.native
  
  /**
    * The ARNs that specify the findings that you want to assign attributes to.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}
object AddAttributesToFindingsRequest {
  
  @scala.inline
  def apply(attributes: UserAttributeList, findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttributesToFindingsRequest]
  }
  
  @scala.inline
  implicit class AddAttributesToFindingsRequestOps[Self <: AddAttributesToFindingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: UserAttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingArnsVarargs(value: Arn*): Self = this.set("findingArns", js.Array(value :_*))
    
    @scala.inline
    def setFindingArns(value: AddRemoveAttributesFindingArnList): Self = this.set("findingArns", value.asInstanceOf[js.Any])
  }
}
