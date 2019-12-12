package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreCommentsForPullRequestMod._UnmarshalledCommentsForPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetCommentsForPullRequestOutput", JSImport.Namespace)
@js.native
object typesGetCommentsForPullRequestOutputMod extends js.Object {
  @js.native
  trait GetCommentsForPullRequestOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An array of comment objects on the pull request.</p>
      */
    var commentsForPullRequestData: js.UndefOr[js.Array[_UnmarshalledCommentsForPullRequest]] = js.native
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
  }
  
}

