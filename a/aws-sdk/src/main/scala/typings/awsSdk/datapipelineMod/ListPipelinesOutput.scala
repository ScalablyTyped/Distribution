package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesOutput extends js.Object {
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call ListPipelinesOutput again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * The pipeline identifiers. If you require additional information about the pipelines, you can use these identifiers to call DescribePipelines and GetPipelineDefinition.
    */
  var pipelineIdList: pipelineList = js.native
}

object ListPipelinesOutput {
  @scala.inline
  def apply(
    pipelineIdList: pipelineList,
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    marker: String = null
  ): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineIdList = pipelineIdList.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesOutput]
  }
}

