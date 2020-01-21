package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateElasticIpRequest extends js.Object {
  /**
    * The IP address for which you want to update the name.
    */
  var ElasticIp: String = js.native
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.native
}

object UpdateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String, Name: String = null): UpdateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticIpRequest]
  }
}

