package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ALL
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListFunctionsInput", JSImport.Namespace)
@js.native
object typesListFunctionsInputMod extends js.Object {
  @js.native
  trait ListFunctionsInput extends _InputTypesUnion {
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
      * <p>Set to <code>ALL</code> to list all published versions. If not specified, only the latest unpublished version ARN is returned.</p>
      */
    var FunctionVersion: js.UndefOr[ALL | String] = js.native
    /**
      * <p>Optional string. An opaque pagination token returned from a previous <code>ListFunctions</code> operation. If present, indicates where to continue the listing. </p>
      */
    var Marker: js.UndefOr[String] = js.native
    /**
      * <p>Specify a region (e.g. <code>us-east-2</code>) to only list functions that were created in that region, or <code>ALL</code> to include functions replicated from any region. If specified, you also must specify the <code>FunctionVersion</code>.</p>
      */
    var MasterRegion: js.UndefOr[String] = js.native
    /**
      * <p>Optional integer. Specifies the maximum number of AWS Lambda functions to return in response. This parameter value must be greater than 0. The absolute maximum of AWS Lambda functions that can be returned is 50.</p>
      */
    var MaxItems: js.UndefOr[Double] = js.native
  }
  
}

