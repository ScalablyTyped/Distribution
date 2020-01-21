package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLedgersResponse extends js.Object {
  /**
    * The array of ledger summaries that are associated with the current AWS account and Region.
    */
  var Ledgers: js.UndefOr[LedgerList] = js.native
  /**
    * A pagination token, indicating whether there are more results available:   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListLedgers call.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
}

object ListLedgersResponse {
  @scala.inline
  def apply(Ledgers: LedgerList = null, NextToken: NextToken = null): ListLedgersResponse = {
    val __obj = js.Dynamic.literal()
    if (Ledgers != null) __obj.updateDynamic("Ledgers")(Ledgers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLedgersResponse]
  }
}

