package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerHeaderValue extends MessageHeaderValue {
  var `type`: integer
  var value: Double
}

object IntegerHeaderValue {
  @scala.inline
  def apply(`type`: integer, value: Double): IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IntegerHeaderValue]
  }
}

