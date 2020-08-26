package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerCountRequest extends js.Object {
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
    The number of broker nodes that you want the cluster to have after this operation completes successfully.
    
    */
  var TargetNumberOfBrokerNodes: integerMin1Max15 = js.native
}

object UpdateBrokerCountRequest {
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string, TargetNumberOfBrokerNodes: integerMin1Max15): UpdateBrokerCountRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetNumberOfBrokerNodes = TargetNumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerCountRequest]
  }
  @scala.inline
  implicit class UpdateBrokerCountRequestOps[Self <: UpdateBrokerCountRequest] (val x: Self) extends AnyVal {
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
    def setTargetNumberOfBrokerNodes(value: integerMin1Max15): Self = this.set("TargetNumberOfBrokerNodes", value.asInstanceOf[js.Any])
  }
  
}

