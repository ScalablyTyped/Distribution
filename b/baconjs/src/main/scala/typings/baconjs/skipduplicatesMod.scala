package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipduplicatesMod {
  
  @JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](src: typings.baconjs.observableMod.default[A]): typings.baconjs.observableMod.default[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[typings.baconjs.observableMod.default[A]]
  inline def default[A](src: typings.baconjs.observableMod.default[A], isEqual: Equals[A]): typings.baconjs.observableMod.default[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[A]]
  
  inline def equals_[A](a: A, b: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Equals[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}
