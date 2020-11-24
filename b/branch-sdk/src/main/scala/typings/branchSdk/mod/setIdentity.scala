package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "setIdentity")
@js.native
object setIdentity extends js.Object {
  
  def apply(identity: String): Unit = js.native
  def apply(
    identity: String,
    callback: js.Function2[/* err */ BranchError, /* data */ IdentityCallbackData | Null, Unit]
  ): Unit = js.native
}
