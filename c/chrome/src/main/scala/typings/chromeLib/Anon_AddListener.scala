package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddListener extends js.Object {
  def addListener(
    callback: js.Function1[/* info */ chromeLib.chromeNs.serialNs.onReceiveNs.OnReceiveInfo, scala.Unit]
  ): scala.Unit
}

object Anon_AddListener {
  @scala.inline
  def apply(
    addListener: js.Function1[/* info */ chromeLib.chromeNs.serialNs.onReceiveNs.OnReceiveInfo, scala.Unit] => scala.Unit
  ): Anon_AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[Anon_AddListener]
  }
}

