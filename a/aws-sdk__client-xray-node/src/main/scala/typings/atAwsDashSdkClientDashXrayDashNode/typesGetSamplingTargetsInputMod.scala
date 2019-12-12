package typings.atAwsDashSdkClientDashXrayDashNode

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingStatisticsDocumentMod._SamplingStatisticsDocument
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetSamplingTargetsInput", JSImport.Namespace)
@js.native
object typesGetSamplingTargetsInputMod extends js.Object {
  @js.native
  trait GetSamplingTargetsInput extends InputTypesUnion {
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
      * <p>Information about rules that the service is using to sample requests.</p>
      */
    var SamplingStatisticsDocuments: js.Array[_SamplingStatisticsDocument] | Iterable[_SamplingStatisticsDocument] = js.native
  }
  
}

