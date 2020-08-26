package typings.d3Geo.mod

import typings.d3Geo.anon.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoTransformPrototype extends js.Object {
  /**
    * Indicates the end of a line or ring. Within a polygon, indicates the end of a ring.
    * Unlike GeoJSON, the redundant closing coordinate of a ring is not indicated via point, and instead is implied via lineEnd within a polygon.
    */
  var lineEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type with Stream, Unit]] = js.native
  /**
    * Indicates the start of a line or ring. Within a polygon, indicates the start of a ring. The first ring of a polygon is the exterior ring, and is typically clockwise.
    * Any subsequent rings indicate holes in the polygon, and are typically counterclockwise.
    */
  var lineStart: js.UndefOr[js.ThisFunction0[/* this */ this.type with Stream, Unit]] = js.native
  /**
    * Indicates a point with the specified coordinates x and y (and optionally z). The coordinate system is unspecified and implementation-dependent;
    * for example, projection streams require spherical coordinates in degrees as input. Outside the context of a polygon or line,
    * a point indicates a point geometry object (Point or MultiPoint). Within a line or polygon ring, the point indicates a control point.
    *
    * @param x x-coordinate of point.
    * @param y y-coordinate of point.
    * @param z Optional z-coordinate of point.
    */
  var point: js.UndefOr[
    js.ThisFunction3[
      /* this */ this.type with Stream, 
      /* x */ Double, 
      /* y */ Double, 
      /* z */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Indicates the end of a polygon.
    */
  var polygonEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type with Stream, Unit]] = js.native
  /**
    * Indicates the start of a polygon. The first line of a polygon indicates the exterior ring, and any subsequent lines indicate interior holes.
    */
  var polygonStart: js.UndefOr[js.ThisFunction0[/* this */ this.type with Stream, Unit]] = js.native
  /**
    * Indicates the sphere (the globe; the unit sphere centered at ⟨0,0,0⟩).
    */
  var sphere: js.UndefOr[js.ThisFunction0[/* this */ this.type with Stream, Unit]] = js.native
}

object GeoTransformPrototype {
  @scala.inline
  def apply(): GeoTransformPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoTransformPrototype]
  }
  @scala.inline
  implicit class GeoTransformPrototypeOps[Self <: GeoTransformPrototype] (val x: Self) extends AnyVal {
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
    def setLineEnd(value: js.ThisFunction0[/* this */ GeoTransformPrototype with Stream, Unit]): Self = this.set("lineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineEnd: Self = this.set("lineEnd", js.undefined)
    @scala.inline
    def setLineStart(value: js.ThisFunction0[/* this */ GeoTransformPrototype with Stream, Unit]): Self = this.set("lineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStart: Self = this.set("lineStart", js.undefined)
    @scala.inline
    def setPoint(
      value: js.ThisFunction3[
          /* this */ GeoTransformPrototype with Stream, 
          /* x */ Double, 
          /* y */ Double, 
          /* z */ js.UndefOr[Double], 
          Unit
        ]
    ): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPolygonEnd(value: js.ThisFunction0[/* this */ GeoTransformPrototype with Stream, Unit]): Self = this.set("polygonEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonEnd: Self = this.set("polygonEnd", js.undefined)
    @scala.inline
    def setPolygonStart(value: js.ThisFunction0[/* this */ GeoTransformPrototype with Stream, Unit]): Self = this.set("polygonStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonStart: Self = this.set("polygonStart", js.undefined)
    @scala.inline
    def setSphere(value: js.ThisFunction0[/* this */ GeoTransformPrototype with Stream, Unit]): Self = this.set("sphere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSphere: Self = this.set("sphere", js.undefined)
  }
  
}

