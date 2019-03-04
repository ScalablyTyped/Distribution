package typings
package cordovaDashIonicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var Keyboard: cordovaDashIonicLib.IonicNs.Keyboard
}

object CordovaPlugins {
  @scala.inline
  def apply(Keyboard: cordovaDashIonicLib.IonicNs.Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

