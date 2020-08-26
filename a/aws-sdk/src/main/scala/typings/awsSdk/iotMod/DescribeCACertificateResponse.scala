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
  def apply(): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
  @scala.inline
  implicit class DescribeCACertificateResponseOps[Self <: DescribeCACertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateDescription(value: CACertificateDescription): Self = this.set("certificateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateDescription: Self = this.set("certificateDescription", js.undefined)
    @scala.inline
    def setRegistrationConfig(value: RegistrationConfig): Self = this.set("registrationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationConfig: Self = this.set("registrationConfig", js.undefined)
  }
  
}

