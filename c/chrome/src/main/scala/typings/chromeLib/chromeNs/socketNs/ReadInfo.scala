package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: stdLib.ArrayBuffer
  var resultCode: scala.Double
}

object ReadInfo {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer, resultCode: scala.Double): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data, resultCode = resultCode)
  
    __obj.asInstanceOf[ReadInfo]
  }
}

