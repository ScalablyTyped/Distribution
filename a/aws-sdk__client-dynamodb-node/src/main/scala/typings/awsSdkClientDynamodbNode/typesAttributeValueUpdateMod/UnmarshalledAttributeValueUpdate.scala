package typings.awsSdkClientDynamodbNode.typesAttributeValueUpdateMod

import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAttributeValueUpdate extends AttributeValueUpdate {
  /**
    * <p>Represents the data for an attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  @JSName("Value")
  var Value_UnmarshalledAttributeValueUpdate: js.UndefOr[UnmarshalledAttributeValue] = js.native
}

object UnmarshalledAttributeValueUpdate {
  @scala.inline
  def apply(): UnmarshalledAttributeValueUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAttributeValueUpdate]
  }
  @scala.inline
  implicit class UnmarshalledAttributeValueUpdateOps[Self <: UnmarshalledAttributeValueUpdate] (val x: Self) extends AnyVal {
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
    def setValue(value: UnmarshalledAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

