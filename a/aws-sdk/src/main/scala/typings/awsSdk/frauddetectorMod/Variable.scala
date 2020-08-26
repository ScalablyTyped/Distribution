package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /**
    * The ARN of the variable.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * The time when the variable was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The data source of the variable.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /**
    * The data type of the variable. For more information see Variable types.
    */
  var dataType: js.UndefOr[DataType] = js.native
  /**
    * The default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the variable. 
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time when variable was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The name of the variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable type of the variable. Valid Values: AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY | BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN | CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT | IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY | SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME | SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT | SHIPPING_ZIP | USERAGENT 
    */
  var variableType: js.UndefOr[String] = js.native
}

object Variable {
  @scala.inline
  def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataType(value: DataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
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
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
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

