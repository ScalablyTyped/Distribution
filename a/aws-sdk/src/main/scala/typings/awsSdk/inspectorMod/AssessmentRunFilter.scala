package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunFilter extends js.Object {
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
    */
  var completionTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  
  /**
    * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
    */
  var startTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
    */
  var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.native
  
  /**
    * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
    */
  var states: js.UndefOr[AssessmentRunStateList] = js.native
}
object AssessmentRunFilter {
  
  @scala.inline
  def apply(): AssessmentRunFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentRunFilter]
  }
  
  @scala.inline
  implicit class AssessmentRunFilterOps[Self <: AssessmentRunFilter] (val x: Self) extends AnyVal {
    
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
    def setCompletionTimeRange(value: TimestampRange): Self = this.set("completionTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionTimeRange: Self = this.set("completionTimeRange", js.undefined)
    
    @scala.inline
    def setDurationRange(value: DurationRange): Self = this.set("durationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationRange: Self = this.set("durationRange", js.undefined)
    
    @scala.inline
    def setNamePattern(value: NamePattern): Self = this.set("namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePattern: Self = this.set("namePattern", js.undefined)
    
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = this.set("rulesPackageArns", js.Array(value :_*))
    
    @scala.inline
    def setRulesPackageArns(value: FilterRulesPackageArnList): Self = this.set("rulesPackageArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesPackageArns: Self = this.set("rulesPackageArns", js.undefined)
    
    @scala.inline
    def setStartTimeRange(value: TimestampRange): Self = this.set("startTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeRange: Self = this.set("startTimeRange", js.undefined)
    
    @scala.inline
    def setStateChangeTimeRange(value: TimestampRange): Self = this.set("stateChangeTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeTimeRange: Self = this.set("stateChangeTimeRange", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: AssessmentRunState*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: AssessmentRunStateList): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
}
