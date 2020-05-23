package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterThingResponse extends js.Object {
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.native
}

object RegisterThingResponse {
  @scala.inline
  def apply(certificatePem: CertificatePem = null, resourceArns: ResourceArns = null): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterThingResponse]
  }
}

