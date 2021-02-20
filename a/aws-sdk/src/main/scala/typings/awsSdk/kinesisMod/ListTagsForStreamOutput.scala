package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForStreamOutput extends StObject {
  
  /**
    * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
    */
  var HasMoreTags: BooleanObject = js.native
  
  /**
    * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
    */
  var Tags: TagList = js.native
}
object ListTagsForStreamOutput {
  
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: TagList): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  
  @scala.inline
  implicit class ListTagsForStreamOutputMutableBuilder[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreTags(value: BooleanObject): Self = StObject.set(x, "HasMoreTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
