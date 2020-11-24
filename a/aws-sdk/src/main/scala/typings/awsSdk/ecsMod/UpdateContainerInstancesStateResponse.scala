package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerInstancesStateResponse extends js.Object {
  
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.native
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
}
object UpdateContainerInstancesStateResponse {
  
  @scala.inline
  def apply(): UpdateContainerInstancesStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
  }
  
  @scala.inline
  implicit class UpdateContainerInstancesStateResponseOps[Self <: UpdateContainerInstancesStateResponse] (val x: Self) extends AnyVal {
    
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
    def setContainerInstancesVarargs(value: ContainerInstance*): Self = this.set("containerInstances", js.Array(value :_*))
    
    @scala.inline
    def setContainerInstances(value: ContainerInstances): Self = this.set("containerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerInstances: Self = this.set("containerInstances", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: Failures): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
  }
}
