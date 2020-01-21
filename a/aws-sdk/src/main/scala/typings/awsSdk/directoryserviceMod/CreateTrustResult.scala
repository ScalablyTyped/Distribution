package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrustResult extends js.Object {
  /**
    * A unique identifier for the trust relationship that was created.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}

object CreateTrustResult {
  @scala.inline
  def apply(TrustId: TrustId = null): CreateTrustResult = {
    val __obj = js.Dynamic.literal()
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustResult]
  }
}

