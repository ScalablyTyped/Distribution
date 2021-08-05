package typings.baconjs

import typings.baconjs.observableMod.Property
import typings.baconjs.scanMod.Accumulator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldMod {
  
  @JSImport("baconjs/types/fold", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[In, Out](src: typings.baconjs.observableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[Out]]
}
