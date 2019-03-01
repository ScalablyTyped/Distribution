package typings
package consulLib.consulMod.ConsulNs.LockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var key: java.lang.String
  var lockretrytime: js.UndefOr[java.lang.String] = js.undefined
  var lockwaittime: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: java.lang.String,
    lockretrytime: java.lang.String = null,
    lockwaittime: java.lang.String = null,
    session: js.Object | java.lang.String = null,
    value: java.lang.String | nodeLib.Buffer = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (lockretrytime != null) __obj.updateDynamic("lockretrytime")(lockretrytime)
    if (lockwaittime != null) __obj.updateDynamic("lockwaittime")(lockwaittime)
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

