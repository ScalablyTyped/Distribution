package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceActionOutput extends js.Object {
  /**
    * An object containing information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.native
}

object CreateServiceActionOutput {
  @scala.inline
  def apply(): CreateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceActionOutput]
  }
  @scala.inline
  implicit class CreateServiceActionOutputOps[Self <: CreateServiceActionOutput] (val x: Self) extends AnyVal {
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

