package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HsmClientCertificate extends StObject {
  
  /**
    * The identifier of the HSM client certificate.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
    */
  var HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The list of tags for the HSM client certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object HsmClientCertificate {
  
  @scala.inline
  def apply(): HsmClientCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmClientCertificate]
  }
  
  @scala.inline
  implicit class HsmClientCertificateMutableBuilder[Self <: HsmClientCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificateIdentifierUndefined: Self = StObject.set(x, "HsmClientCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setHsmClientCertificatePublicKey(value: String): Self = StObject.set(x, "HsmClientCertificatePublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmClientCertificatePublicKeyUndefined: Self = StObject.set(x, "HsmClientCertificatePublicKey", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
