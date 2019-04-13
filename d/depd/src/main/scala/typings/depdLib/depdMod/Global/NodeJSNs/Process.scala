package typings
package depdLib.depdMod.Global.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  @JSName("addListener")
  def addListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]
  ): this.type
  @JSName("emit")
  def emit_deprecation(event: depdLib.depdLibStrings.deprecation, code: depdLib.depdMod.DeprecationError): scala.Boolean
  @JSName("listeners")
  def listeners_deprecation(event: depdLib.depdLibStrings.deprecation): js.Array[depdLib.depdMod.DeprecationError]
  @JSName("on")
  def on_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]
  ): this.type
  @JSName("once")
  def once_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]
  ): this.type
  @JSName("prependListener")
  def prependListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]
  ): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]
  ): this.type
}

object Process {
  @scala.inline
  def apply(
    addListener_deprecation: (depdLib.depdLibStrings.deprecation, js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]) => Process,
    emit_deprecation: (depdLib.depdLibStrings.deprecation, depdLib.depdMod.DeprecationError) => scala.Boolean,
    listeners_deprecation: depdLib.depdLibStrings.deprecation => js.Array[depdLib.depdMod.DeprecationError],
    on_deprecation: (depdLib.depdLibStrings.deprecation, js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]) => Process,
    once_deprecation: (depdLib.depdLibStrings.deprecation, js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]) => Process,
    prependListener_deprecation: (depdLib.depdLibStrings.deprecation, js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]) => Process,
    prependOnceListener_deprecation: (depdLib.depdLibStrings.deprecation, js.Function1[/* deprecationError */ depdLib.depdMod.DeprecationError, scala.Unit]) => Process
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

