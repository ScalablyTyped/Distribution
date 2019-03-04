package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecvFromInfo extends js.Object {
  var address: java.lang.String
  var data: stdLib.ArrayBuffer
  var port: scala.Double
  var resultCode: scala.Double
}

object RecvFromInfo {
  @scala.inline
  def apply(address: java.lang.String, data: stdLib.ArrayBuffer, port: scala.Double, resultCode: scala.Double): RecvFromInfo = {
    val __obj = js.Dynamic.literal(address = address, data = data, port = port, resultCode = resultCode)
  
    __obj.asInstanceOf[RecvFromInfo]
  }
}

