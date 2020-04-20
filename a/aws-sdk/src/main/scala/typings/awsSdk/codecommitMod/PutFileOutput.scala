package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileOutput extends js.Object {
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
}

