package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The ID of the blob, which is its SHA-1 pointer.</p>
    */
  var blobId: String
  /**
    * <p>The full SHA of the commit that contains this file change.</p>
    */
  var commitId: String
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains this file change.</p>
    */
  var treeId: String
}

object PutFileOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, blobId: String, commitId: String, treeId: String): PutFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutFileOutput]
  }
}

