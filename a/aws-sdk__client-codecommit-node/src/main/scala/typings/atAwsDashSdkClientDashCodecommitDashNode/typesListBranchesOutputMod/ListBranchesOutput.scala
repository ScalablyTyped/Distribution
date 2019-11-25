package typings.atAwsDashSdkClientDashCodecommitDashNode.typesListBranchesOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBranchesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The list of branch names.</p>
    */
  var branches: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>An enumeration token that returns the batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListBranchesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, branches: js.Array[String] = null, nextToken: String = null): ListBranchesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesOutput]
  }
}

