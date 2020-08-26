package typings.awsSdkEventstreamMarshaller.messageMod

import typings.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UuidHeaderValue extends MessageHeaderValue {
  var `type`: uuid = js.native
  var value: String = js.native
}

object UuidHeaderValue {
  @scala.inline
  def apply(`type`: uuid, value: String): UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidHeaderValue]
  }
  @scala.inline
  implicit class UuidHeaderValueOps[Self <: UuidHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: uuid): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

