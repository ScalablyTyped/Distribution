package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentVersionsResponse extends StObject {
  
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object DescribeDocumentVersionsResponse {
  
  inline def apply(): DescribeDocumentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentVersionsResponse]
  }
  
  extension [Self <: DescribeDocumentVersionsResponse](x: Self) {
    
    inline def setDocumentVersions(value: DocumentVersionMetadataList): Self = StObject.set(x, "DocumentVersions", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionsUndefined: Self = StObject.set(x, "DocumentVersions", js.undefined)
    
    inline def setDocumentVersionsVarargs(value: DocumentVersionMetadata*): Self = StObject.set(x, "DocumentVersions", js.Array(value :_*))
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
