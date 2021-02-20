package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResponse extends StObject {
  
  var TagsModel: typings.awsSdk.pinpointMod.TagsModel = js.native
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(TagsModel: TagsModel): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(TagsModel = TagsModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagsModel(value: TagsModel): Self = StObject.set(x, "TagsModel", value.asInstanceOf[js.Any])
  }
}
