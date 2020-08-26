package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningProfileParameter extends js.Object {
  /**
    * Certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The location of the code-signing certificate on your device.
    */
  var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.native
  /**
    * The hardware platform of your device.
    */
  var platform: js.UndefOr[Platform] = js.native
}

object SigningProfileParameter {
  @scala.inline
  def apply(): SigningProfileParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfileParameter]
  }
  @scala.inline
  implicit class SigningProfileParameterOps[Self <: SigningProfileParameter] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: CertificateArn): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificatePathOnDevice(value: CertificatePathOnDevice): Self = this.set("certificatePathOnDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePathOnDevice: Self = this.set("certificatePathOnDevice", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
  
}

