package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  /**
    * The field identifier.
    */
  var key: fieldNameString = js.native
  /**
    * The field value, expressed as the identifier of another object.
    */
  var refValue: js.UndefOr[fieldNameString] = js.native
  /**
    * The field value, expressed as a String.
    */
  var stringValue: js.UndefOr[fieldStringValue] = js.native
}

object Field {
  @scala.inline
  def apply(key: fieldNameString, refValue: fieldNameString = null, stringValue: fieldStringValue = null): Field = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (refValue != null) __obj.updateDynamic("refValue")(refValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

