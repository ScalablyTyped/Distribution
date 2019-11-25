package typings.atAwsDashSdkClientDashXrayDashNode.typesGetTraceSummariesInputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceSummariesInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The end of the time frame for which to retrieve traces.</p>
    */
  var EndTime: Date | String | Double
  /**
    * <p>Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.</p>
    */
  var FilterExpression: js.UndefOr[String] = js.undefined
  /**
    * <p>Specify the pagination token returned by a previous request to retrieve the next page of results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Set to <code>true</code> to get summaries for only a subset of available traces.</p>
    */
  var Sampling: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The start of the time frame for which to retrieve traces.</p>
    */
  var StartTime: Date | String | Double
}

object GetTraceSummariesInput {
  @scala.inline
  def apply(
    EndTime: Date | String | Double,
    StartTime: Date | String | Double,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    FilterExpression: String = null,
    NextToken: String = null,
    Sampling: js.UndefOr[Boolean] = js.undefined
  ): GetTraceSummariesInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(Sampling)) __obj.updateDynamic("Sampling")(Sampling.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesInput]
  }
}

