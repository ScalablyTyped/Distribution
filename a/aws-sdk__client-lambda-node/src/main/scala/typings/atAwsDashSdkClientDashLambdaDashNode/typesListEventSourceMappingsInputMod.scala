package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListEventSourceMappingsInput", JSImport.Namespace)
@js.native
object typesListEventSourceMappingsInputMod extends js.Object {
  @js.native
  trait ListEventSourceMappingsInput extends _InputTypesUnion {
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
      * <p>The Amazon Resource Name (ARN) of the Amazon Kinesis or DynamoDB stream. (This parameter is optional.)</p>
      */
    var EventSourceArn: js.UndefOr[String] = js.native
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: js.UndefOr[String] = js.native
    /**
      * <p>Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code> operation. If present, specifies to continue the list from where the returning call left off. </p>
      */
    var Marker: js.UndefOr[String] = js.native
    /**
      * <p>Optional integer. Specifies the maximum number of event sources to return in response. This value must be greater than 0.</p>
      */
    var MaxItems: js.UndefOr[Double] = js.native
  }
  
}

