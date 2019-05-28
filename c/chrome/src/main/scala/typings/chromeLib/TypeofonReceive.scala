package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofonReceive extends js.Object {
  def addListener(
    callback: js.Function1[/* info */ chromeLib.chromeNs.serialNs.onReceiveNs.OnReceiveInfo, scala.Unit]
  ): scala.Unit
}

object TypeofonReceive {
  @scala.inline
  def apply(
    addListener: js.Function1[/* info */ chromeLib.chromeNs.serialNs.onReceiveNs.OnReceiveInfo, scala.Unit] => scala.Unit
  ): TypeofonReceive = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[TypeofonReceive]
  }
}

