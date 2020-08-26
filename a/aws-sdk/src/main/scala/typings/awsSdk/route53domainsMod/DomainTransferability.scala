package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainTransferability extends js.Object {
  var Transferable: js.UndefOr[typings.awsSdk.route53domainsMod.Transferable] = js.native
}

object DomainTransferability {
  @scala.inline
  def apply(): DomainTransferability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainTransferability]
  }
  @scala.inline
  implicit class DomainTransferabilityOps[Self <: DomainTransferability] (val x: Self) extends AnyVal {
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
    def setTransferable(value: Transferable): Self = this.set("Transferable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferable: Self = this.set("Transferable", js.undefined)
  }
  
}

