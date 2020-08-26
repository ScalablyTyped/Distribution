package typings.awsSdkClientXrayNode.typesGetTraceSummariesInputMod

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object GetTraceSummariesInput {
  @scala.inline
  def apply(EndTime: Date | String | Double, StartTime: Date | String | Double): GetTraceSummariesInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesInput]
  }
  @scala.inline
  implicit class GetTraceSummariesInputOps[Self <: GetTraceSummariesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Date | String | Double): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date | String | Double): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setFilterExpression(value: String): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSampling(value: Boolean): Self = this.set("Sampling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampling: Self = this.set("Sampling", js.undefined)
  }
  
}

