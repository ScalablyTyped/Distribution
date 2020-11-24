package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTaskSetRequest extends js.Object {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in to delete.
    */
  var cluster: String = js.native
  
  /**
    * If true, this allows you to delete a task set even if it hasn't been scaled down to zero.
    */
  var force: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
    */
  var service: String = js.native
  
  /**
    * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
    */
  var taskSet: String = js.native
}
object DeleteTaskSetRequest {
  
  @scala.inline
  def apply(cluster: String, service: String, taskSet: String): DeleteTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskSet = taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskSetRequest]
  }
  
  @scala.inline
  implicit class DeleteTaskSetRequestOps[Self <: DeleteTaskSetRequest] (val x: Self) extends AnyVal {
    
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
    def setTaskSet(value: String): Self = this.set("taskSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: BoxedBoolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
}
