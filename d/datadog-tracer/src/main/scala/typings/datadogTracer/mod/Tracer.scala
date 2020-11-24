package typings.datadogTracer.mod

import typings.datadogTracer.datadogTracerStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracer
  extends typings.opentracing.tracerMod.Tracer {
  
  @JSName("addEventListener")
  def addEventListener_error(method: error): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  
  @JSName("on")
  def on_error(method: error): Unit = js.native
  @JSName("on")
  def on_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
}
