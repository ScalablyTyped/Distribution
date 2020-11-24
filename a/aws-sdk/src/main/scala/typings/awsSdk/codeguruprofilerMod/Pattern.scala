package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends js.Object {
  
  /**
    *  A list of the different counters used to determine if there is a match. 
    */
  var countersToAggregate: js.UndefOr[Strings] = js.native
  
  /**
    * The description of the recommendation. This explains a potential inefficiency in a profiled application.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The universally unique identifier (UUID) of this pattern.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name for this pattern.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *  A string that contains the steps recommended to address the potential inefficiency. 
    */
  var resolutionSteps: js.UndefOr[String] = js.native
  
  /**
    * A list of frame names that were searched during the analysis that generated a recommendation.
    */
  var targetFrames: js.UndefOr[TargetFrames] = js.native
  
  /**
    *  The percentage of time an application spends in one method that triggers a recommendation. The percentage of time is the same as the percentage of the total gathered sample counts during analysis. 
    */
  var thresholdPercent: js.UndefOr[Percentage] = js.native
}
object Pattern {
  
  @scala.inline
  def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
    
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
    def setCountersToAggregateVarargs(value: String*): Self = this.set("countersToAggregate", js.Array(value :_*))
    
    @scala.inline
    def setCountersToAggregate(value: Strings): Self = this.set("countersToAggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountersToAggregate: Self = this.set("countersToAggregate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResolutionSteps(value: String): Self = this.set("resolutionSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionSteps: Self = this.set("resolutionSteps", js.undefined)
    
    @scala.inline
    def setTargetFramesVarargs(value: TargetFrame*): Self = this.set("targetFrames", js.Array(value :_*))
    
    @scala.inline
    def setTargetFrames(value: TargetFrames): Self = this.set("targetFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFrames: Self = this.set("targetFrames", js.undefined)
    
    @scala.inline
    def setThresholdPercent(value: Percentage): Self = this.set("thresholdPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdPercent: Self = this.set("thresholdPercent", js.undefined)
  }
}
