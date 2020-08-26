package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesResponse extends js.Object {
  /**
    * The documents in the specified collection.
    */
  var Documents: js.UndefOr[DocumentMetadataList] = js.native
  /**
    * The folders in the specified folder.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object GetResourcesResponse {
  @scala.inline
  def apply(): GetResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesResponse]
  }
  @scala.inline
  implicit class GetResourcesResponseOps[Self <: GetResourcesResponse] (val x: Self) extends AnyVal {
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
    def setDocumentsVarargs(value: DocumentMetadata*): Self = this.set("Documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: DocumentMetadataList): Self = this.set("Documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("Documents", js.undefined)
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

