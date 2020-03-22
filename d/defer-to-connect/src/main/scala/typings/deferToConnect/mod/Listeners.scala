package typings.deferToConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listeners extends js.Object {
  var close: js.UndefOr[js.Function1[/* hadError */ Boolean, Unit]] = js.undefined
  var connect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var secureConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Listeners {
  @scala.inline
  def apply(
    close: /* hadError */ Boolean => Unit = null,
    connect: () => Unit = null,
    secureConnect: () => Unit = null
  ): Listeners = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction0(connect))
    if (secureConnect != null) __obj.updateDynamic("secureConnect")(js.Any.fromFunction0(secureConnect))
    __obj.asInstanceOf[Listeners]
  }
}

