package typings.awsSdkClientCodecommitNode.typesPutFileOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The ID of the blob, which is its SHA-1 pointer.</p>
    */
  var blobId: String = js.native
  /**
    * <p>The full SHA of the commit that contains this file change.</p>
    */
  var commitId: String = js.native
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains this file change.</p>
    */
  var treeId: String = js.native
}

object PutFileOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): PutFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileOutput]
  }
  @scala.inline
  implicit class PutFileOutputOps[Self <: PutFileOutput] (val x: Self) extends AnyVal {
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
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
  }
  
}

