package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareInvitationsRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the invitations.
    */
  var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
}
object GetResourceShareInvitationsRequest {
  
  inline def apply(): GetResourceShareInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsRequest]
  }
  
  extension [Self <: GetResourceShareInvitationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value :_*))
    
    inline def setResourceShareInvitationArns(value: ResourceShareInvitationArnList): Self = StObject.set(x, "resourceShareInvitationArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationArnsUndefined: Self = StObject.set(x, "resourceShareInvitationArns", js.undefined)
    
    inline def setResourceShareInvitationArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareInvitationArns", js.Array(value :_*))
  }
}
