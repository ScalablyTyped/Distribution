package typings.baconjs

import typings.baconjs.frombinderMod.EventTransformer
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frompromiseMod {
  
  @JSImport("baconjs/types/frompromise", JSImport.Default)
  @js.native
  def default[V](promise: js.Promise[V]): EventStream[V] = js.native
  @JSImport("baconjs/types/frompromise", JSImport.Default)
  @js.native
  def default[V](promise: js.Promise[V], abort: js.UndefOr[scala.Nothing], eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  @JSImport("baconjs/types/frompromise", JSImport.Default)
  @js.native
  def default[V](promise: js.Promise[V], abort: Boolean): EventStream[V] = js.native
  @JSImport("baconjs/types/frompromise", JSImport.Default)
  @js.native
  def default[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
}
