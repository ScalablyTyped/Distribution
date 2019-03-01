package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptionsLevel extends js.Object {
  /** The zoom level to set. */
  var level: scala.Double
}

object ZoomOptionsLevel {
  @scala.inline
  def apply(level: scala.Double): ZoomOptionsLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[ZoomOptionsLevel]
  }
}

