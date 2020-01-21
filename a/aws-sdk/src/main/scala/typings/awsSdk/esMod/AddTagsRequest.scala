package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    *  Specify the ARN for which you want to add the tags.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
  /**
    *  List of Tag that need to be added for the Elasticsearch domain. 
    */
  var TagList: typings.awsSdk.esMod.TagList = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsRequest]
  }
}

