package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalResultAttribute extends js.Object {
  /**
    * The key that identifies the attribute.
    */
  var Key: String = js.native
  /**
    * An object that contains the attribute value.
    */
  var Value: AdditionalResultAttributeValue = js.native
  /**
    * The data type of the Value property.
    */
  var ValueType: AdditionalResultAttributeValueType = js.native
}

object AdditionalResultAttribute {
  @scala.inline
  def apply(Key: String, Value: AdditionalResultAttributeValue, ValueType: AdditionalResultAttributeValueType): AdditionalResultAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalResultAttribute]
  }
}

