package typings
package cliDashColorLib.throbberMod.setupThrobberNs

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
  def apply(restart: js.Function0[scala.Unit], start: js.Function0[scala.Unit], stop: js.Function0[scala.Unit]): Throbber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restart")(restart)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Throbber]
  }
}

