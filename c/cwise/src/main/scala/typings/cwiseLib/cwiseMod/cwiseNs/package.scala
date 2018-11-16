package typings
package cwiseLib.cwiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cwiseNs {
  type Arg = ndarrayLib.ndarrayMod.ndarray[scala.Double] | (js.Function2[/* row */ scala.Double, /* col */ scala.Double, scala.Double]) | js.Array[scala.Double] | js.Any
  type Return = js.Function2[/* a */ ndarrayLib.ndarrayMod.ndarray[scala.Double], /* repeated */Arg, scala.Unit]
}
