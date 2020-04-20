package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeNameAndValue extends js.Object {
  /**
    * The attribute name of the typed link.
    */
  var AttributeName: typings.awsSdk.clouddirectoryMod.AttributeName = js.native
  /**
    * The value for the typed link.
    */
  var Value: TypedAttributeValue = js.native
}

object AttributeNameAndValue {
  @scala.inline
  def apply(AttributeName: AttributeName, Value: TypedAttributeValue): AttributeNameAndValue = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNameAndValue]
  }
}

