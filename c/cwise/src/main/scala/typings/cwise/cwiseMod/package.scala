package typings.cwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cwiseMod {
  import typings.ndarray.ndarrayMod.ndarray

  type Arg = ndarray[Double] | (js.Function2[/* row */ Double, /* col */ Double, Double]) | js.Array[Double] | js.Any
  type Return = js.Function2[/* a */ ndarray[Double], /* repeated */ Arg, Unit]
}
