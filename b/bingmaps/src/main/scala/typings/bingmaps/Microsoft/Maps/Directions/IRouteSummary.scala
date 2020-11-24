package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteSummary extends js.Object {
  
  /** The total travel distance of the route */
  var distance: Double = js.native
  
  /** The cost of the route. This property is only returned if the routeMode of the IDirectionsRequestOptions is set to transit and the map culture is set to ja-jp. */
  var monetaryCost: Double = js.native
  
  /** The location of the northeast corner of bounding box that defines the best map view of the route. */
  var northEast: Location = js.native
  
  /** The location of the southwest corner of bounding box that defines the best map view of the route. */
  var southWest: Location = js.native
  
  /** The total travel time, in seconds, for the route. */
  var time: Double = js.native
  
  /**
    * The total travel time, in seconds, taking into account traffic delays, for the route.
    * This property is 0 if the avoidTraffic property of the IDirectionsRequestOptions is set to false.
    */
  var timeWithTraffic: Double = js.native
}
object IRouteSummary {
  
  @scala.inline
  def apply(
    distance: Double,
    monetaryCost: Double,
    northEast: Location,
    southWest: Location,
    time: Double,
    timeWithTraffic: Double
  ): IRouteSummary = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], monetaryCost = monetaryCost.asInstanceOf[js.Any], northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWithTraffic = timeWithTraffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSummary]
  }
  
  @scala.inline
  implicit class IRouteSummaryOps[Self <: IRouteSummary] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonetaryCost(value: Double): Self = this.set("monetaryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthEast(value: Location): Self = this.set("northEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthWest(value: Location): Self = this.set("southWest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWithTraffic(value: Double): Self = this.set("timeWithTraffic", value.asInstanceOf[js.Any])
  }
}
