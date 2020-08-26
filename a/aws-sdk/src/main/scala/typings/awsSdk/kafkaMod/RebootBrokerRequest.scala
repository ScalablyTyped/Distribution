package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootBrokerRequest extends js.Object {
  /**
    * 
    The list of broker IDs to be rebooted.
    
    */
  var BrokerIds: listOfString = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster to be updated.
    
    */
  var ClusterArn: string = js.native
}

object RebootBrokerRequest {
  @scala.inline
  def apply(BrokerIds: listOfString, ClusterArn: string): RebootBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerIds = BrokerIds.asInstanceOf[js.Any], ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootBrokerRequest]
  }
  @scala.inline
  implicit class RebootBrokerRequestOps[Self <: RebootBrokerRequest] (val x: Self) extends AnyVal {
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
    def setBrokerIdsVarargs(value: string*): Self = this.set("BrokerIds", js.Array(value :_*))
    @scala.inline
    def setBrokerIds(value: listOfString): Self = this.set("BrokerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
  }
  
}

