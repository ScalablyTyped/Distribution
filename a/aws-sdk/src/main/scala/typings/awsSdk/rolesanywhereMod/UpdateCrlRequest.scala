package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCrlRequest extends StObject {
  
  /**
    * The x509 v3 specified certificate revocation list
    */
  var crlData: js.UndefOr[UpdateCrlRequestCrlDataBlob] = js.undefined
  
  /**
    * The unique identifier of the certificate revocation list (CRL).
    */
  var crlId: Uuid
  
  /**
    * The name of the Crl.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}
object UpdateCrlRequest {
  
  inline def apply(crlId: Uuid): UpdateCrlRequest = {
    val __obj = js.Dynamic.literal(crlId = crlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrlRequest]
  }
  
  extension [Self <: UpdateCrlRequest](x: Self) {
    
    inline def setCrlData(value: UpdateCrlRequestCrlDataBlob): Self = StObject.set(x, "crlData", value.asInstanceOf[js.Any])
    
    inline def setCrlDataUndefined: Self = StObject.set(x, "crlData", js.undefined)
    
    inline def setCrlId(value: Uuid): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
