package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The blob ID removed from the tree as part of deleting the file.</p>
    */
  var blobId: String
  /**
    * <p>The full commit ID of the commit that contains the change that deletes the file.</p>
    */
  var commitId: String
  /**
    * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file.</p>
    */
  var filePath: String
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the delete file change.</p>
    */
  var treeId: String
}

object DeleteFileOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): DeleteFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, blobId = blobId, commitId = commitId, filePath = filePath, treeId = treeId)
  
    __obj.asInstanceOf[DeleteFileOutput]
  }
}

