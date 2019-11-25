package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAttributeValueUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ADD
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DELETE
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.PUT
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAttributeValueMod._UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAttributeValueUpdate extends _AttributeValueUpdate {
  /**
    * <p>Represents the data for an attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  @JSName("Value")
  var Value__UnmarshalledAttributeValueUpdate: js.UndefOr[_UnmarshalledAttributeValue] = js.undefined
}

object _UnmarshalledAttributeValueUpdate {
  @scala.inline
  def apply(Action: ADD | PUT | DELETE | String = null, Value: _UnmarshalledAttributeValue = null): _UnmarshalledAttributeValueUpdate = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAttributeValueUpdate]
  }
}

