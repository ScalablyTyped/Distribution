package typings.colorDashHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorDashHashMod {
  type ColorValueArray = js.Tuple3[Double, Double, Double]
  type HashFunction = js.Function1[/* input */ String, Double]
  type Hue = Double | HueObject | js.Array[HueObject]
  type Lightness = Double | ColorValueArray
  type Saturation = Double | ColorValueArray
}
