package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderResponse extends StObject {
  
  /**
    * The custom metadata on the folder.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.undefined
}
object GetFolderResponse {
  
  inline def apply(): GetFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFolderResponse]
  }
  
  extension [Self <: GetFolderResponse](x: Self) {
    
    inline def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "CustomMetadata", js.undefined)
    
    inline def setMetadata(value: FolderMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
