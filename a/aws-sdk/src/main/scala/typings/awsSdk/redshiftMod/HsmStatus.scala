package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HsmStatus extends StObject {
  
  /**
    * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Reports whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a modify cluster command. Values: active, applying
    */
  var Status: js.UndefOr[String] = js.undefined
}
object HsmStatus {
  
  @scala.inline
  def apply(): HsmStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmStatus]
  }
  
  @scala.inline
  implicit class HsmStatusMutableBuilder[Self <: HsmStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificateIdentifierUndefined: Self = StObject.set(x, "HsmClientCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmConfigurationIdentifierUndefined: Self = StObject.set(x, "HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
