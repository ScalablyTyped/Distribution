package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpatialFilterOptions extends js.Object {
  /** End location of the route (only for nearroute filter). */
  var end: js.UndefOr[String | Location] = js.native
  /** Intersection object. Can be a well known text string or a LocationRect object (only for intersects filter). */
  var intersects: js.UndefOr[String | LocationRect | IPrimitive] = js.native
  /** Location at which the filter should be applied (only for nearby filter). */
  var location: js.UndefOr[String | Location] = js.native
  /** 
    * Radius to use when performing a nearby search. The distance in kilometers and must be between 0.16 and 1000 kilometers
    * (only for nearby filter).
    */
  var radius: js.UndefOr[Double] = js.native
  /** 
    * One of the following values:
    * • nearby – Searches in a radius around a location.
    * • nearRoute – Searches for results that are within 1 mile of a route.
    * • intersects – Searches for results that intersect with the specified geometry.
    * Note: Note that the NavteqNA and NavteqEU data sources only support nearby queries.
    */
  var spatialFilterType: String = js.native
  /** Start location of the route (only for nearroute filter). */
  var start: js.UndefOr[String | Location] = js.native
}

object ISpatialFilterOptions {
  @scala.inline
  def apply(spatialFilterType: String): ISpatialFilterOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpatialFilterOptions]
  }
  @scala.inline
  implicit class ISpatialFilterOptionsOps[Self <: ISpatialFilterOptions] (val x: Self) extends AnyVal {
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
    def setSpatialFilterType(value: String): Self = this.set("spatialFilterType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String | Location): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setIntersects(value: String | LocationRect | IPrimitive): Self = this.set("intersects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersects: Self = this.set("intersects", js.undefined)
    @scala.inline
    def setLocation(value: String | Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setStart(value: String | Location): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

