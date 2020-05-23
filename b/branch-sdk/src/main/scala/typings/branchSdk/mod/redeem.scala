package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "redeem")
@js.native
object redeem extends js.Object {
  def apply(amount: Double, bucket: String): Unit = js.native
  def apply(amount: Double, bucket: String, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
}

