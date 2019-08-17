package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringHeaderValue extends MessageHeaderValue {
  var `type`: string
  var value: String
}

object StringHeaderValue {
  @scala.inline
  def apply(`type`: string, value: String): StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringHeaderValue]
  }
}

