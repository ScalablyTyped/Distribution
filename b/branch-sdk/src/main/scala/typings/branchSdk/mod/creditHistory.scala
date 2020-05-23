package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "creditHistory")
@js.native
object creditHistory extends js.Object {
  def apply(
    options: CreditHistoryOptions,
    callback: js.Function2[/* err */ BranchError, /* data */ CreditHistoryCallbackResponse, Unit]
  ): Unit = js.native
}

