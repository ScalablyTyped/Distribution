package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCertificatesResult extends StObject {
  
  var Certificate: js.UndefOr[typings.awsSdk.rdsMod.Certificate] = js.undefined
}
object ModifyCertificatesResult {
  
  inline def apply(): ModifyCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesResult]
  }
  
  extension [Self <: ModifyCertificatesResult](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
