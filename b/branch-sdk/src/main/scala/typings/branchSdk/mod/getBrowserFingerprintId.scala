package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "getBrowserFingerprintId")
@js.native
object getBrowserFingerprintId extends js.Object {
  
  def apply(callback: js.Function2[/* err */ BranchError, /* browser_fingerprint */ FingerprintResponse, Unit]): Unit = js.native
}
