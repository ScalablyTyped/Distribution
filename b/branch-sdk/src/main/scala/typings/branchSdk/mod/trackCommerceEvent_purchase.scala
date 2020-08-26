package typings.branchSdk.mod

import typings.branchSdk.branchSdkStrings.purchase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "trackCommerceEvent")
@js.native
object trackCommerceEvent_purchase extends js.Object {
  def apply(event: purchase, commerce_data: js.Object): Unit = js.native
  def apply(
    event: purchase,
    commerce_data: js.Object,
    metadata: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  def apply(event: purchase, commerce_data: js.Object, metadata: js.Object): Unit = js.native
  def apply(
    event: purchase,
    commerce_data: js.Object,
    metadata: js.Object,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
}

