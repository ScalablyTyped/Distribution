package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCACertificateResponse extends js.Object {
  /**
    * The CA certificate description.
    */
  var certificateDescription: js.UndefOr[CACertificateDescription] = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
}

object DescribeCACertificateResponse {
  @scala.inline
  def apply(
    certificateDescription: CACertificateDescription = null,
    registrationConfig: RegistrationConfig = null
  ): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateDescription != null) __obj.updateDynamic("certificateDescription")(certificateDescription.asInstanceOf[js.Any])
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
}

