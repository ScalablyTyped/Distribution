package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebsiteCertificateAuthorityResponse extends StObject {
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.undefined
}
object AssociateWebsiteCertificateAuthorityResponse {
  
  inline def apply(): AssociateWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
  }
  
  extension [Self <: AssociateWebsiteCertificateAuthorityResponse](x: Self) {
    
    inline def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
    
    inline def setWebsiteCaIdUndefined: Self = StObject.set(x, "WebsiteCaId", js.undefined)
  }
}
