package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    *  Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ARN: ARN): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
}

