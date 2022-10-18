package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.Function2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDiffMod {
  
  @JSImport("baconjs/types/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diff[V, V2](src: default[V], start: V, f: Differ[V, V2]): Property[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(src.asInstanceOf[js.Any], start.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[V2]]
  
  type Differ[V, V2] = Function2[V, V, V2]
}
