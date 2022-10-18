package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndonerrorMod {
  
  @JSImport("baconjs/types/endonerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](src: typings.baconjs.typesObservableMod.default[T]): typings.baconjs.typesObservableMod.default[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[typings.baconjs.typesObservableMod.default[T]]
  inline def default[T](
    src: typings.baconjs.typesObservableMod.default[T],
    predicate: js.Function1[/* error */ Any, Boolean]
  ): typings.baconjs.typesObservableMod.default[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.typesObservableMod.default[T]]
}
