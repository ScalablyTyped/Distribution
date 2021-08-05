package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfiguration extends StObject {
  
  /**
    * If a service is using the rolling update (ECS) deployment type, the maximum percent parameter represents an upper limit on the number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, as a percentage of the desired number of tasks (rounded down to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available). The default value for maximum percent is 200%. If a service is using the blue/green (CODE_DEPLOY) or EXTERNAL deployment types and tasks that use the EC2 launch type, the maximum percent value is set to the default value and is used to define the upper limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the maximum percent value is not used, although it is returned when describing your service.
    */
  var maximumPercent: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * If a service is using the rolling update (ECS) deployment type, the minimum healthy percent represents a lower limit on the number of tasks in a service that must remain in the RUNNING state during a deployment, as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to deploy without using additional cluster capacity. For example, if your service has a desired number of four tasks and a minimum healthy percent of 50%, the scheduler may stop two existing tasks to free up cluster capacity before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state; tasks for services that do use a load balancer are considered healthy if they are in the RUNNING state and they are reported as healthy by the load balancer. The default value for minimum healthy percent is 100%. If a service is using the blue/green (CODE_DEPLOY) or EXTERNAL deployment types and tasks that use the EC2 launch type, the minimum healthy percent value is set to the default value and is used to define the lower limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the minimum healthy percent value is not used, although it is returned when describing your service.
    */
  var minimumHealthyPercent: js.UndefOr[BoxedInteger] = js.undefined
}
object DeploymentConfiguration {
  
  inline def apply(): DeploymentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfiguration]
  }
  
  extension [Self <: DeploymentConfiguration](x: Self) {
    
    inline def setMaximumPercent(value: BoxedInteger): Self = StObject.set(x, "maximumPercent", value.asInstanceOf[js.Any])
    
    inline def setMaximumPercentUndefined: Self = StObject.set(x, "maximumPercent", js.undefined)
    
    inline def setMinimumHealthyPercent(value: BoxedInteger): Self = StObject.set(x, "minimumHealthyPercent", value.asInstanceOf[js.Any])
    
    inline def setMinimumHealthyPercentUndefined: Self = StObject.set(x, "minimumHealthyPercent", js.undefined)
  }
}
