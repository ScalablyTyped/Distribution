package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod._UnmarshalledPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/UpdatePullRequestDescriptionOutput", JSImport.Namespace)
@js.native
object typesUpdatePullRequestDescriptionOutputMod extends js.Object {
  @js.native
  trait UpdatePullRequestDescriptionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the updated pull request.</p>
      */
    var pullRequest: _UnmarshalledPullRequest = js.native
  }
  
}

