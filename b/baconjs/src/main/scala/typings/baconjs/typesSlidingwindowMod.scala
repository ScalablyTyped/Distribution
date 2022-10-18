package typings.baconjs

import typings.baconjs.typesObservableMod.Observable
import typings.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSlidingwindowMod {
  
  @JSImport("baconjs/types/slidingwindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def slidingWindow[V](src: Observable[V], maxValues: Double): Property[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("slidingWindow")(src.asInstanceOf[js.Any], maxValues.asInstanceOf[js.Any])).asInstanceOf[Property[js.Array[V]]]
  inline def slidingWindow[V](src: Observable[V], maxValues: Double, minValues: Double): Property[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("slidingWindow")(src.asInstanceOf[js.Any], maxValues.asInstanceOf[js.Any], minValues.asInstanceOf[js.Any])).asInstanceOf[Property[js.Array[V]]]
}
