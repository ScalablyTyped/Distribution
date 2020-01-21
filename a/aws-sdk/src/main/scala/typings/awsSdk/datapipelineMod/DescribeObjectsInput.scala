package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObjectsInput extends js.Object {
  /**
    * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
    */
  var evaluateExpressions: js.UndefOr[Boolean] = js.native
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call DescribeObjects with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25 identifiers in a single call to DescribeObjects.
    */
  var objectIds: idList = js.native
  /**
    * The ID of the pipeline that contains the object definitions.
    */
  var pipelineId: id = js.native
}

object DescribeObjectsInput {
  @scala.inline
  def apply(
    objectIds: idList,
    pipelineId: id,
    evaluateExpressions: js.UndefOr[Boolean] = js.undefined,
    marker: String = null
  ): DescribeObjectsInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluateExpressions)) __obj.updateDynamic("evaluateExpressions")(evaluateExpressions.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsInput]
  }
}

