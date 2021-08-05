package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOfResourceInput extends StObject {
  
  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
    */
  var ResourceArn: ResourceArnString
}
object ListTagsOfResourceInput {
  
  inline def apply(ResourceArn: ResourceArnString): ListTagsOfResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsOfResourceInput]
  }
  
  extension [Self <: ListTagsOfResourceInput](x: Self) {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
