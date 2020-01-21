package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsModel extends js.Object {
  /**
    * A string-to-string map of key-value pairs that defines the tags for an application, campaign, journey, message template, or segment. Each of these resources can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: MapOfString = js.native
}

object TagsModel {
  @scala.inline
  def apply(tags: MapOfString): TagsModel = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsModel]
  }
}

