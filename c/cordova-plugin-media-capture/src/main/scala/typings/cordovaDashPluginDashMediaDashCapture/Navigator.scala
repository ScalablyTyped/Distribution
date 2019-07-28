package typings.cordovaDashPluginDashMediaDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var device: Device
}

object Navigator {
  @scala.inline
  def apply(device: Device): Navigator = {
    val __obj = js.Dynamic.literal(device = device)
  
    __obj.asInstanceOf[Navigator]
  }
}

