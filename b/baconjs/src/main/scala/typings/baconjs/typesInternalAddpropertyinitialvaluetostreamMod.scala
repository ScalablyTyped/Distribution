package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalAddpropertyinitialvaluetostreamMod {
  
  @JSImport("baconjs/types/internal/addpropertyinitialvaluetostream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](property: Property[V], stream: EventStream[V]): Property[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Property[V]]
}
