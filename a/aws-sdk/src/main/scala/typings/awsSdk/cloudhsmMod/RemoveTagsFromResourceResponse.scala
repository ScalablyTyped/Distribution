package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String = js.native
}

object RemoveTagsFromResourceResponse {
  @scala.inline
  def apply(Status: String): RemoveTagsFromResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceResponse]
  }
}

