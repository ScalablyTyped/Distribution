package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepeatMod {
  
  @JSImport("baconjs/types/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typings.baconjs.typesObservableMod.default[V]]]
  ): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generator.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
}
