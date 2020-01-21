package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object DescribeObjectsOutput {
  @scala.inline
  def apply(
    pipelineObjects: PipelineObjectList,
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    marker: String = null
  ): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
}

