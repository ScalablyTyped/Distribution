package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLedgerRequest extends js.Object {
  /**
    * The name of the ledger that you want to delete.
    */
  var Name: LedgerName = js.native
}

object DeleteLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName): DeleteLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLedgerRequest]
  }
}

