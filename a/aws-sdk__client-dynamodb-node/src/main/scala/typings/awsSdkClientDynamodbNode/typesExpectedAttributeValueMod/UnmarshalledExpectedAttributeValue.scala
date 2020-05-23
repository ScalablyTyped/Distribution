package typings.awsSdkClientDynamodbNode.typesExpectedAttributeValueMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BEGINS_WITH
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BETWEEN
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CONTAINS
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.EQ
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GT
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IN
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LT
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_CONTAINS
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_NULL
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NULL
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledExpectedAttributeValue extends ExpectedAttributeValue {
  /**
    * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p> <p>For information on specifying data types in JSON, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("AttributeValueList")
  var AttributeValueList_UnmarshalledExpectedAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>Represents the data for the expected attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("Value")
  var Value_UnmarshalledExpectedAttributeValue: js.UndefOr[UnmarshalledAttributeValue] = js.undefined
}

object UnmarshalledExpectedAttributeValue {
  @scala.inline
  def apply(
    AttributeValueList: js.Array[UnmarshalledAttributeValue] = null,
    ComparisonOperator: EQ | NE | IN | LE | LT | GE | GT | BETWEEN | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | String = null,
    Exists: js.UndefOr[Boolean] = js.undefined,
    Value: UnmarshalledAttributeValue = null
  ): UnmarshalledExpectedAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (AttributeValueList != null) __obj.updateDynamic("AttributeValueList")(AttributeValueList.asInstanceOf[js.Any])
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (!js.isUndefined(Exists)) __obj.updateDynamic("Exists")(Exists.get.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledExpectedAttributeValue]
  }
}

