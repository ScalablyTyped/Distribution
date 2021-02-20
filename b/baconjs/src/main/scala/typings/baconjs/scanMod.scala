package typings.baconjs

import typings.baconjs.observableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanMod {
  
  @JSImport("baconjs/types/scan", JSImport.Default)
  @js.native
  def default[In, Out](src: typings.baconjs.observableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
  
  type Accumulator[In, Out] = js.Function2[/* acc */ Out, /* value */ In, Out]
}
