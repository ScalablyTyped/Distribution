package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentVersionsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  
  /**
    * Specify "SOURCE" to include initialized versions and a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * A comma-separated list of values. Specify "INITIALIZED" to include incomplete versions.
    */
  var Include: js.UndefOr[FieldNamesType] = js.undefined
  
  /**
    * The maximum number of versions to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object DescribeDocumentVersionsRequest {
  
  @scala.inline
  def apply(DocumentId: ResourceIdType): DescribeDocumentVersionsRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentVersionsRequest]
  }
  
  @scala.inline
  implicit class DescribeDocumentVersionsRequestMutableBuilder[Self <: DescribeDocumentVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDocumentId(value: ResourceIdType): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: FieldNamesType): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setInclude(value: FieldNamesType): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
