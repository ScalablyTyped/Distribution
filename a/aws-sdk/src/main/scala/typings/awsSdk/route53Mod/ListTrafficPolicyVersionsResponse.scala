package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficPolicyVersionsResponse extends js.Object {
  
  /**
    * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicyVersions request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the ListTrafficPolicyVersions request that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * A list that contains one TrafficPolicy element for each traffic policy version that is associated with the specified traffic policy.
    */
  var TrafficPolicies: typings.awsSdk.route53Mod.TrafficPolicies = js.native
  
  /**
    * If IsTruncated is true, the value of TrafficPolicyVersionMarker identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call ListTrafficPolicyVersions again and specify the value of TrafficPolicyVersionMarker in the TrafficPolicyVersionMarker request parameter. This element is present only if IsTruncated is true.
    */
  var TrafficPolicyVersionMarker: typings.awsSdk.route53Mod.TrafficPolicyVersionMarker = js.native
}
object ListTrafficPolicyVersionsResponse {
  
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicies: TrafficPolicies,
    TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
  ): ListTrafficPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicies = TrafficPolicies.asInstanceOf[js.Any], TrafficPolicyVersionMarker = TrafficPolicyVersionMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTrafficPolicyVersionsResponseOps[Self <: ListTrafficPolicyVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setIsTruncated(value: PageTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPoliciesVarargs(value: TrafficPolicy*): Self = this.set("TrafficPolicies", js.Array(value :_*))
    
    @scala.inline
    def setTrafficPolicies(value: TrafficPolicies): Self = this.set("TrafficPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyVersionMarker(value: TrafficPolicyVersionMarker): Self = this.set("TrafficPolicyVersionMarker", value.asInstanceOf[js.Any])
  }
}
