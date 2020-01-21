package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String, StackId: String): RegisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterElasticIpRequest]
  }
}

