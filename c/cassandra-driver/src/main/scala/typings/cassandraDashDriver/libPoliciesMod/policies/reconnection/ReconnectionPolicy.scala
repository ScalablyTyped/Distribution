package typings.cassandraDashDriver.libPoliciesMod.policies.reconnection

import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectionPolicy extends js.Object {
  def getOptions(): Map[String, js.Object]
  def newSchedule(): Iterator[Double, _, js.UndefOr[scala.Nothing]]
}

object ReconnectionPolicy {
  @scala.inline
  def apply(
    getOptions: () => Map[String, js.Object],
    newSchedule: () => Iterator[Double, _, js.UndefOr[scala.Nothing]]
  ): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
  
    __obj.asInstanceOf[ReconnectionPolicy]
  }
}

