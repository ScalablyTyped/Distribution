package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyTrustResult extends js.Object {
  /**
    * The unique Trust ID of the trust relationship that was verified.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}

object VerifyTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): VerifyTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTrustResult]
  }
}

