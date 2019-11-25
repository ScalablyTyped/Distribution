package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptionsLevel extends js.Object {
  /** The zoom level to set. */
  var level: Double
}

object ZoomOptionsLevel {
  @scala.inline
  def apply(level: Double): ZoomOptionsLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomOptionsLevel]
  }
}

