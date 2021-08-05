package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * Specifies the number of tags to return as a response to the ListTagsForResource request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.undefined
  
  /**
    * When you request additional results from the ListTagsForResource operation, a NextToken parameter is returned in the input. You can then pass in a subsequent command to the NextToken parameter to continue listing additional tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
}
object ListTagsForResourceRequest {
  
  inline def apply(Arn: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
