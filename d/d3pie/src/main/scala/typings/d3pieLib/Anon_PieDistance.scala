package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PieDistance extends js.Object {
  var pieDistance: js.UndefOr[scala.Double] = js.undefined
}

object Anon_PieDistance {
  @scala.inline
  def apply(pieDistance: scala.Int | scala.Double = null): Anon_PieDistance = {
    val __obj = js.Dynamic.literal()
    if (pieDistance != null) __obj.updateDynamic("pieDistance")(pieDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PieDistance]
  }
}

