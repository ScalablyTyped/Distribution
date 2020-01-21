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
  def apply(ElasticIp: String, InstanceId: String = null): AssociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateElasticIpRequest]
  }
}

