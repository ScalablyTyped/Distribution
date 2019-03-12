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
  def apply(init: () => scala.Unit, main: () => scala.Unit): Context = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), main = js.Any.fromFunction0(main))
  
    __obj.asInstanceOf[Context]
  }
}

