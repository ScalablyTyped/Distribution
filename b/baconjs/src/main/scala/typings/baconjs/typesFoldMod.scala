package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesScanMod.Accumulator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fold", JSImport.Namespace)
@js.native
object typesFoldMod extends js.Object {
  def default[In, Out](src: typings.baconjs.typesObservableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
}

