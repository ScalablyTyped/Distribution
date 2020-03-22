package typings.awsSdkEventstreamMarshaller.messageMod

import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.byte
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.short
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.timestamp
import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import typings.awsSdkEventstreamMarshaller.int64Mod.Int64
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue
  - typings.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue
*/
trait MessageHeaderValue extends js.Object

object MessageHeaderValue {
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: Date): MessageHeaderValue = {
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
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
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
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
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
}

