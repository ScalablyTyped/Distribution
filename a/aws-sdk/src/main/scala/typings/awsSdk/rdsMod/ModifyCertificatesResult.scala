package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCertificatesResult extends js.Object {
  var Certificate: js.UndefOr[typings.awsSdk.rdsMod.Certificate] = js.native
}

object ModifyCertificatesResult {
  @scala.inline
  def apply(Certificate: Certificate = null): ModifyCertificatesResult = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCertificatesResult]
  }
}

