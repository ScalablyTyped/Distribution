package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSilenceMod {
  
  @JSImport("baconjs/types/silence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](duration: Double): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(duration.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
}
