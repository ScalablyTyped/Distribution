package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskSetsRequest extends js.Object {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist in.
    */
  var cluster: String = js.native
  
  /**
    * Specifies whether to see the resource tags for the task set. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskSetFieldList] = js.native
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
    */
  var service: String = js.native
  
  /**
    * The ID or full Amazon Resource Name (ARN) of task sets to describe.
    */
  var taskSets: js.UndefOr[StringList] = js.native
}
object DescribeTaskSetsRequest {
  
  @scala.inline
  def apply(cluster: String, service: String): DescribeTaskSetsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskSetsRequest]
  }
  
  @scala.inline
  implicit class DescribeTaskSetsRequestOps[Self <: DescribeTaskSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVarargs(value: TaskSetField*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: TaskSetFieldList): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setTaskSetsVarargs(value: String*): Self = this.set("taskSets", js.Array(value :_*))
    
    @scala.inline
    def setTaskSets(value: StringList): Self = this.set("taskSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskSets: Self = this.set("taskSets", js.undefined)
  }
}
