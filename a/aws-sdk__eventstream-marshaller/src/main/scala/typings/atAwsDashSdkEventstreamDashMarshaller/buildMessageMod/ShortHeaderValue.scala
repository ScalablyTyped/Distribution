package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortHeaderValue extends MessageHeaderValue {
  var `type`: short
  var value: Double
}

object ShortHeaderValue {
  @scala.inline
  def apply(`type`: short, value: Double): ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShortHeaderValue]
  }
}

