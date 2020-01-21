package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsInput extends js.Object {
  /**
    * The maximum number of object names that QueryObjects will return in a single call. The default value is 100. 
    */
  var limit: js.UndefOr[int] = js.native
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call QueryObjects with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The query that defines the objects to be returned. The Query object can contain a maximum of ten selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be applied to components, instances, and attempts.
    */
  var query: js.UndefOr[Query] = js.native
  /**
    * Indicates whether the query applies to components or instances. The possible values are: COMPONENT, INSTANCE, and ATTEMPT.
    */
  var sphere: String = js.native
}

object QueryObjectsInput {
  @scala.inline
  def apply(
    pipelineId: id,
    sphere: String,
    limit: Int | Double = null,
    marker: String = null,
    query: Query = null
  ): QueryObjectsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsInput]
  }
}

