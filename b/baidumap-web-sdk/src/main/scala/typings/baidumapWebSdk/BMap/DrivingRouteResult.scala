package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingRouteResult extends js.Object {
  
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
  implicit class DrivingRouteResultOps[Self <: DrivingRouteResult] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEnd(value: () => LocalResultPoi): Self = this.set("getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumPlans(value: () => Double): Self = this.set("getNumPlans", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlan(value: Double => RoutePlan): Self = this.set("getPlan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => LocalResultPoi): Self = this.set("getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = this.set("moreResultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: DrivingPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxiFare(value: TaxiFare): Self = this.set("taxiFare", value.asInstanceOf[js.Any])
  }
}
