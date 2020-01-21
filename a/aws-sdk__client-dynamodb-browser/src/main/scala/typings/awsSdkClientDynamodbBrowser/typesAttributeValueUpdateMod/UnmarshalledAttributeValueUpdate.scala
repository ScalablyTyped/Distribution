package typings.awsSdkClientDynamodbBrowser.typesAttributeValueUpdateMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ADD
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PUT
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAttributeValueUpdate extends AttributeValueUpdate {
  /**
    * <p>Represents the data for an attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  @JSName("Value")
  var Value_UnmarshalledAttributeValueUpdate: js.UndefOr[UnmarshalledAttributeValue] = js.undefined
}

object UnmarshalledAttributeValueUpdate {
  @scala.inline
  def apply(Action: ADD | PUT | DELETE | String = null, Value: UnmarshalledAttributeValue = null): UnmarshalledAttributeValueUpdate = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAttributeValueUpdate]
  }
}

