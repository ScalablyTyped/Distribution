package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleInstanceHealth extends StObject {
  
  /**
    * Request metrics from your application.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationMetrics] = js.native
  
  /**
    * The availability zone in which the instance runs.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Represents the causes, which provide more information about the current health status.
    */
  var Causes: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Causes] = js.native
  
  /**
    * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
    */
  var Color: js.UndefOr[String] = js.native
  
  /**
    * Information about the most recent deployment to an instance.
    */
  var Deployment: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Deployment] = js.native
  
  /**
    * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Amazon EC2 instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.InstanceId] = js.native
  
  /**
    * The instance's type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The time at which the EC2 instance was launched.
    */
  var LaunchedAt: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.LaunchedAt] = js.native
  
  /**
    * Operating system metrics from the instance.
    */
  var System: js.UndefOr[SystemStatus] = js.native
}
object SingleInstanceHealth {
  
  @scala.inline
  def apply(): SingleInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleInstanceHealth]
  }
  
  @scala.inline
  implicit class SingleInstanceHealthMutableBuilder[Self <: SingleInstanceHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationMetrics(value: ApplicationMetrics): Self = StObject.set(x, "ApplicationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationMetricsUndefined: Self = StObject.set(x, "ApplicationMetrics", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCauses(value: Causes): Self = StObject.set(x, "Causes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCausesUndefined: Self = StObject.set(x, "Causes", js.undefined)
    
    @scala.inline
    def setCausesVarargs(value: Cause*): Self = StObject.set(x, "Causes", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    @scala.inline
    def setDeployment(value: Deployment): Self = StObject.set(x, "Deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "Deployment", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: String): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchedAt(value: LaunchedAt): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemStatus): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "System", js.undefined)
  }
}
