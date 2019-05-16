package typings
package dbusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  var setter: js.UndefOr[
    js.Function2[/* value */ js.Any, /* done */ js.Function0[scala.Unit], scala.Unit]
  ] = js.undefined
  var `type`: java.lang.String
  def getter(cb: js.Function1[/* val */ java.lang.String, scala.Unit]): scala.Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    getter: js.Function1[/* val */ java.lang.String, scala.Unit] => scala.Unit,
    `type`: java.lang.String,
    setter: (/* value */ js.Any, /* done */ js.Function0[scala.Unit]) => scala.Unit = null
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
    __obj.updateDynamic("type")(`type`)
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2(setter))
    __obj.asInstanceOf[Anon_Cb]
  }
}

