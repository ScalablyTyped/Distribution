package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePoliciesRequest extends StObject {
  
  /**
    * The identifiers of the data lifecycle policies.
    */
  var PolicyIds: js.UndefOr[PolicyIdList] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
  
  /**
    * The activation state.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
  
  /**
    * The tags to add to objects created by the policy. Tags are strings in the format key=value. These user-defined tags are added in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.undefined
  
  /**
    * The target tag for a policy. Tags are strings in the format key=value.
    */
  var TargetTags: js.UndefOr[TargetTagsFilterList] = js.undefined
}
object GetLifecyclePoliciesRequest {
  
  @scala.inline
  def apply(): GetLifecyclePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLifecyclePoliciesRequest]
  }
  
  @scala.inline
  implicit class GetLifecyclePoliciesRequestMutableBuilder[Self <: GetLifecyclePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyIds(value: PolicyIdList): Self = StObject.set(x, "PolicyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdsUndefined: Self = StObject.set(x, "PolicyIds", js.undefined)
    
    @scala.inline
    def setPolicyIdsVarargs(value: PolicyId*): Self = StObject.set(x, "PolicyIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypeValuesList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceTypeValues*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setState(value: GettablePolicyStateValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTagsToAdd(value: TagsToAddFilterList): Self = StObject.set(x, "TagsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToAddUndefined: Self = StObject.set(x, "TagsToAdd", js.undefined)
    
    @scala.inline
    def setTagsToAddVarargs(value: TagFilter*): Self = StObject.set(x, "TagsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: TargetTagsFilterList): Self = StObject.set(x, "TargetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTagsUndefined: Self = StObject.set(x, "TargetTags", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: TagFilter*): Self = StObject.set(x, "TargetTags", js.Array(value :_*))
  }
}
