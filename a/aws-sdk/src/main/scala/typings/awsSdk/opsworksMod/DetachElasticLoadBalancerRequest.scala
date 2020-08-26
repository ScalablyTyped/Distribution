package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachElasticLoadBalancerRequest extends js.Object {
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String = js.native
  /**
    * The ID of the layer that the Elastic Load Balancing instance is attached to.
    */
  var LayerId: String = js.native
}

object DetachElasticLoadBalancerRequest {
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): DetachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachElasticLoadBalancerRequest]
  }
  @scala.inline
  implicit class DetachElasticLoadBalancerRequestOps[Self <: DetachElasticLoadBalancerRequest] (val x: Self) extends AnyVal {
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
    def setElasticLoadBalancerName(value: String): Self = this.set("ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
  }
  
}

