package typings
package d3DashVoronoiLib.d3DashVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiCell[T] extends js.Object {
  /**
    * An array of indexes into diagram.edges representing the cell’s polygon.
    */
  var halfedges: js.Array[scala.Double]
  /**
    * The Voronoi Site of the cell’s associated input point.
    */
  var site: VoronoiSite[T]
}

object VoronoiCell {
  @scala.inline
  def apply[T](halfedges: js.Array[scala.Double], site: VoronoiSite[T]): VoronoiCell[T] = {
    val __obj = js.Dynamic.literal(halfedges = halfedges, site = site)
  
    __obj.asInstanceOf[VoronoiCell[T]]
  }
}

