package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttributesFromFindingsRequest extends js.Object {
  
  /**
    * The array of attribute keys that you want to remove from specified findings.
    */
  var attributeKeys: UserAttributeKeyList = js.native
  
  /**
    * The ARNs that specify the findings that you want to remove attributes from.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}
object RemoveAttributesFromFindingsRequest {
  
  @scala.inline
  def apply(attributeKeys: UserAttributeKeyList, findingArns: AddRemoveAttributesFindingArnList): RemoveAttributesFromFindingsRequest = {
    val __obj = js.Dynamic.literal(attributeKeys = attributeKeys.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsRequest]
  }
  
  @scala.inline
  implicit class RemoveAttributesFromFindingsRequestOps[Self <: RemoveAttributesFromFindingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAttributeKeysVarargs(value: AttributeKey*): Self = this.set("attributeKeys", js.Array(value :_*))
    
    @scala.inline
    def setAttributeKeys(value: UserAttributeKeyList): Self = this.set("attributeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingArnsVarargs(value: Arn*): Self = this.set("findingArns", js.Array(value :_*))
    
    @scala.inline
    def setFindingArns(value: AddRemoveAttributesFindingArnList): Self = this.set("findingArns", value.asInstanceOf[js.Any])
  }
}
