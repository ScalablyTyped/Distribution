package typings.branchSdk.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "credits")
@js.native
object credits extends js.Object {
  def apply(callback: js.Function2[/* err */ BranchError, /* data */ Record[String, Double], Unit]): Unit = js.native
}

