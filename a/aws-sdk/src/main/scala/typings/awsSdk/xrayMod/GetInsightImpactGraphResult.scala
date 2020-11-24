package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightImpactGraphResult extends js.Object {
  
  /**
    * The provided end time. 
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The insight's unique identifier.
    */
  var InsightId: js.UndefOr[typings.awsSdk.xrayMod.InsightId] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The time, in Unix seconds, at which the service graph ended.
    */
  var ServiceGraphEndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time, in Unix seconds, at which the service graph started.
    */
  var ServiceGraphStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The AWS instrumented services related to the insight.
    */
  var Services: js.UndefOr[InsightImpactGraphServiceList] = js.native
  
  /**
    * The provided start time.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}
object GetInsightImpactGraphResult {
  
  @scala.inline
  def apply(): GetInsightImpactGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightImpactGraphResult]
  }
  
  @scala.inline
  implicit class GetInsightImpactGraphResultOps[Self <: GetInsightImpactGraphResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setInsightId(value: InsightId): Self = this.set("InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightId: Self = this.set("InsightId", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServiceGraphEndTime(value: Timestamp): Self = this.set("ServiceGraphEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceGraphEndTime: Self = this.set("ServiceGraphEndTime", js.undefined)
    
    @scala.inline
    def setServiceGraphStartTime(value: Timestamp): Self = this.set("ServiceGraphStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceGraphStartTime: Self = this.set("ServiceGraphStartTime", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: InsightImpactGraphService*): Self = this.set("Services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: InsightImpactGraphServiceList): Self = this.set("Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
