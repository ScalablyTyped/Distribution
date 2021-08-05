package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateKeyUsage extends StObject {
  
  /**
    * The key usage extension name.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateKeyUsage {
  
  inline def apply(): AwsCertificateManagerCertificateKeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateKeyUsage]
  }
  
  extension [Self <: AwsCertificateManagerCertificateKeyUsage](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
