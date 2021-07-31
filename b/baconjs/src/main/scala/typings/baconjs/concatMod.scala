package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("baconjs/types/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concatAll[V](streams_ : (default[V] | js.Array[default[V]])*): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(streams_.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  
  @scala.inline
  def concatE[V, V2](left: EventStream[V], right: default[V2]): EventStream[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatE")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[EventStream[V | V2]]
  @scala.inline
  def concatE[V, V2](left: EventStream[V], right: default[V2], options: EventStreamOptions): EventStream[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatE")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventStream[V | V2]]
}
