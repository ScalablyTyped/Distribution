package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeysAndCertificateRequest extends js.Object {
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}

object CreateKeysAndCertificateRequest {
  @scala.inline
  def apply(setAsActive: js.UndefOr[scala.Boolean] = js.undefined): CreateKeysAndCertificateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeysAndCertificateRequest]
  }
}

