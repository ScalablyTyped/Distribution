package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVariableRequest extends js.Object {
  /**
    * The source of the data.
    */
  var dataSource: DataSource = js.native
  /**
    * The data type.
    */
  var dataType: DataType = js.native
  /**
    * The default value for the variable when no value is received.
    */
  var defaultValue: String = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the variable.
    */
  var name: String = js.native
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
  /**
    * The variable type. For more information see Variable types.  Valid Values: AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY | BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN | CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT | IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY | SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME | SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT | SHIPPING_ZIP | USERAGENT 
    */
  var variableType: js.UndefOr[String] = js.native
}

object CreateVariableRequest {
  @scala.inline
  def apply(dataSource: DataSource, dataType: DataType, defaultValue: String, name: String): CreateVariableRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVariableRequest]
  }
  @scala.inline
  implicit class CreateVariableRequestOps[Self <: CreateVariableRequest] (val x: Self) extends AnyVal {
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
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: DataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableType: Self = this.set("variableType", js.undefined)
  }
  
}

