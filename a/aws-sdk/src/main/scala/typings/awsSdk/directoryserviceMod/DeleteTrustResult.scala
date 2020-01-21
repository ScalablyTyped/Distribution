package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrustResult extends js.Object {
  /**
    * The Trust ID of the trust relationship that was deleted.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}

object DeleteTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): DeleteTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustResult]
  }
}

