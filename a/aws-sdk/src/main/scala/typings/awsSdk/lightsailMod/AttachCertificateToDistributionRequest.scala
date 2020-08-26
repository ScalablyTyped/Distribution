package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachCertificateToDistributionRequest extends js.Object {
  /**
    * The name of the certificate to attach to a distribution. Only certificates with a status of ISSUED can be attached to a distribution. Use the GetCertificates action to get a list of certificate names that you can specify.  This is the name of the certificate resource type and is used only to reference the certificate in other API actions. It can be different than the domain name of the certificate. For example, your certificate name might be WordPress-Blog-Certificate and the domain name of the certificate might be example.com. 
    */
  var certificateName: ResourceName = js.native
  /**
    * The name of the distribution that the certificate will be attached to. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName = js.native
}

object AttachCertificateToDistributionRequest {
  @scala.inline
  def apply(certificateName: ResourceName, distributionName: ResourceName): AttachCertificateToDistributionRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachCertificateToDistributionRequest]
  }
  @scala.inline
  implicit class AttachCertificateToDistributionRequestOps[Self <: AttachCertificateToDistributionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateName(value: ResourceName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
  }
  
}

