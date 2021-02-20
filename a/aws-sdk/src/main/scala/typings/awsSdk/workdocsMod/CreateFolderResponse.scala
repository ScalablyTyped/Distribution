package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFolderResponse extends StObject {
  
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.native
}
object CreateFolderResponse {
  
  @scala.inline
  def apply(): CreateFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFolderResponse]
  }
  
  @scala.inline
  implicit class CreateFolderResponseMutableBuilder[Self <: CreateFolderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FolderMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
  }
}
