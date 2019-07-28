package typings.d3DashColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashColorMod {
  type GrayColorFactory = /**
    * Constructs a new Lab color with the specified l value and a = b = 0.
    *
    * @param l Lightness typically in the range [0, 100].
    * @param opacity Optional opacity value, defaults to 1.
    */
  js.Function2[/* l */ Double, /* opacity */ js.UndefOr[Double], LabColor]
}
