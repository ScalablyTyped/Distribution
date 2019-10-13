package typings.depd.depdMod._Global_.NodeJS

import typings.depd.depdMod.DeprecationError
import typings.depd.depdStrings.deprecation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  @JSName("addListener")
  def addListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("emit")
  def emit_deprecation(event: deprecation, code: DeprecationError): Boolean
  @JSName("listeners")
  def listeners_deprecation(event: deprecation): js.Array[DeprecationError]
  @JSName("on")
  def on_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("once")
  def once_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("prependListener")
  def prependListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
}

object Process {
  @scala.inline
  def apply(
    addListener_deprecation: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    emit_deprecation: (deprecation, DeprecationError) => Boolean,
    listeners_deprecation: deprecation => js.Array[DeprecationError],
    on_deprecation: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    once_deprecation: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    prependListener_deprecation: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    prependOnceListener_deprecation: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process
  ): Process = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_deprecation))
    __obj.updateDynamic("emit")(js.Any.fromFunction2(emit_deprecation))
    __obj.updateDynamic("listeners")(js.Any.fromFunction1(listeners_deprecation))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_deprecation))
    __obj.updateDynamic("once")(js.Any.fromFunction2(once_deprecation))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2(prependListener_deprecation))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2(prependOnceListener_deprecation))
    __obj.asInstanceOf[Process]
  }
}

