package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "init")
@js.native
object init extends js.Object {
  
  def apply(branch_key: String): Unit = js.native
  def apply(
    branch_key: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
  ): Unit = js.native
  def apply(branch_key: String, options: InitOptions): Unit = js.native
  def apply(
    branch_key: String,
    options: InitOptions,
    callback: js.Function2[/* err */ BranchError, /* data */ SessionData | Null, Unit]
  ): Unit = js.native
}
