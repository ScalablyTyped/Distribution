package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsRequest extends js.Object {
  /**
    * Specifies the ARN for the Elasticsearch domain from which you want to delete the specified tags.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
  /**
    * Specifies the TagKey list which you want to remove from the Elasticsearch domain.
    */
  var TagKeys: StringList = js.native
}

object RemoveTagsRequest {
  @scala.inline
  def apply(ARN: ARN, TagKeys: StringList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsRequest]
  }
}

