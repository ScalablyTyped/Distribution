package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSService extends js.Object {
  /**
    *  The name of the cluster that the Amazon ECS service is associated with. 
    */
  var clusterName: js.UndefOr[ECSClusterName] = js.native
  /**
    *  The name of the target Amazon ECS service. 
    */
  var serviceName: js.UndefOr[ECSServiceName] = js.native
}

object ECSService {
  @scala.inline
  def apply(): ECSService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSService]
  }
  @scala.inline
  implicit class ECSServiceOps[Self <: ECSService] (val x: Self) extends AnyVal {
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
    def setClusterName(value: ECSClusterName): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    @scala.inline
    def setServiceName(value: ECSServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

