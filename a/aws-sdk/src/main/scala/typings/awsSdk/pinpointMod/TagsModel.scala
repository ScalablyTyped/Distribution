package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsModel extends StObject {
  
  /**
    * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template, or segment. Each of these resources can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: MapOfString
}
object TagsModel {
  
  @scala.inline
  def apply(tags: MapOfString): TagsModel = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsModel]
  }
  
  @scala.inline
  implicit class TagsModelMutableBuilder[Self <: TagsModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
