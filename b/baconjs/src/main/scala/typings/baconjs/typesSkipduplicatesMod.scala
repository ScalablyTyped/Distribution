package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSkipduplicatesMod {
  
  @JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](src: typings.baconjs.typesObservableMod.default[A]): typings.baconjs.typesObservableMod.default[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[typings.baconjs.typesObservableMod.default[A]]
  inline def default[A](src: typings.baconjs.typesObservableMod.default[A], isEqual: Equals[A]): typings.baconjs.typesObservableMod.default[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.typesObservableMod.default[A]]
  
  inline def equals_[A](a: A, b: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Equals[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}
