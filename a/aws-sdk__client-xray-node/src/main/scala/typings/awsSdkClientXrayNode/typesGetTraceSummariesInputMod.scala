package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetTraceSummariesInput", JSImport.Namespace)
@js.native
object typesGetTraceSummariesInputMod extends js.Object {
  @js.native
  trait GetTraceSummariesInput extends InputTypesUnion {
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
      * <p>The end of the time frame for which to retrieve traces.</p>
      */
    var EndTime: Date | String | Double = js.native
    /**
      * <p>Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.</p>
      */
    var FilterExpression: js.UndefOr[String] = js.native
    /**
      * <p>Specify the pagination token returned by a previous request to retrieve the next page of results.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    /**
      * <p>Set to <code>true</code> to get summaries for only a subset of available traces.</p>
      */
    var Sampling: js.UndefOr[Boolean] = js.native
    /**
      * <p>The start of the time frame for which to retrieve traces.</p>
      */
    var StartTime: Date | String | Double = js.native
  }
  
}

