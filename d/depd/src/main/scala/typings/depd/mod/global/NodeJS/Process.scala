package typings.depd.mod.global.NodeJS

import typings.depd.depdStrings.deprecation
import typings.depd.mod.DeprecationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends js.Object {
  
  @JSName("addListener")
  def addListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_deprecation(event: deprecation, code: DeprecationError): Boolean = js.native
  
  @JSName("listeners")
  def listeners_deprecation(event: deprecation): js.Array[DeprecationError] = js.native
  
  @JSName("on")
  def on_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
  
  @JSName("once")
  def once_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type = js.native
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
  
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmit(value: (deprecation, DeprecationError) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setListeners(value: deprecation => js.Array[DeprecationError]): Self = this.set("listeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnce(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = this.set("once", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrependListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = this.set("prependListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrependOnceListener(value: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => Process): Self = this.set("prependOnceListener", js.Any.fromFunction2(value))
  }
}
