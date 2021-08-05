package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endonerrorMod {
  
  @JSImport("baconjs/types/endonerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](src: typings.baconjs.observableMod.default[T]): typings.baconjs.observableMod.default[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[typings.baconjs.observableMod.default[T]]
  inline def default[T](
    src: typings.baconjs.observableMod.default[T],
    predicate: js.Function1[/* error */ js.Any, Boolean]
  ): typings.baconjs.observableMod.default[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[T]]
}
