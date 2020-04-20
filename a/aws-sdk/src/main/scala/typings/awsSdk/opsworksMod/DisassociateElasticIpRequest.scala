package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String = js.native
}

object DisassociateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String): DisassociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateElasticIpRequest]
  }
}

