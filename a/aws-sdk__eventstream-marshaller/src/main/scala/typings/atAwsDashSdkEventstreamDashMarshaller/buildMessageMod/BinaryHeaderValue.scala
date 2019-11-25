package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.binary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryHeaderValue extends MessageHeaderValue {
  var `type`: binary
  var value: Uint8Array
}

object BinaryHeaderValue {
  @scala.inline
  def apply(`type`: binary, value: Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryHeaderValue]
  }
}

