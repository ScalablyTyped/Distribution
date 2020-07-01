package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ClusterArn: string,
    CurrentVersion: string,
    TargetKafkaVersion: string,
    ConfigurationInfo: ConfigurationInfo = null
  ): UpdateClusterKafkaVersionRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetKafkaVersion = TargetKafkaVersion.asInstanceOf[js.Any])
    if (ConfigurationInfo != null) __obj.updateDynamic("ConfigurationInfo")(ConfigurationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterKafkaVersionRequest]
  }
}

