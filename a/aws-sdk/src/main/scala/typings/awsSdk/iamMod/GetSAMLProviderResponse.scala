package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSAMLProviderResponse extends StObject {
  
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined
  
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.undefined
}
object GetSAMLProviderResponse {
  
  inline def apply(): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
  
  extension [Self <: GetSAMLProviderResponse](x: Self) {
    
    inline def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = StObject.set(x, "SAMLMetadataDocument", value.asInstanceOf[js.Any])
    
    inline def setSAMLMetadataDocumentUndefined: Self = StObject.set(x, "SAMLMetadataDocument", js.undefined)
    
    inline def setValidUntil(value: dateType): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
