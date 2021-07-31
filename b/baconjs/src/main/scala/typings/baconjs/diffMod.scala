package typings.baconjs

import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.typesMod.Function2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("baconjs/types/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def diff[V, V2](src: default[V], start: V, f: Differ[V, V2]): Property[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(src.asInstanceOf[js.Any], start.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[V2]]
  
  type Differ[V, V2] = Function2[V, V, V2]
}
