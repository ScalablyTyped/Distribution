package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsInput extends StObject {
  
  /**
    * Maximum number of tags to return.
    */
  var MaxResults: js.UndefOr[ListTagsMaxResults] = js.native
  
  /**
    *  If the response to the previous ListTags request is truncated, Amazon SageMaker returns this token. To retrieve the next set of tags, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
    */
  var ResourceArn: typings.awsSdk.sagemakerMod.ResourceArn = js.native
}
object ListTagsInput {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsInput]
  }
  
  @scala.inline
  implicit class ListTagsInputMutableBuilder[Self <: ListTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListTagsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
