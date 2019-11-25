package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.timestamp
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampHeaderValue extends MessageHeaderValue {
  var `type`: timestamp
  var value: Date
}

object TimestampHeaderValue {
  @scala.inline
  def apply(`type`: timestamp, value: Date): TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampHeaderValue]
  }
}

