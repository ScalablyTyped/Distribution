package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod._UnmarshalledPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/MergePullRequestByFastForwardOutput", JSImport.Namespace)
@js.native
object typesMergePullRequestByFastForwardOutputMod extends js.Object {
  @js.native
  trait MergePullRequestByFastForwardOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the specified pull request, including information about the merge.</p>
      */
    var pullRequest: js.UndefOr[_UnmarshalledPullRequest] = js.native
  }
  
}

