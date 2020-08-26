package typings.awsSdkClientCodecommitNode.typesDeleteFileOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The blob ID removed from the tree as part of deleting the file.</p>
    */
  var blobId: String = js.native
  /**
    * <p>The full commit ID of the commit that contains the change that deletes the file.</p>
    */
  var commitId: String = js.native
  /**
    * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file.</p>
    */
  var filePath: String = js.native
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the delete file change.</p>
    */
  var treeId: String = js.native
}

object DeleteFileOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): DeleteFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlobId(value: String): Self = this.set("blobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
  }
  
}

