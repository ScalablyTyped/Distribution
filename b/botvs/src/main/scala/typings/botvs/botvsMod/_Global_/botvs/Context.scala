package typings.botvs.botvsMod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def init(): Unit
  def main(): Unit
}

object Context {
  @scala.inline
  def apply(init: () => Unit, main: () => Unit): Context = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), main = js.Any.fromFunction0(main))
  
    __obj.asInstanceOf[Context]
  }
}

