package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDependency extends js.Object {
  /**
    * The dependency condition of the container. The following are the available conditions and their behavior:    START - This condition emulates the behavior of links and volumes today. It validates that a dependent container is started before permitting other containers to start.    COMPLETE - This condition validates that a dependent container runs to completion (exits) before permitting other containers to start. This can be useful for nonessential containers that run a script and then exit.    SUCCESS - This condition is the same as COMPLETE, but it also requires that the container exits with a zero status.    HEALTHY - This condition validates that the dependent container passes its Docker health check before permitting other containers to start. This requires that the dependent container has health checks configured. This condition is confirmed only at task startup.  
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
}

