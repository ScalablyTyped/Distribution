package typings.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in braintree-web.braintree-web/modules/hosted-fields.HostedFieldsHostedFieldsFieldName ]: braintree-web.braintree-web/modules/hosted-fields.HostedFieldsHostedFieldsFieldData} */
@js.native
trait HostedFieldsFieldDataFields extends js.Object {
  var cvv: HostedFieldsHostedFieldsFieldData = js.native
  var expirationDate: HostedFieldsHostedFieldsFieldData = js.native
  var expirationMonth: HostedFieldsHostedFieldsFieldData = js.native
  var expirationYear: HostedFieldsHostedFieldsFieldData = js.native
  var number: HostedFieldsHostedFieldsFieldData = js.native
  var postalCode: HostedFieldsHostedFieldsFieldData = js.native
}

object HostedFieldsFieldDataFields {
  @scala.inline
  def apply(
    cvv: HostedFieldsHostedFieldsFieldData,
    expirationDate: HostedFieldsHostedFieldsFieldData,
    expirationMonth: HostedFieldsHostedFieldsFieldData,
    expirationYear: HostedFieldsHostedFieldsFieldData,
    number: HostedFieldsHostedFieldsFieldData,
    postalCode: HostedFieldsHostedFieldsFieldData
  ): HostedFieldsFieldDataFields = {
    val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsFieldDataFields]
  }
  @scala.inline
  implicit class HostedFieldsFieldDataFieldsOps[Self <: HostedFieldsFieldDataFields] (val x: Self) extends AnyVal {
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
    def setCvv(value: HostedFieldsHostedFieldsFieldData): Self = this.set("cvv", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: HostedFieldsHostedFieldsFieldData): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationMonth(value: HostedFieldsHostedFieldsFieldData): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationYear(value: HostedFieldsHostedFieldsFieldData): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: HostedFieldsHostedFieldsFieldData): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: HostedFieldsHostedFieldsFieldData): Self = this.set("postalCode", value.asInstanceOf[js.Any])
  }
  
}

