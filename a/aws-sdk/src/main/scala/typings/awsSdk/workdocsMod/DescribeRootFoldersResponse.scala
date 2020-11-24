package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRootFoldersResponse extends js.Object {
  
  /**
    * The user's special folders.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}
object DescribeRootFoldersResponse {
  
  @scala.inline
  def apply(): DescribeRootFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRootFoldersResponse]
  }
  
  @scala.inline
  implicit class DescribeRootFoldersResponseOps[Self <: DescribeRootFoldersResponse] (val x: Self) extends AnyVal {
    
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
    def setFoldersVarargs(value: FolderMetadata*): Self = this.set("Folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: FolderMetadataList): Self = this.set("Folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("Folders", js.undefined)
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
