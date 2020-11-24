package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentHealthResult extends js.Object {
  
  /**
    * Application request metrics for the environment.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationMetrics] = js.native
  
  /**
    * Descriptions of the data that contributed to the environment's current health status.
    */
  var Causes: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Causes] = js.native
  
  /**
    * The health color of the environment.
    */
  var Color: js.UndefOr[String] = js.native
  
  /**
    * The environment's name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * The health status of the environment. For example, Ok.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  
  /**
    * Summary health information for the instances in the environment.
    */
  var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.native
  
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RefreshedAt] = js.native
  
  /**
    * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
    */
  var Status: js.UndefOr[EnvironmentHealth] = js.native
}
object DescribeEnvironmentHealthResult {
  
  @scala.inline
  def apply(): DescribeEnvironmentHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentHealthResult]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentHealthResultOps[Self <: DescribeEnvironmentHealthResult] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: String): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("HealthStatus", js.undefined)
    
    @scala.inline
    def setInstancesHealth(value: InstanceHealthSummary): Self = this.set("InstancesHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancesHealth: Self = this.set("InstancesHealth", js.undefined)
    
    @scala.inline
    def setRefreshedAt(value: RefreshedAt): Self = this.set("RefreshedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshedAt: Self = this.set("RefreshedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentHealth): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
