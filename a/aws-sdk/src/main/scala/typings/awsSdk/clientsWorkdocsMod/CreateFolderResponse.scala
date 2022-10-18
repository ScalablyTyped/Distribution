package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderResponse extends StObject {
  
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.undefined
}
object CreateFolderResponse {
  
  inline def apply(): CreateFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolderResponse]
  }
  
  extension [Self <: CreateFolderResponse](x: Self) {
    
    inline def setMetadata(value: FolderMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
