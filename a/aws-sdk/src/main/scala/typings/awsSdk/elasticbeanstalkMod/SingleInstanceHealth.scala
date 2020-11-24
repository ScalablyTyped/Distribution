package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleInstanceHealth extends js.Object {
  
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
  implicit class SingleInstanceHealthOps[Self <: SingleInstanceHealth] (val x: Self) extends AnyVal {
    
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
    def setApplicationMetrics(value: ApplicationMetrics): Self = this.set("ApplicationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationMetrics: Self = this.set("ApplicationMetrics", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCausesVarargs(value: Cause*): Self = this.set("Causes", js.Array(value :_*))
    
    @scala.inline
    def setCauses(value: Causes): Self = this.set("Causes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCauses: Self = this.set("Causes", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("Color", js.undefined)
    
    @scala.inline
    def setDeployment(value: Deployment): Self = this.set("Deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployment: Self = this.set("Deployment", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: String): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("HealthStatus", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchedAt(value: LaunchedAt): Self = this.set("LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchedAt: Self = this.set("LaunchedAt", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemStatus): Self = this.set("System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("System", js.undefined)
  }
}
