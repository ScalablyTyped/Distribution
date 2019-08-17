package typings.atAwsDashSdkEventstreamDashMarshaller.buildEventStreamMarshallerMod

import typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.Message
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller/build/EventStreamMarshaller", "EventStreamMarshaller")
@js.native
class EventStreamMarshaller protected () extends js.Object {
  def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  val headerMarshaller: js.Any = js.native
  /**
    * Convert a structured JavaScript object with tagged headers into a binary
    * event stream message.
    */
  def marshall(hasHeadersBody: Message): Uint8Array = js.native
  /**
    * Convert a binary event stream message into a JavaScript object with an
    * opaque, binary body and tagged, parsed headers.
    */
  def unmarshall(message: ArrayBufferView): Message = js.native
}

