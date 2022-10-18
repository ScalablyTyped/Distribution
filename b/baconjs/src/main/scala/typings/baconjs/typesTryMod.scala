package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTryMod {
  
  @JSImport("baconjs/types/try", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, EventStream[Out]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ In, EventStream[Out]]]
}
