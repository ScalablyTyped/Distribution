package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutFileOutput extends StObject {
  
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId = js.native
  
  /**
    * The full SHA ID of the commit that contains this file change.
    */
  var commitId: ObjectId = js.native
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains this file change.
    */
  var treeId: ObjectId = js.native
}
object PutFileOutput {
  
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, treeId: ObjectId): PutFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileOutput]
  }
  
  @scala.inline
  implicit class PutFileOutputMutableBuilder[Self <: PutFileOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
  }
}
