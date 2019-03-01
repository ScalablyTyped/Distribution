package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def init(): scala.Unit
  def main(): scala.Unit
}

object Context {
  @scala.inline
  def apply(init: js.Function0[scala.Unit], main: js.Function0[scala.Unit]): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[Context]
  }
}

