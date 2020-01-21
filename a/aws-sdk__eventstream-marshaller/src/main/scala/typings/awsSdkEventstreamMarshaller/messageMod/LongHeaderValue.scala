package typings.awsSdkEventstreamMarshaller.messageMod

import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typings.awsSdkEventstreamMarshaller.int64Mod.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongHeaderValue extends MessageHeaderValue {
  var `type`: long
  var value: Int64
}

object LongHeaderValue {
  @scala.inline
  def apply(`type`: long, value: Int64): LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongHeaderValue]
  }
}

