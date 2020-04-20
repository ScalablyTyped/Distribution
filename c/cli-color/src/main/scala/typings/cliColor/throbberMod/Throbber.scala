package typings.cliColor.throbberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throbber extends js.Object {
  def restart(): Unit
  def start(): Unit
  def stop(): Unit
}

object Throbber {
  @scala.inline
  def apply(restart: () => Unit, start: () => Unit, stop: () => Unit): Throbber = {
    val __obj = js.Dynamic.literal(restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Throbber]
  }
}

