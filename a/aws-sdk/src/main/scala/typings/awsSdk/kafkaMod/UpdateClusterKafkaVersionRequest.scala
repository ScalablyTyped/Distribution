package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterKafkaVersionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string = js.native
  
  /**
    * 
    The custom configuration that should be applied on the new version of cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConfigurationInfo] = js.native
  
  /**
    * 
    Current cluster version.
    
    */
  var CurrentVersion: string = js.native
  
  /**
    * 
    Target Kafka version.
    
    */
  var TargetKafkaVersion: string = js.native
}
object UpdateClusterKafkaVersionRequest {
  
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string, TargetKafkaVersion: string): UpdateClusterKafkaVersionRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetKafkaVersion = TargetKafkaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterKafkaVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterKafkaVersionRequestMutableBuilder[Self <: UpdateClusterKafkaVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKafkaVersion(value: string): Self = StObject.set(x, "TargetKafkaVersion", value.asInstanceOf[js.Any])
  }
}
