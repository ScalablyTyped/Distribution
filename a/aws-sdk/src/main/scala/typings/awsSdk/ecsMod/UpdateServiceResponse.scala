package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceResponse extends js.Object {
  /**
    * The full description of your service following the update call.
    */
  var service: js.UndefOr[Service] = js.native
}

object UpdateServiceResponse {
  @scala.inline
  def apply(): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceResponse]
  }
  @scala.inline
  implicit class UpdateServiceResponseOps[Self <: UpdateServiceResponse] (val x: Self) extends AnyVal {
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
    def setService(value: Service): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

