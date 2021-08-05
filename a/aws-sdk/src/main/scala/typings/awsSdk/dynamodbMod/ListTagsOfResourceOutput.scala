package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsOfResourceOutput extends StObject {
  
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsOfResourceOutput {
  
  inline def apply(): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
  
  extension [Self <: ListTagsOfResourceOutput](x: Self) {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
