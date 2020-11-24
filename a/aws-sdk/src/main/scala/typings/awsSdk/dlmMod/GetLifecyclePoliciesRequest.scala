package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePoliciesRequest extends js.Object {
  
  /**
    * The identifiers of the data lifecycle policies.
    */
  var PolicyIds: js.UndefOr[PolicyIdList] = js.native
  
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.native
  
  /**
    * The activation state.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  
  /**
    * The tags to add to objects created by the policy. Tags are strings in the format key=value. These user-defined tags are added in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.native
  
  /**
    * The target tag for a policy. Tags are strings in the format key=value.
    */
  var TargetTags: js.UndefOr[TargetTagsFilterList] = js.native
}
object GetLifecyclePoliciesRequest {
  
  @scala.inline
  def apply(): GetLifecyclePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesRequest]
  }
  
  @scala.inline
  implicit class GetLifecyclePoliciesRequestOps[Self <: GetLifecyclePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyIdsVarargs(value: PolicyId*): Self = this.set("PolicyIds", js.Array(value :_*))
    
    @scala.inline
    def setPolicyIds(value: PolicyIdList): Self = this.set("PolicyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyIds: Self = this.set("PolicyIds", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceTypeValues*): Self = this.set("ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypeValuesList): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
    
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsToAddVarargs(value: TagFilter*): Self = this.set("TagsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setTagsToAdd(value: TagsToAddFilterList): Self = this.set("TagsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsToAdd: Self = this.set("TagsToAdd", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: TagFilter*): Self = this.set("TargetTags", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: TargetTagsFilterList): Self = this.set("TargetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTags: Self = this.set("TargetTags", js.undefined)
  }
}
