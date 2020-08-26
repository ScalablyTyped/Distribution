package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShippingLabelOutput extends js.Object {
  var ShippingLabelURL: js.UndefOr[GenericString] = js.native
  var Warning: js.UndefOr[GenericString] = js.native
}

object GetShippingLabelOutput {
  @scala.inline
  def apply(): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
  @scala.inline
  implicit class GetShippingLabelOutputOps[Self <: GetShippingLabelOutput] (val x: Self) extends AnyVal {
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
    def setShippingLabelURL(value: GenericString): Self = this.set("ShippingLabelURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingLabelURL: Self = this.set("ShippingLabelURL", js.undefined)
    @scala.inline
    def setWarning(value: GenericString): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
  
}

