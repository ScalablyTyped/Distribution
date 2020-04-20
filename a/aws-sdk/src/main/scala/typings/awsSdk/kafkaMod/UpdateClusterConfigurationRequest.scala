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
}

