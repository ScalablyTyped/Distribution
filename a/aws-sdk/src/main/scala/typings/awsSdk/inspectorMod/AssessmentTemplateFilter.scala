package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentTemplateFilter extends StObject {
  
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
  implicit class AssessmentTemplateFilterMutableBuilder[Self <: AssessmentTemplateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationRange(value: DurationRange): Self = StObject.set(x, "durationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationRangeUndefined: Self = StObject.set(x, "durationRange", js.undefined)
    
    @scala.inline
    def setNamePattern(value: NamePattern): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
    
    @scala.inline
    def setRulesPackageArns(value: FilterRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesPackageArnsUndefined: Self = StObject.set(x, "rulesPackageArns", js.undefined)
    
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value :_*))
  }
}
