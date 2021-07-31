package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFindNearRouteOptions
  extends StObject
     with ISpatialFilterOptions {
  
  /**
    * A list of values that limit the use of highways and toll roads in the route.
    * Use one of the following values:
    * • highways - Avoids the use of highways in the route.
    * • tolls - Avoids the use of toll roads in the route.
    * • minimizeHighways - Minimizes (tries to avoid) the use of highways in the route.
    * • minimizeTolls - Minimizes (tries to avoid) the use of toll roads in the route.
    */
  var avoid: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An integer distance specified in meters.
    * Use this parameter to make sure that the moving vehicle has enough distance 
    * to make the first turn
    */
  var distanceBeforeFirstTurn: js.UndefOr[Double] = js.undefined
  
  /** 
    * An integer value between 0 and 359 that represents degrees from north 
    * where north is 0 degrees and the heading is specified clockwise from north. 
    * For example, setting the heading of 270 degrees creates a route that initially heads west 
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
    * One of the following values:
    * • distance - The route is calculated to minimize the distance.Traffic information is not used.
    * • time[default] - The route is calculated to minimize the time.Traffic information is not used.
    * • timeWithTraffic - The route is calculated to minimize the time and uses current traffic information.
    */
  var optimize: js.UndefOr[String] = js.undefined
  
  /** 
    * One of the following values:
    *  • Driving [default]
    *  • Walking
    */
  var travelMode: js.UndefOr[String] = js.undefined
}
object IFindNearRouteOptions {
  
  @scala.inline
  def apply(spatialFilterType: String): IFindNearRouteOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindNearRouteOptions]
  }
  
  @scala.inline
  implicit class IFindNearRouteOptionsMutableBuilder[Self <: IFindNearRouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoid(value: js.Array[String]): Self = StObject.set(x, "avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidUndefined: Self = StObject.set(x, "avoid", js.undefined)
    
    @scala.inline
    def setAvoidVarargs(value: String*): Self = StObject.set(x, "avoid", js.Array(value :_*))
    
    @scala.inline
    def setDistanceBeforeFirstTurn(value: Double): Self = StObject.set(x, "distanceBeforeFirstTurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceBeforeFirstTurnUndefined: Self = StObject.set(x, "distanceBeforeFirstTurn", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setOptimize(value: String): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    @scala.inline
    def setTravelMode(value: String): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
  }
}
