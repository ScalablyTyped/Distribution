package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFaqRequest extends js.Object {
  /**
    * The identifier of the FAQ to remove.
    */
  var Id: FaqId = js.native
  /**
    * The index to remove the FAQ from.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}

object DeleteFaqRequest {
  @scala.inline
  def apply(Id: FaqId, IndexId: IndexId): DeleteFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFaqRequest]
  }
}

