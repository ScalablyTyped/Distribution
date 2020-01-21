package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdiagnostics extends js.Object {
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit
}

object Typeofdiagnostics {
  @scala.inline
  def apply(sendPacket: (js.Object, js.Function0[Unit]) => Unit): Typeofdiagnostics = {
    val __obj = js.Dynamic.literal(sendPacket = js.Any.fromFunction2(sendPacket))
  
    __obj.asInstanceOf[Typeofdiagnostics]
  }
}

