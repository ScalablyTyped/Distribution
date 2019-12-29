package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.binary
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.boolean
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.byte
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.integer
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.long
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.short
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.string
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.timestamp
import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.uuid
import typings.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.BooleanHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.ByteHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.ShortHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.IntegerHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.LongHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.BinaryHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.StringHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.TimestampHeaderValue
  - typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.UuidHeaderValue
*/
trait MessageHeaderValue extends js.Object

object MessageHeaderValue {
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: Date): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: Uint8Array): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}

