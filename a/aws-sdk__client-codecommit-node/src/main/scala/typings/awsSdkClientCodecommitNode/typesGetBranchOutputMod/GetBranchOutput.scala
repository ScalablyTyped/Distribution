package typings.awsSdkClientCodecommitNode.typesGetBranchOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBranchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The name of the branch.</p>
    */
  var branch: js.UndefOr[UnmarshalledBranchInfo] = js.undefined
}

object GetBranchOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, branch: UnmarshalledBranchInfo = null): GetBranchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBranchOutput]
  }
}

