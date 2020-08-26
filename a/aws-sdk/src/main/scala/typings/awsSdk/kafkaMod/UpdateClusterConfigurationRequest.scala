package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterConfigurationRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: typings.awsSdk.kafkaMod.ConfigurationInfo = js.native
  /**
    * 
    The version of the cluster that needs to be updated.
    
    */
  var CurrentVersion: string = js.native
}

object UpdateClusterConfigurationRequest {
  @scala.inline
  def apply(ClusterArn: string, ConfigurationInfo: ConfigurationInfo, CurrentVersion: string): UpdateClusterConfigurationRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], ConfigurationInfo = ConfigurationInfo.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateClusterConfigurationRequestOps[Self <: UpdateClusterConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationInfo(value: ConfigurationInfo): Self = this.set("ConfigurationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentVersion(value: string): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
  }
  
}

