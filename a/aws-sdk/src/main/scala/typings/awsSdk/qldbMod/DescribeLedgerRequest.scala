package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLedgerRequest extends js.Object {
  /**
    * The name of the ledger that you want to describe.
    */
  var Name: LedgerName = js.native
}

object DescribeLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName): DescribeLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLedgerRequest]
  }
}

