package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiCell[T] extends js.Object {
  /**
    * An array of indexes into diagram.edges representing the cell’s polygon.
    */
  var halfedges: js.Array[Double] = js.native
  /**
    * The Voronoi Site of the cell’s associated input point.
    */
  var site: VoronoiSite[T] = js.native
}

object VoronoiCell {
  @scala.inline
  def apply[T](halfedges: js.Array[Double], site: VoronoiSite[T]): VoronoiCell[T] = {
    val __obj = js.Dynamic.literal(halfedges = halfedges.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiCell[T]]
  }
  @scala.inline
  implicit class VoronoiCellOps[Self <: VoronoiCell[_], T] (val x: Self with VoronoiCell[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHalfedgesVarargs(value: Double*): Self = this.set("halfedges", js.Array(value :_*))
    @scala.inline
    def setHalfedges(value: js.Array[Double]): Self = this.set("halfedges", value.asInstanceOf[js.Any])
    @scala.inline
    def setSite(value: VoronoiSite[T]): Self = this.set("site", value.asInstanceOf[js.Any])
  }
  
}

