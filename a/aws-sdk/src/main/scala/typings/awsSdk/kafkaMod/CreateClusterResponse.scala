package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The name of the MSK cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.native
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.native
}

object CreateClusterResponse {
  @scala.inline
  def apply(): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResponse]
  }
  @scala.inline
  implicit class CreateClusterResponseOps[Self <: CreateClusterResponse] (val x: Self) extends AnyVal {
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
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    @scala.inline
    def setClusterName(value: string): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("ClusterName", js.undefined)
    @scala.inline
    def setState(value: ClusterState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

