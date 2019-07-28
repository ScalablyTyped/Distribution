package typings.connectDashBusboy.connectDashBusboyMod.Global.ExpressNs

import typings.busboy.busboyNs.Busboy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var busboy: Busboy
}

object Request {
  @scala.inline
  def apply(busboy: Busboy): Request = {
    val __obj = js.Dynamic.literal(busboy = busboy)
  
    __obj.asInstanceOf[Request]
  }
}

