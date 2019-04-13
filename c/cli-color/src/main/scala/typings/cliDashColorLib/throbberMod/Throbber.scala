package typings
package cliDashColorLib.throbberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throbber extends js.Object {
  def restart(): scala.Unit
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Throbber {
  @scala.inline
  def apply(restart: () => scala.Unit, start: () => scala.Unit, stop: () => scala.Unit): Throbber = {
    val __obj = js.Dynamic.literal(restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Throbber]
  }
}

