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
    addListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    emit: (deprecation, DeprecationError) => Boolean,
    listeners: deprecation => js.Array[DeprecationError],
    on: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    once: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    prependListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process,
    prependOnceListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process
  ): Process = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener))
  
    __obj.asInstanceOf[Process]
  }
}

