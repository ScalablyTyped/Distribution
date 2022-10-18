package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesTypesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalPropertyfromstreamsubscribeMod {
  
  @JSImport("baconjs/types/internal/propertyfromstreamsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](desc: Desc, subscribe: Subscribe[V]): Property[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(desc.asInstanceOf[js.Any], subscribe.asInstanceOf[js.Any])).asInstanceOf[Property[V]]
}
