package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerStorageRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: string = js.native
  /**
    * 
    Describes the target volume size and the ID of the broker to apply the update to.
    
    */
  var TargetBrokerEBSVolumeInfo: listOfBrokerEBSVolumeInfo = js.native
}

object UpdateBrokerStorageRequest {
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string, TargetBrokerEBSVolumeInfo: listOfBrokerEBSVolumeInfo): UpdateBrokerStorageRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetBrokerEBSVolumeInfo = TargetBrokerEBSVolumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerStorageRequest]
  }
}

