package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentHealthResult extends StObject {
  
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
  implicit class DescribeEnvironmentHealthResultMutableBuilder[Self <: DescribeEnvironmentHealthResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationMetrics(value: ApplicationMetrics): Self = StObject.set(x, "ApplicationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationMetricsUndefined: Self = StObject.set(x, "ApplicationMetrics", js.undefined)
    
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
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: String): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    @scala.inline
    def setInstancesHealth(value: InstanceHealthSummary): Self = StObject.set(x, "InstancesHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesHealthUndefined: Self = StObject.set(x, "InstancesHealth", js.undefined)
    
    @scala.inline
    def setRefreshedAt(value: RefreshedAt): Self = StObject.set(x, "RefreshedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshedAtUndefined: Self = StObject.set(x, "RefreshedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentHealth): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
