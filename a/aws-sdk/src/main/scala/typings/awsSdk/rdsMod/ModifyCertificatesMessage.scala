package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCertificatesMessage extends StObject {
  
  /**
    * The new default certificate identifier to override the current one with. To determine the valid values, use the describe-certificates AWS CLI command or the DescribeCertificates API operation.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether to remove the override for the default certificate. If the override is removed, the default certificate is the system default.
    */
  var RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.native
}
object ModifyCertificatesMessage {
  
  @scala.inline
  def apply(): ModifyCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesMessage]
  }
  
  @scala.inline
  implicit class ModifyCertificatesMessageMutableBuilder[Self <: ModifyCertificatesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setRemoveCustomerOverride(value: BooleanOptional): Self = StObject.set(x, "RemoveCustomerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCustomerOverrideUndefined: Self = StObject.set(x, "RemoveCustomerOverride", js.undefined)
  }
}
