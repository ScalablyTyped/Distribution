package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentPathRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: IdType
  
  /**
    * A comma-separated list of values. Specify NAME to include the names of the parent folders.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * The maximum number of levels in the hierarchy to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * This value is not supported.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object GetDocumentPathRequest {
  
  inline def apply(DocumentId: IdType): GetDocumentPathRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentPathRequest]
  }
  
  extension [Self <: GetDocumentPathRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDocumentId(value: IdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setFields(value: FieldNamesType): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
