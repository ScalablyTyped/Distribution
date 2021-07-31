package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent API call to return the next page of the list. The ListTagsforResource call lists all available tags in one call and does not use pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The tags for the resource.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsForResourceOutput {
  
  @scala.inline
  def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceOutputMutableBuilder[Self <: ListTagsForResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
