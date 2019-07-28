package typings.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
  var `type`: String
  def getter(cb: js.Function1[/* val */ String, Unit]): Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    getter: js.Function1[/* val */ String, Unit] => Unit,
    `type`: String,
    setter: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Unit = null
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
    __obj.updateDynamic("type")(`type`)
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2(setter))
    __obj.asInstanceOf[Anon_Cb]
  }
}

