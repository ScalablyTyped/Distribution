package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupDetail extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * A list of the managed policies attached to the group.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.undefined
  
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.undefined
  
  /**
    * A list of the inline policies embedded in the group.
    */
  var GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined
  
  /**
    * The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
}
object GroupDetail {
  
  inline def apply(): GroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupDetail]
  }
  
  extension [Self <: GroupDetail](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    inline def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value :_*))
    
    inline def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setGroupId(value: idType): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setGroupPolicyList(value: policyDetailListType): Self = StObject.set(x, "GroupPolicyList", value.asInstanceOf[js.Any])
    
    inline def setGroupPolicyListUndefined: Self = StObject.set(x, "GroupPolicyList", js.undefined)
    
    inline def setGroupPolicyListVarargs(value: PolicyDetail*): Self = StObject.set(x, "GroupPolicyList", js.Array(value :_*))
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
