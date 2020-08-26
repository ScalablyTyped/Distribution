package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableEntry extends js.Object {
  /**
    * The data source of the variable.
    */
  var dataSource: js.UndefOr[String] = js.native
  /**
    * The data type of the variable.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * The default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the variable.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the variable. For more information see Variable types. Valid Values: AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY | BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN | CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT | IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY | SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME | SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT | SHIPPING_ZIP | USERAGENT 
    */
  var variableType: js.UndefOr[String] = js.native
}

object VariableEntry {
  @scala.inline
  def apply(): VariableEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableEntry]
  }
  @scala.inline
  implicit class VariableEntryOps[Self <: VariableEntry] (val x: Self) extends AnyVal {
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
    def setDataSource(value: String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableType: Self = this.set("variableType", js.undefined)
  }
  
}

