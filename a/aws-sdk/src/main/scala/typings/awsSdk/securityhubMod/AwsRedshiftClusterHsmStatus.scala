package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterHsmStatus extends StObject {
  
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
  implicit class AwsRedshiftClusterHsmStatusMutableBuilder[Self <: AwsRedshiftClusterHsmStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: NonEmptyString): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificateIdentifierUndefined: Self = StObject.set(x, "HsmClientCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: NonEmptyString): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmConfigurationIdentifierUndefined: Self = StObject.set(x, "HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
