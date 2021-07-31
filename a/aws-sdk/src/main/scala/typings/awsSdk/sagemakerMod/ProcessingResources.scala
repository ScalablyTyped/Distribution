package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingResources extends StObject {
  
  /**
    * The configuration for the resources in a cluster used to run the processing job.
    */
  var ClusterConfig: ProcessingClusterConfig
}
object ProcessingResources {
  
  @scala.inline
  def apply(ClusterConfig: ProcessingClusterConfig): ProcessingResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingResources]
  }
  
  @scala.inline
  implicit class ProcessingResourcesMutableBuilder[Self <: ProcessingResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterConfig(value: ProcessingClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
  }
}
