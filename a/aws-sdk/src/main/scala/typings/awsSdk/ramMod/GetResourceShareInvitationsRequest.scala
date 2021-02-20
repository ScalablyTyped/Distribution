package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceShareInvitationsRequest extends StObject {
  
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
  implicit class GetResourceShareInvitationsRequestMutableBuilder[Self <: GetResourceShareInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    @scala.inline
    def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value :_*))
    
    @scala.inline
    def setResourceShareInvitationArns(value: ResourceShareInvitationArnList): Self = StObject.set(x, "resourceShareInvitationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareInvitationArnsUndefined: Self = StObject.set(x, "resourceShareInvitationArns", js.undefined)
    
    @scala.inline
    def setResourceShareInvitationArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareInvitationArns", js.Array(value :_*))
  }
}
