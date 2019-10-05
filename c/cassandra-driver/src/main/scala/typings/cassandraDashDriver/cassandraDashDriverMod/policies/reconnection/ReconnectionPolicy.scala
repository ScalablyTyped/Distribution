package typings.cassandraDashDriver.cassandraDashDriverMod.policies.reconnection

import typings.cassandraDashDriver.Anon_Next
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectionPolicy extends js.Object {
  def getOptions(): Map[String, _]
  def newSchedule(): Anon_Next
}

object ReconnectionPolicy {
  @scala.inline
  def apply(getOptions: () => Map[String, _], newSchedule: () => Anon_Next): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
  
    __obj.asInstanceOf[ReconnectionPolicy]
  }
}

