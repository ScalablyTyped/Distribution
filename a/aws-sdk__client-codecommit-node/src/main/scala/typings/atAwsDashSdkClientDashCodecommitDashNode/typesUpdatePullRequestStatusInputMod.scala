package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CLOSED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.OPEN
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/UpdatePullRequestStatusInput", JSImport.Namespace)
@js.native
object typesUpdatePullRequestStatusInputMod extends js.Object {
  @js.native
  trait UpdatePullRequestStatusInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
      */
    var pullRequestId: String = js.native
    /**
      * <p>The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to <code>CLOSED</code>.</p>
      */
    var pullRequestStatus: OPEN | CLOSED | String = js.native
  }
  
}

