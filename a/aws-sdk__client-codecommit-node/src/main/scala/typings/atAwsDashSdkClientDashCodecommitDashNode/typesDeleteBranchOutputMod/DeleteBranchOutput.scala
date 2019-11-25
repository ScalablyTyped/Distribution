package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreBranchInfoMod._UnmarshalledBranchInfo
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var deletedBranch: js.UndefOr[_UnmarshalledBranchInfo] = js.undefined
}

object DeleteBranchOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, deletedBranch: _UnmarshalledBranchInfo = null): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (deletedBranch != null) __obj.updateDynamic("deletedBranch")(deletedBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchOutput]
  }
}

