package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttributeValue extends js.Object {
  /**
    * A date value expressed as seconds from the Unix epoch.
    */
  var DateValue: js.UndefOr[Timestamp] = js.native
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.native
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.native
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.native
}

object DocumentAttributeValue {
  @scala.inline
  def apply(
    DateValue: Timestamp = null,
    LongValue: Int | Double = null,
    StringListValue: DocumentAttributeStringListValue = null,
    StringValue: DocumentAttributeStringValue = null
  ): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (DateValue != null) __obj.updateDynamic("DateValue")(DateValue.asInstanceOf[js.Any])
    if (LongValue != null) __obj.updateDynamic("LongValue")(LongValue.asInstanceOf[js.Any])
    if (StringListValue != null) __obj.updateDynamic("StringListValue")(StringListValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttributeValue]
  }
}

