package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateExtendedKeyUsage extends StObject {
  
  /**
    * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An object identifier (OID) for the extension value. The format is numbers separated by periods.
    */
  var OId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateExtendedKeyUsage {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateExtendedKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateExtendedKeyUsage]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateExtendedKeyUsageMutableBuilder[Self <: AwsCertificateManagerCertificateExtendedKeyUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOId(value: NonEmptyString): Self = StObject.set(x, "OId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOIdUndefined: Self = StObject.set(x, "OId", js.undefined)
  }
}
