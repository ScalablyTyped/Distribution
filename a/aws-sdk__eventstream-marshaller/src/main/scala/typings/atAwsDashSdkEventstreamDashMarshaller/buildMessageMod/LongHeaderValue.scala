package typings.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod

import typings.atAwsDashSdkEventstreamDashMarshaller.atAwsDashSdkEventstreamDashMarshallerStrings.long
import typings.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64
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

