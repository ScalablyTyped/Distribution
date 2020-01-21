package typings.awsSdkEventstreamMarshaller.messageMod

import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanHeaderValue extends MessageHeaderValue {
  var `type`: boolean
  var value: Boolean
}

object BooleanHeaderValue {
  @scala.inline
  def apply(`type`: boolean, value: Boolean): BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanHeaderValue]
  }
}

