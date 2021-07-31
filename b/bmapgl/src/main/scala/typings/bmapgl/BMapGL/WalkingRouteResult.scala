package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalkingRouteResult extends StObject {
  
  var city: String
  
  def getEnd(): LocalResultPoi
  
  def getNumPlans(): Double
  
  def getPlan(i: Double): RoutePlan
  
  def getStart(): LocalResultPoi
}
object WalkingRouteResult {
  
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => RoutePlan,
    getStart: () => LocalResultPoi
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart))
    __obj.asInstanceOf[WalkingRouteResult]
  }
  
  @scala.inline
  implicit class WalkingRouteResultMutableBuilder[Self <: WalkingRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEnd(value: () => LocalResultPoi): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumPlans(value: () => Double): Self = StObject.set(x, "getNumPlans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlan(value: Double => RoutePlan): Self = StObject.set(x, "getPlan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => LocalResultPoi): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
  }
}
