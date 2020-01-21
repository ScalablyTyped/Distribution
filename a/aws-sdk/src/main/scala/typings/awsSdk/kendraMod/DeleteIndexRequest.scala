package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIndexRequest extends js.Object {
  /**
    * The identifier of the index to delete.
    */
  var Id: IndexId = js.native
}

object DeleteIndexRequest {
  @scala.inline
  def apply(Id: IndexId): DeleteIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIndexRequest]
  }
}

