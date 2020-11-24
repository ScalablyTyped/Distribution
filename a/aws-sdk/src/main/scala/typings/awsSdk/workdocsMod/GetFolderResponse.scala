package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFolderResponse extends js.Object {
  
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
  implicit class GetFolderResponseOps[Self <: GetFolderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomMetadata(value: CustomMetadataMap): Self = this.set("CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMetadata: Self = this.set("CustomMetadata", js.undefined)
    
    @scala.inline
    def setMetadata(value: FolderMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
  }
}
