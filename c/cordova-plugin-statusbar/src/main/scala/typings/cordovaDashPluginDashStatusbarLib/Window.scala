package typings
package cordovaDashPluginDashStatusbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var StatusBar: cordovaDashPluginDashStatusbarLib.StatusBar
}

object Window {
  @scala.inline
  def apply(StatusBar: StatusBar): Window = {
    val __obj = js.Dynamic.literal(StatusBar = StatusBar)
  
    __obj.asInstanceOf[Window]
  }
}

