package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringResources extends StObject {
  
  /**
    * The configuration for the cluster resources used to run the processing job.
    */
  var ClusterConfig: MonitoringClusterConfig
}
object MonitoringResources {
  
  @scala.inline
  def apply(ClusterConfig: MonitoringClusterConfig): MonitoringResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringResources]
  }
  
  @scala.inline
  implicit class MonitoringResourcesMutableBuilder[Self <: MonitoringResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterConfig(value: MonitoringClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
  }
}
