package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticIpStatus extends js.Object {
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.native
  /**
    * The status of the elastic IP (EIP) address.
    */
  var Status: js.UndefOr[String] = js.native
}

object ElasticIpStatus {
  @scala.inline
  def apply(ElasticIp: String = null, Status: String = null): ElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticIpStatus]
  }
}

