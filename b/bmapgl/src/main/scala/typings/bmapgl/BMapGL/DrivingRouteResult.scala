package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivingRouteResult extends StObject {
  
  var city: String
  
  def getEnd(): LocalResultPoi
  
  def getNumPlans(): Double
  
  def getPlan(i: Double): RoutePlan
  
  def getStart(): LocalResultPoi
  
  var moreResultsUrl: String
  
  var policy: DrivingPolicy
  
  var taxiFare: TaxiFare
}
object DrivingRouteResult {
  
  inline def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => RoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: String,
    policy: DrivingPolicy,
    taxiFare: TaxiFare
  ): DrivingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], taxiFare = taxiFare.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingRouteResult]
  }
  
  extension [Self <: DrivingRouteResult](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetEnd(value: () => LocalResultPoi): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    inline def setGetNumPlans(value: () => Double): Self = StObject.set(x, "getNumPlans", js.Any.fromFunction0(value))
    
    inline def setGetPlan(value: Double => RoutePlan): Self = StObject.set(x, "getPlan", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: () => LocalResultPoi): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    inline def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setTaxiFare(value: TaxiFare): Self = StObject.set(x, "taxiFare", value.asInstanceOf[js.Any])
  }
}
