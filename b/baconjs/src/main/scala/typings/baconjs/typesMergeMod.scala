package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergeMod {
  
  @JSImport("baconjs/types/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeAll[V](streams: (default[V] | js.Array[default[V]])*): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EventStream[V]]
}
