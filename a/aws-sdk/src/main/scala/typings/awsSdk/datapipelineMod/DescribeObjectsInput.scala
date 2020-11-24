package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(objectIds: idList, pipelineId: id): DescribeObjectsInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsInput]
  }
  
  @scala.inline
  implicit class DescribeObjectsInputOps[Self <: DescribeObjectsInput] (val x: Self) extends AnyVal {
    
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
    def setObjectIdsVarargs(value: id*): Self = this.set("objectIds", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: idList): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluateExpressions(value: Boolean): Self = this.set("evaluateExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluateExpressions: Self = this.set("evaluateExpressions", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
}
