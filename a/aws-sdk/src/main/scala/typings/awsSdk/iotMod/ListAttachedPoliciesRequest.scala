package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttachedPoliciesRequest extends js.Object {
  
  /**
    * The token to retrieve the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  
  /**
    * The maximum number of results to be returned per request.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * When true, recursively list attached policies.
    */
  var recursive: js.UndefOr[Recursive] = js.native
  
  /**
    * The group or principal for which the policies will be listed. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var target: PolicyTarget = js.native
}
object ListAttachedPoliciesRequest {
  
  @scala.inline
  def apply(target: PolicyTarget): ListAttachedPoliciesRequest = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListAttachedPoliciesRequestOps[Self <: ListAttachedPoliciesRequest] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: PolicyTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setRecursive(value: Recursive): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
