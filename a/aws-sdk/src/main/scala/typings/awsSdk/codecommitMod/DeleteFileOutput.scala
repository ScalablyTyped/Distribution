package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileOutput extends StObject {
  
  /**
    * The blob ID removed from the tree as part of deleting the file.
    */
  var blobId: ObjectId
  
  /**
    * The full commit ID of the commit that contains the change that deletes the file.
    */
  var commitId: ObjectId
  
  /**
    * The fully qualified path to the file to be deleted, including the full name and extension of that file.
    */
  var filePath: Path
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
    */
  var treeId: ObjectId
}
object DeleteFileOutput {
  
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, filePath: Path, treeId: ObjectId): DeleteFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileOutput]
  }
  
  @scala.inline
  implicit class DeleteFileOutputMutableBuilder[Self <: DeleteFileOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
  }
}
