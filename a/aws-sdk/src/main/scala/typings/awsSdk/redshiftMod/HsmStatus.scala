package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmStatus extends js.Object {
  /**
    * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  /**
    * Reports whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a modify cluster command. Values: active, applying
    */
  var Status: js.UndefOr[String] = js.native
}

object HsmStatus {
  @scala.inline
  def apply(): HsmStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmStatus]
  }
  @scala.inline
  implicit class HsmStatusOps[Self <: HsmStatus] (val x: Self) extends AnyVal {
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
    def setHsmClientCertificateIdentifier(value: String): Self = this.set("HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmClientCertificateIdentifier: Self = this.set("HsmClientCertificateIdentifier", js.undefined)
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = this.set("HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmConfigurationIdentifier: Self = this.set("HsmConfigurationIdentifier", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

