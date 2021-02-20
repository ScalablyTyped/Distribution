package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForStreamOutput extends StObject {
  
  /**
    * If you specify this parameter and the result of a ListTags call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  
  /**
    * A map of tag keys and values associated with the specified stream.
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}
object ListTagsForStreamOutput {
  
  @scala.inline
  def apply(): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  
  @scala.inline
  implicit class ListTagsForStreamOutputMutableBuilder[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: ResourceTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
