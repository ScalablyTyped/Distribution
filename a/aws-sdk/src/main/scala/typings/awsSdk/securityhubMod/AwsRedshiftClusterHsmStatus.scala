package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterHsmStatus extends js.Object {
  
  /**
    * The name of the HSM client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys that are stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a modify cluster command. Type: String Valid values: active | applying 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterHsmStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterHsmStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterHsmStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterHsmStatusOps[Self <: AwsRedshiftClusterHsmStatus] (val x: Self) extends AnyVal {
    
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
    def setHsmClientCertificateIdentifier(value: NonEmptyString): Self = this.set("HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmClientCertificateIdentifier: Self = this.set("HsmClientCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: NonEmptyString): Self = this.set("HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmConfigurationIdentifier: Self = this.set("HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
