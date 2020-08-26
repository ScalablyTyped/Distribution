package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceActionOutput extends js.Object {
  /**
    * Detailed information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.native
}

object UpdateServiceActionOutput {
  @scala.inline
  def apply(): UpdateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceActionOutput]
  }
  @scala.inline
  implicit class UpdateServiceActionOutputOps[Self <: UpdateServiceActionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServiceActionDetail(value: ServiceActionDetail): Self = this.set("ServiceActionDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceActionDetail: Self = this.set("ServiceActionDetail", js.undefined)
  }
  
}

