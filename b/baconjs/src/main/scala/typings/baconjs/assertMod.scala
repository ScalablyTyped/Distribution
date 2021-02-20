package typings.baconjs

import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("baconjs/types/internal/assert", "assert")
  @js.native
  def assert(message: String, condition: Boolean): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertArray")
  @js.native
  def assertArray(xs: js.Array[_]): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertEventStream")
  @js.native
  def assertEventStream(event: js.Any): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertFunction")
  @js.native
  def assertFunction(): Unit = js.native
  @JSImport("baconjs/types/internal/assert", "assertFunction")
  @js.native
  def assertFunction(f: js.Function): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertNoArguments")
  @js.native
  def assertNoArguments(args: IArguments): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertObservable")
  @js.native
  def assertObservable(observable: js.Any): Unit = js.native
  
  @JSImport("baconjs/types/internal/assert", "assertObservableIsProperty")
  @js.native
  def assertObservableIsProperty(x: js.Any): Unit = js.native
}
