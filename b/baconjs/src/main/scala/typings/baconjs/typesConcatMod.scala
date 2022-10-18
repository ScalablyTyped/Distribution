package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.EventStreamOptions
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConcatMod {
  
  @JSImport("baconjs/types/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[V](streams_ : (default[V] | js.Array[default[V]])*): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(streams_.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EventStream[V]]
  
  inline def concatE[V, V2](left: EventStream[V], right: default[V2]): EventStream[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatE")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[EventStream[V | V2]]
  inline def concatE[V, V2](left: EventStream[V], right: default[V2], options: EventStreamOptions): EventStream[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatE")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventStream[V | V2]]
}
