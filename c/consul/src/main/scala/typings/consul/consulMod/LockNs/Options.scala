package typings.consul.consulMod.LockNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var key: String
  var lockretrytime: js.UndefOr[String] = js.undefined
  var lockwaittime: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[js.Object | String] = js.undefined
  var value: js.UndefOr[String | Buffer] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: String,
    lockretrytime: String = null,
    lockwaittime: String = null,
    session: js.Object | String = null,
    value: String | Buffer = null
  ): Options = {
    val __obj = js.Dynamic.literal(key = key)
    if (lockretrytime != null) __obj.updateDynamic("lockretrytime")(lockretrytime)
    if (lockwaittime != null) __obj.updateDynamic("lockwaittime")(lockwaittime)
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

