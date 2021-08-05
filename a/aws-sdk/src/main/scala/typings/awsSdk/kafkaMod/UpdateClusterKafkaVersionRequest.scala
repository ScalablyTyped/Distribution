package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterKafkaVersionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The custom configuration that should be applied on the new version of cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConfigurationInfo] = js.undefined
  
  /**
    * 
    Current cluster version.
    
    */
  var CurrentVersion: string
  
  /**
    * 
    Target Kafka version.
    
    */
  var TargetKafkaVersion: string
}
object UpdateClusterKafkaVersionRequest {
  
  inline def apply(ClusterArn: string, CurrentVersion: string, TargetKafkaVersion: string): UpdateClusterKafkaVersionRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetKafkaVersion = TargetKafkaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterKafkaVersionRequest]
  }
  
  extension [Self <: UpdateClusterKafkaVersionRequest](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetKafkaVersion(value: string): Self = StObject.set(x, "TargetKafkaVersion", value.asInstanceOf[js.Any])
  }
}
