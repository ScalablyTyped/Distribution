package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in braintree-web.braintree-web.HostedFieldsHostedFieldsFieldName ]: braintree-web.braintree-web.HostedFieldsHostedFieldsFieldData} */
trait HostedFieldsFieldDataFields extends js.Object {
  var cvv: HostedFieldsHostedFieldsFieldData
  var expirationDate: HostedFieldsHostedFieldsFieldData
  var expirationMonth: HostedFieldsHostedFieldsFieldData
  var expirationYear: HostedFieldsHostedFieldsFieldData
  var number: HostedFieldsHostedFieldsFieldData
  var postalCode: HostedFieldsHostedFieldsFieldData
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
}

