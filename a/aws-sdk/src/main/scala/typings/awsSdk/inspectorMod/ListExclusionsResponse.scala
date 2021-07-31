package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExclusionsResponse extends StObject {
  
  /**
    * A list of exclusions' ARNs returned by the action.
    */
  var exclusionArns: ListReturnedArnList
  
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExclusionsResponse {
  
  @scala.inline
  def apply(exclusionArns: ListReturnedArnList): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExclusionsResponse]
  }
  
  @scala.inline
  implicit class ListExclusionsResponseMutableBuilder[Self <: ListExclusionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusionArns(value: ListReturnedArnList): Self = StObject.set(x, "exclusionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionArnsVarargs(value: Arn*): Self = StObject.set(x, "exclusionArns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
