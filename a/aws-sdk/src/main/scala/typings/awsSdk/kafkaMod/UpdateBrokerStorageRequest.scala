package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UpdateBrokerStorageRequestOps[Self <: UpdateBrokerStorageRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetBrokerEBSVolumeInfoVarargs(value: BrokerEBSVolumeInfo*): Self = this.set("TargetBrokerEBSVolumeInfo", js.Array(value :_*))
    
    @scala.inline
    def setTargetBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = this.set("TargetBrokerEBSVolumeInfo", value.asInstanceOf[js.Any])
  }
}
