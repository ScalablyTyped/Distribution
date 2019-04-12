package typings
package connectDashBusboyLib.connectDashBusboyMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var busboy: busboyLib.busboyNs.Busboy
}

object Request {
  @scala.inline
  def apply(busboy: busboyLib.busboyNs.Busboy): Request = {
    val __obj = js.Dynamic.literal(busboy = busboy)
  
    __obj.asInstanceOf[Request]
  }
}

