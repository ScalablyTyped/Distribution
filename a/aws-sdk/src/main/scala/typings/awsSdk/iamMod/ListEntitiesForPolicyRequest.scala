package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesForPolicyRequest extends StObject {
  
  /**
    * The entity type to use for filtering the results. For example, when EntityFilter is Role, only the roles that are attached to the specified policy are returned. This parameter is optional. If it is not included, all attached entities (users, groups, and roles) are returned. The argument for this parameter must be one of the valid values listed below.
    */
  var EntityFilter: js.UndefOr[EntityType] = js.undefined
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  
  /**
    * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all entities. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var PathPrefix: js.UndefOr[pathType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy for which you want the versions. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
  
  /**
    * The policy usage method to use for filtering the results. To list only permissions policies, set PolicyUsageFilter to PermissionsPolicy. To list only the policies used to set permissions boundaries, set the value to PermissionsBoundary. This parameter is optional. If it is not included, all policies are returned. 
    */
  var PolicyUsageFilter: js.UndefOr[PolicyUsageType] = js.undefined
}
object ListEntitiesForPolicyRequest {
  
  @scala.inline
  def apply(PolicyArn: arnType): ListEntitiesForPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesForPolicyRequest]
  }
  
  @scala.inline
  implicit class ListEntitiesForPolicyRequestMutableBuilder[Self <: ListEntitiesForPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityFilter(value: EntityType): Self = StObject.set(x, "EntityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "EntityFilter", js.undefined)
    
    @scala.inline
    def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: maxItemsType): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setPathPrefix(value: pathType): Self = StObject.set(x, "PathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPrefixUndefined: Self = StObject.set(x, "PathPrefix", js.undefined)
    
    @scala.inline
    def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUsageFilter(value: PolicyUsageType): Self = StObject.set(x, "PolicyUsageFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUsageFilterUndefined: Self = StObject.set(x, "PolicyUsageFilter", js.undefined)
  }
}
