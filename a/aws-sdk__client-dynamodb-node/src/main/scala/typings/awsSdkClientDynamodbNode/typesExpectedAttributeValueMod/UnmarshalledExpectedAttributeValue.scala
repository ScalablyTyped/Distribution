package typings.awsSdkClientDynamodbNode.typesExpectedAttributeValueMod

import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledExpectedAttributeValue extends ExpectedAttributeValue {
  /**
    * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p> <p>For information on specifying data types in JSON, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("AttributeValueList")
  var AttributeValueList_UnmarshalledExpectedAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.native
  /**
    * <p>Represents the data for the expected attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("Value")
  var Value_UnmarshalledExpectedAttributeValue: js.UndefOr[UnmarshalledAttributeValue] = js.native
}

object UnmarshalledExpectedAttributeValue {
  @scala.inline
  def apply(): UnmarshalledExpectedAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledExpectedAttributeValue]
  }
  @scala.inline
  implicit class UnmarshalledExpectedAttributeValueOps[Self <: UnmarshalledExpectedAttributeValue] (val x: Self) extends AnyVal {
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
    def setAttributeValueListVarargs(value: UnmarshalledAttributeValue*): Self = this.set("AttributeValueList", js.Array(value :_*))
    @scala.inline
    def setAttributeValueList(value: js.Array[UnmarshalledAttributeValue]): Self = this.set("AttributeValueList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValueList: Self = this.set("AttributeValueList", js.undefined)
    @scala.inline
    def setValue(value: UnmarshalledAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

