package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your committed file changes.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The files added as part of the committed file changes.
    */
  var filesAdded: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files deleted as part of the committed file changes.
    */
  var filesDeleted: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files updated as part of the commited file changes.
    */
  var filesUpdated: js.UndefOr[FilesMetadata] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object CreateCommitOutput {
  @scala.inline
  def apply(): CreateCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommitOutput]
  }
  @scala.inline
  implicit class CreateCommitOutputOps[Self <: CreateCommitOutput] (val x: Self) extends AnyVal {
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
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    @scala.inline
    def setFilesAddedVarargs(value: FileMetadata*): Self = this.set("filesAdded", js.Array(value :_*))
    @scala.inline
    def setFilesAdded(value: FilesMetadata): Self = this.set("filesAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesAdded: Self = this.set("filesAdded", js.undefined)
    @scala.inline
    def setFilesDeletedVarargs(value: FileMetadata*): Self = this.set("filesDeleted", js.Array(value :_*))
    @scala.inline
    def setFilesDeleted(value: FilesMetadata): Self = this.set("filesDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesDeleted: Self = this.set("filesDeleted", js.undefined)
    @scala.inline
    def setFilesUpdatedVarargs(value: FileMetadata*): Self = this.set("filesUpdated", js.Array(value :_*))
    @scala.inline
    def setFilesUpdated(value: FilesMetadata): Self = this.set("filesUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesUpdated: Self = this.set("filesUpdated", js.undefined)
    @scala.inline
    def setTreeId(value: ObjectId): Self = this.set("treeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
  
}

