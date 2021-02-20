package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFolderResponse extends StObject {
  
  /**
    * The custom metadata on the folder.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.native
}
object GetFolderResponse {
  
  @scala.inline
  def apply(): GetFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFolderResponse]
  }
  
  @scala.inline
  implicit class GetFolderResponseMutableBuilder[Self <: GetFolderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMetadata(value: CustomMetadataMap): Self = StObject.set(x, "CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetadataUndefined: Self = StObject.set(x, "CustomMetadata", js.undefined)
    
    @scala.inline
    def setMetadata(value: FolderMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
