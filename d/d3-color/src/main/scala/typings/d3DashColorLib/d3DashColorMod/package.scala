package typings
package d3DashColorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashColorMod {
  type ColorSpaceObject = RGBColor | HSLColor | LabColor | HCLColor | CubehelixColor
  type GrayColorFactory = /**
       * Constructs a new Lab color with the specified l value and a = b = 0.
       *
       * @param l Lightness typically in the range [0, 100].
       * @param opacity Optional opacity value, defaults to 1.
       */
  js.Function2[/* l */ scala.Double, /* opacity */ js.UndefOr[scala.Double], LabColor]
}
