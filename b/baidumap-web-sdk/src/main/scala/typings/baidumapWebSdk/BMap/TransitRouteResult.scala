package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitRouteResult extends StObject {
  
  var city: String = js.native
  
  def getEnd(): LocalResultPoi = js.native
  
  def getNumPlans(): Double = js.native
  
  def getPlan(i: Double): TransitRoutePlan = js.native
  
  def getStart(): LocalResultPoi = js.native
  
  var moreResultsUrl: String = js.native
  
  var policy: TransitPolicy = js.native
}
object TransitRouteResult {
  
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => TransitRoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: String,
    policy: TransitPolicy
  ): TransitRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitRouteResult]
  }
  
  @scala.inline
  implicit class TransitRouteResultMutableBuilder[Self <: TransitRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEnd(value: () => LocalResultPoi): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumPlans(value: () => Double): Self = StObject.set(x, "getNumPlans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlan(value: Double => TransitRoutePlan): Self = StObject.set(x, "getPlan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => LocalResultPoi): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: TransitPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
