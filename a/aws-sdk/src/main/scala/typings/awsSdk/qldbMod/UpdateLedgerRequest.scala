package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLedgerRequest extends js.Object {
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.qldbMod.DeletionProtection] = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object UpdateLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName, DeletionProtection: js.UndefOr[Boolean] = js.undefined): UpdateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLedgerRequest]
  }
}

