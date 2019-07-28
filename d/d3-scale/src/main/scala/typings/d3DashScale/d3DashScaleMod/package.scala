package typings.d3DashScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashScaleMod {
  type InterpolatorFactory[T, U] = js.Function2[/* a */ T, /* b */ T, js.Function1[/* t */ Double, U]]
}
