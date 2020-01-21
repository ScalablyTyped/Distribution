package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyTrustRequest extends js.Object {
  /**
    * The unique Trust ID of the trust relationship to verify.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId = js.native
}

object VerifyTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): VerifyTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyTrustRequest]
  }
}

