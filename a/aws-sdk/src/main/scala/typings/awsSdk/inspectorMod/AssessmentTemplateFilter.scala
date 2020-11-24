package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentTemplateFilter extends js.Object {
  
  /**
    * For a record to match a filter, the value specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentTemplate data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTemplateName property of the AssessmentTemplate data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  
  /**
    * For a record to match a filter, the values that are specified for this data type property must be contained in the list of values of the rulesPackageArns property of the AssessmentTemplate data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
}
object AssessmentTemplateFilter {
  
  @scala.inline
  def apply(): AssessmentTemplateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTemplateFilter]
  }
  
  @scala.inline
  implicit class AssessmentTemplateFilterOps[Self <: AssessmentTemplateFilter] (val x: Self) extends AnyVal {
    
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
  }
}
