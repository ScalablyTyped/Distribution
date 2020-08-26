package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxDocuments extends js.Object {
  var IND: js.UndefOr[INDTaxDocuments] = js.native
}

object TaxDocuments {
  @scala.inline
  def apply(): TaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxDocuments]
  }
  @scala.inline
  implicit class TaxDocumentsOps[Self <: TaxDocuments] (val x: Self) extends AnyVal {
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
    def setIND(value: INDTaxDocuments): Self = this.set("IND", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIND: Self = this.set("IND", js.undefined)
  }
  
}

