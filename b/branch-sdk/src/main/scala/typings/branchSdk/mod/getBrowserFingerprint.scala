package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "getBrowserFingerprint")
@js.native
object getBrowserFingerprint extends js.Object {
  def apply(callback: js.Function2[/* err */ BranchError, /* browser_fingerprint */ FingerprintResponse, Unit]): Unit = js.native
}

