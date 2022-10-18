package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFromarrayMod {
  
  @JSImport("baconjs/types/fromarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](values: js.Array[T | Event[T]]): EventStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any]).asInstanceOf[EventStream[T]]
}
