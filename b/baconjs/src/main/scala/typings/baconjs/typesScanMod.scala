package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/scan", JSImport.Namespace)
@js.native
object typesScanMod extends js.Object {
  def default[In, Out](src: typings.baconjs.typesObservableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
  type Accumulator[In, Out] = js.Function2[/* acc */ Out, /* value */ In, Out]
}

