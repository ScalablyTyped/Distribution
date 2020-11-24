package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceShareInvitationsRequest extends js.Object {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the invitations.
    */
  var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.native
}
object GetResourceShareInvitationsRequest {
  
  @scala.inline
  def apply(): GetResourceShareInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsRequest]
  }
  
  @scala.inline
  implicit class GetResourceShareInvitationsRequestOps[Self <: GetResourceShareInvitationsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = this.set("resourceShareArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = this.set("resourceShareArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareArns: Self = this.set("resourceShareArns", js.undefined)
    
    @scala.inline
    def setResourceShareInvitationArnsVarargs(value: String*): Self = this.set("resourceShareInvitationArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceShareInvitationArns(value: ResourceShareInvitationArnList): Self = this.set("resourceShareInvitationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareInvitationArns: Self = this.set("resourceShareInvitationArns", js.undefined)
  }
}
