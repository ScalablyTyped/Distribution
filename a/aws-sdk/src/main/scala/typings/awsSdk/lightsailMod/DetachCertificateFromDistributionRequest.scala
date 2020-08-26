package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachCertificateFromDistributionRequest extends js.Object {
  /**
    * The name of the distribution from which to detach the certificate. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName = js.native
}

object DetachCertificateFromDistributionRequest {
  @scala.inline
  def apply(distributionName: ResourceName): DetachCertificateFromDistributionRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachCertificateFromDistributionRequest]
  }
  @scala.inline
  implicit class DetachCertificateFromDistributionRequestOps[Self <: DetachCertificateFromDistributionRequest] (val x: Self) extends AnyVal {
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
    def setDistributionName(value: ResourceName): Self = this.set("distributionName", value.asInstanceOf[js.Any])
  }
  
}

