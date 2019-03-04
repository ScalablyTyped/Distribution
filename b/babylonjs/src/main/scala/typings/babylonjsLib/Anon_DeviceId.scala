package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceId extends js.Object {
  var deviceId: java.lang.String
  var maxHeight: scala.Double
  var maxWidth: scala.Double
  var minHeight: scala.Double
  var minWidth: scala.Double
}

object Anon_DeviceId {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    maxHeight: scala.Double,
    maxWidth: scala.Double,
    minHeight: scala.Double,
    minWidth: scala.Double
  ): Anon_DeviceId = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, maxHeight = maxHeight, maxWidth = maxWidth, minHeight = minHeight, minWidth = minWidth)
  
    __obj.asInstanceOf[Anon_DeviceId]
  }
}

