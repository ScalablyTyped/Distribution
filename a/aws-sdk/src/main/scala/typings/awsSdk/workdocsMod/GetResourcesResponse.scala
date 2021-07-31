package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesResponse extends StObject {
  
  /**
    * The documents in the specified collection.
    */
  var Documents: js.UndefOr[DocumentMetadataList] = js.undefined
  
  /**
    * The folders in the specified folder.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}
object GetResourcesResponse {
  
  @scala.inline
  def apply(): GetResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesResponse]
  }
  
  @scala.inline
  implicit class GetResourcesResponseMutableBuilder[Self <: GetResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: DocumentMetadataList): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: DocumentMetadata*): Self = StObject.set(x, "Documents", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: FolderMetadataList): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "Folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: FolderMetadata*): Self = StObject.set(x, "Folders", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
