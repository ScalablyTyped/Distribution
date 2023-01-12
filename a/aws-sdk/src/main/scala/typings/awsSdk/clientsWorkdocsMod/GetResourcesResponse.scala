package typings.awsSdk.clientsWorkdocsMod

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
  
  inline def apply(): GetResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: DocumentMetadataList): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    inline def setDocumentsVarargs(value: DocumentMetadata*): Self = StObject.set(x, "Documents", js.Array(value*))
    
    inline def setFolders(value: FolderMetadataList): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "Folders", js.undefined)
    
    inline def setFoldersVarargs(value: FolderMetadata*): Self = StObject.set(x, "Folders", js.Array(value*))
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
