package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object AssociateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String): AssociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateElasticIpRequest]
  }
  @scala.inline
  implicit class AssociateElasticIpRequestOps[Self <: AssociateElasticIpRequest] (val x: Self) extends AnyVal {
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
    def setElasticIp(value: String): Self = this.set("ElasticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

