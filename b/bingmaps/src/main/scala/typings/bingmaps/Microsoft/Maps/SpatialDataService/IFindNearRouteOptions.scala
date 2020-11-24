package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFindNearRouteOptions extends ISpatialFilterOptions {
  
  /**
    * A list of values that limit the use of highways and toll roads in the route.
    * Use one of the following values:
    * • highways - Avoids the use of highways in the route.
    * • tolls - Avoids the use of toll roads in the route.
    * • minimizeHighways - Minimizes (tries to avoid) the use of highways in the route.
    * • minimizeTolls - Minimizes (tries to avoid) the use of toll roads in the route.
    */
  var avoid: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An integer distance specified in meters.
    * Use this parameter to make sure that the moving vehicle has enough distance 
    * to make the first turn
    */
  var distanceBeforeFirstTurn: js.UndefOr[Double] = js.native
  
  /** 
    * An integer value between 0 and 359 that represents degrees from north 
    * where north is 0 degrees and the heading is specified clockwise from north. 
    * For example, setting the heading of 270 degrees creates a route that initially heads west 
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * One of the following values:
    * • distance - The route is calculated to minimize the distance.Traffic information is not used.
    * • time[default] - The route is calculated to minimize the time.Traffic information is not used.
    * • timeWithTraffic - The route is calculated to minimize the time and uses current traffic information.
    */
  var optimize: js.UndefOr[String] = js.native
  
  /** 
    * One of the following values:
    *  • Driving [default]
    *  • Walking
    */
  var travelMode: js.UndefOr[String] = js.native
}
object IFindNearRouteOptions {
  
  @scala.inline
  def apply(spatialFilterType: String): IFindNearRouteOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindNearRouteOptions]
  }
  
  @scala.inline
  implicit class IFindNearRouteOptionsOps[Self <: IFindNearRouteOptions] (val x: Self) extends AnyVal {
    
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
    def setAvoidVarargs(value: String*): Self = this.set("avoid", js.Array(value :_*))
    
    @scala.inline
    def setAvoid(value: js.Array[String]): Self = this.set("avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoid: Self = this.set("avoid", js.undefined)
    
    @scala.inline
    def setDistanceBeforeFirstTurn(value: Double): Self = this.set("distanceBeforeFirstTurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceBeforeFirstTurn: Self = this.set("distanceBeforeFirstTurn", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setOptimize(value: String): Self = this.set("optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimize: Self = this.set("optimize", js.undefined)
    
    @scala.inline
    def setTravelMode(value: String): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
  }
}
