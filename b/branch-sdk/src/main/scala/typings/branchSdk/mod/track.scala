package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "track")
@js.native
object track extends js.Object {
  def apply(event: String): Unit = js.native
  def apply(event: String, metadata: js.Object): Unit = js.native
  def apply(event: String, metadata: js.Object, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
}

