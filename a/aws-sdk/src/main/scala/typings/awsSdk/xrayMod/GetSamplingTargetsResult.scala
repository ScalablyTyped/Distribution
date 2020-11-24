package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSamplingTargetsResult extends js.Object {
  
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[Timestamp] = js.native
  
  /**
    * Updated rules that the service should use to sample requests.
    */
  var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.native
  
  /**
    * Information about SamplingStatisticsDocument that X-Ray could not process.
    */
  var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.native
}
object GetSamplingTargetsResult {
  
  @scala.inline
  def apply(): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
  
  @scala.inline
  implicit class GetSamplingTargetsResultOps[Self <: GetSamplingTargetsResult] (val x: Self) extends AnyVal {
    
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
    def setLastRuleModification(value: Timestamp): Self = this.set("LastRuleModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRuleModification: Self = this.set("LastRuleModification", js.undefined)
    
    @scala.inline
    def setSamplingTargetDocumentsVarargs(value: SamplingTargetDocument*): Self = this.set("SamplingTargetDocuments", js.Array(value :_*))
    
    @scala.inline
    def setSamplingTargetDocuments(value: SamplingTargetDocumentList): Self = this.set("SamplingTargetDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingTargetDocuments: Self = this.set("SamplingTargetDocuments", js.undefined)
    
    @scala.inline
    def setUnprocessedStatisticsVarargs(value: UnprocessedStatistics*): Self = this.set("UnprocessedStatistics", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedStatistics(value: UnprocessedStatisticsList): Self = this.set("UnprocessedStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedStatistics: Self = this.set("UnprocessedStatistics", js.undefined)
  }
}
