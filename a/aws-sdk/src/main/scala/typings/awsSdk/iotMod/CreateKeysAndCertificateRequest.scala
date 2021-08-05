package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeysAndCertificateRequest extends StObject {
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
}
object CreateKeysAndCertificateRequest {
  
  inline def apply(): CreateKeysAndCertificateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateRequest]
  }
  
  extension [Self <: CreateKeysAndCertificateRequest](x: Self) {
    
    inline def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    inline def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
  }
}
