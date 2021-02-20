package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingRouteResult extends StObject {
  
  var city: String = js.native
  
  def getEnd(): LocalResultPoi = js.native
  
  def getNumPlans(): Double = js.native
  
  def getPlan(i: Double): RoutePlan = js.native
  
  def getStart(): LocalResultPoi = js.native
  
  var moreResultsUrl: String = js.native
  
  var policy: DrivingPolicy = js.native
  
  var taxiFare: TaxiFare = js.native
}
object DrivingRouteResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DrivingRouteResultMutableBuilder[Self <: DrivingRouteResult] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxiFare(value: TaxiFare): Self = StObject.set(x, "taxiFare", value.asInstanceOf[js.Any])
  }
}
