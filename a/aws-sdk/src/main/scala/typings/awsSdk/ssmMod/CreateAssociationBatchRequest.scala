package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationBatchRequest extends js.Object {
  /**
    * One or more associations.
    */
  var Entries: CreateAssociationBatchRequestEntries = js.native
}

object CreateAssociationBatchRequest {
  @scala.inline
  def apply(Entries: CreateAssociationBatchRequestEntries): CreateAssociationBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAssociationBatchRequest]
  }
}

