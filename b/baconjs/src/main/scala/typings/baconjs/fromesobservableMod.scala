package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromesobservableMod {
  
  @JSImport("baconjs/types/fromesobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](_observable: Any): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_observable.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
}
