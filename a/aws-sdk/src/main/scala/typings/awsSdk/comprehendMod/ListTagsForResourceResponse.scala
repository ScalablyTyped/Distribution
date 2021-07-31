package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are querying.
    */
  var ResourceArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * Tags associated with the Amazon Comprehend resource being queried. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ComprehendArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
