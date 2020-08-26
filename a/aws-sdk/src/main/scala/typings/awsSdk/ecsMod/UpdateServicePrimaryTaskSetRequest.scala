package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServicePrimaryTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the deployment.
    */
  var primaryTaskSet: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String = js.native
}

object UpdateServicePrimaryTaskSetRequest {
  @scala.inline
  def apply(cluster: String, primaryTaskSet: String, service: String): UpdateServicePrimaryTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], primaryTaskSet = primaryTaskSet.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetRequest]
  }
  @scala.inline
  implicit class UpdateServicePrimaryTaskSetRequestOps[Self <: UpdateServicePrimaryTaskSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryTaskSet(value: String): Self = this.set("primaryTaskSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

