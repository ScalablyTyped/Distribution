package typings.baconjs

import typings.baconjs.observableMod.Property
import typings.baconjs.scanMod.Accumulator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/fold", JSImport.Namespace)
@js.native
object foldMod extends js.Object {
  
  def default[In, Out](src: typings.baconjs.observableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
}
