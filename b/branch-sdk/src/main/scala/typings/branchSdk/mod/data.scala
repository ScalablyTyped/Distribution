package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "data")
@js.native
object data extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]): Unit = js.native
}

