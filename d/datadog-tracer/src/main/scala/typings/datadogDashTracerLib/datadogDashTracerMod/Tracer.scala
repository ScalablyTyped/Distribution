package typings
package datadogDashTracerLib.datadogDashTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait Tracer extends js.Object {
  @JSName("addEventListener")
  def addEventListener_error(method: datadogDashTracerLib.datadogDashTracerLibStrings.error): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    method: datadogDashTracerLib.datadogDashTracerLibStrings.error,
    cb: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_error(method: datadogDashTracerLib.datadogDashTracerLibStrings.error): scala.Unit = js.native
  @JSName("on")
  def on_error(
    method: datadogDashTracerLib.datadogDashTracerLibStrings.error,
    cb: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

