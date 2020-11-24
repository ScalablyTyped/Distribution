package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterKafkaVersionRequest extends js.Object {
  
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
  implicit class UpdateClusterKafkaVersionRequestOps[Self <: UpdateClusterKafkaVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: string): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKafkaVersion(value: string): Self = this.set("TargetKafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationInfo(value: ConfigurationInfo): Self = this.set("ConfigurationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationInfo: Self = this.set("ConfigurationInfo", js.undefined)
  }
}
