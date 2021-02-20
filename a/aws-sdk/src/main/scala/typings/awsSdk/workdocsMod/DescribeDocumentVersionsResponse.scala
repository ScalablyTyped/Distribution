package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentVersionsResponse extends StObject {
  
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.native
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}
object DescribeDocumentVersionsResponse {
  
  @scala.inline
  def apply(): DescribeDocumentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentVersionsResponse]
  }
  
  @scala.inline
  implicit class DescribeDocumentVersionsResponseMutableBuilder[Self <: DescribeDocumentVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersions(value: DocumentVersionMetadataList): Self = StObject.set(x, "DocumentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionsUndefined: Self = StObject.set(x, "DocumentVersions", js.undefined)
    
    @scala.inline
    def setDocumentVersionsVarargs(value: DocumentVersionMetadata*): Self = StObject.set(x, "DocumentVersions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
