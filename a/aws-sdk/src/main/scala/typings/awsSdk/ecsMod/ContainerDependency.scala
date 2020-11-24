package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDependency extends js.Object {
  
  /**
    * The dependency condition of the container. The following are the available conditions and their behavior:    START - This condition emulates the behavior of links and volumes today. It validates that a dependent container is started before permitting other containers to start.    COMPLETE - This condition validates that a dependent container runs to completion (exits) before permitting other containers to start. This can be useful for nonessential containers that run a script and then exit. This condition cannot be set on an essential container.    SUCCESS - This condition is the same as COMPLETE, but it also requires that the container exits with a zero status. This condition cannot be set on an essential container.    HEALTHY - This condition validates that the dependent container passes its Docker health check before permitting other containers to start. This requires that the dependent container has health checks configured. This condition is confirmed only at task startup.  
    */
  var condition: ContainerCondition = js.native
  
  /**
    * The name of a container.
    */
  var containerName: String = js.native
}
object ContainerDependency {
  
  @scala.inline
  def apply(condition: ContainerCondition, containerName: String): ContainerDependency = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDependency]
  }
  
  @scala.inline
  implicit class ContainerDependencyOps[Self <: ContainerDependency] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: ContainerCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
  }
}
