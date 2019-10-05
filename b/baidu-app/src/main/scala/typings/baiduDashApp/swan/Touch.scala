package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var clientX: Double
  var clientY: Double
  var identifier: Double
  var pageX: Double
  var pageY: Double
}

object Touch {
  @scala.inline
  def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, identifier = identifier, pageX = pageX, pageY = pageY)
  
    __obj.asInstanceOf[Touch]
  }
}

