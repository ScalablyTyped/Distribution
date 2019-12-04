package typings.baconjs

import typings.baconjs.typesObservableMod.Observable
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesTypesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatscan", JSImport.Namespace)
@js.native
object typesFlatscanMod extends js.Object {
  def flatScan[In, Out](src: Observable[In], seed: Out, f: Function2[Out, In, Observable[Out] | Out]): Property[Out] = js.native
}

