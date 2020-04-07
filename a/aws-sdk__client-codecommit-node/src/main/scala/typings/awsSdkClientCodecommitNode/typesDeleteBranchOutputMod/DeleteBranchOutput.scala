package typings.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBranchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.</p>
    */
  var deletedBranch: js.UndefOr[UnmarshalledBranchInfo] = js.undefined
}

object DeleteBranchOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, deletedBranch: UnmarshalledBranchInfo = null): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (deletedBranch != null) __obj.updateDynamic("deletedBranch")(deletedBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchOutput]
  }
}

