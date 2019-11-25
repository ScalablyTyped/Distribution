package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UuidHeaderValue extends MessageHeaderValue {
  var `type`: uuid
  var value: String
}

object UuidHeaderValue {
  @scala.inline
  def apply(`type`: uuid, value: String): UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidHeaderValue]
  }
}

