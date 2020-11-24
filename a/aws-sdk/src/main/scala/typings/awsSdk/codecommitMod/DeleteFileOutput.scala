package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileOutput extends js.Object {
  
  /**
    * The blob ID removed from the tree as part of deleting the file.
    */
  var blobId: ObjectId = js.native
  
  /**
    * The full commit ID of the commit that contains the change that deletes the file.
    */
  var commitId: ObjectId = js.native
  
  /**
    * The fully qualified path to the file to be deleted, including the full name and extension of that file.
    */
  var filePath: Path = js.native
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
    */
  var treeId: ObjectId = js.native
}
object DeleteFileOutput {
  
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, filePath: Path, treeId: ObjectId): DeleteFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileOutput]
  }
  
  @scala.inline
  implicit class DeleteFileOutputOps[Self <: DeleteFileOutput] (val x: Self) extends AnyVal {
    
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
    def setBlobId(value: ObjectId): Self = this.set("blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = this.set("treeId", value.asInstanceOf[js.Any])
  }
}
