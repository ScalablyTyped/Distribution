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
  @scala.inline
  implicit class RegisterElasticIpRequestOps[Self <: RegisterElasticIpRequest] (val x: Self) extends AnyVal {
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
  }
  
}

