package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitRouteResult extends js.Object {
  
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
  implicit class TransitRouteResultOps[Self <: TransitRouteResult] (val x: Self) extends AnyVal {
    
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
    def setGetPlan(value: Double => TransitRoutePlan): Self = this.set("getPlan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => LocalResultPoi): Self = this.set("getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = this.set("moreResultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: TransitPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
