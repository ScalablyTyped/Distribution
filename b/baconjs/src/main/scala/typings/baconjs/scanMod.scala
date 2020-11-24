package typings.baconjs

import typings.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/scan", JSImport.Namespace)
@js.native
object scanMod extends js.Object {
  
  def default[In, Out](src: typings.baconjs.observableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
  
  type Accumulator[In, Out] = js.Function2[/* acc */ Out, /* value */ In, Out]
}
