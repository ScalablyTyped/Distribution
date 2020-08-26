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
  def apply(ElasticIp: String): UpdateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticIpRequest]
  }
  @scala.inline
  implicit class UpdateElasticIpRequestOps[Self <: UpdateElasticIpRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

