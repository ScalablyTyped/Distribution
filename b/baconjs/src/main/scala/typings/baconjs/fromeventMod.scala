package typings.baconjs

import typings.baconjs.frombinderMod.EventTransformer
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromeventMod {
  
  @JSImport("baconjs/types/fromevent", JSImport.Default)
  @js.native
  def default[V](target: js.Any, eventSource: String): EventStream[V] = js.native
  @JSImport("baconjs/types/fromevent", JSImport.Default)
  @js.native
  def default[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  @JSImport("baconjs/types/fromevent", JSImport.Default)
  @js.native
  def default[V](target: js.Any, eventSource: EventSourceFn): EventStream[V] = js.native
  @JSImport("baconjs/types/fromevent", JSImport.Default)
  @js.native
  def default[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  
  type EventSourceFn = js.Function2[/* binder */ js.Function, /* listener */ js.Function, js.Any]
}
