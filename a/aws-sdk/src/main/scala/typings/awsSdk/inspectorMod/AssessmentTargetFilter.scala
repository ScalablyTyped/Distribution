package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentTargetFilter extends StObject {
  
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTargetName property of the AssessmentTarget data type.
    */
  var assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.undefined
}
object AssessmentTargetFilter {
  
  inline def apply(): AssessmentTargetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentTargetFilter]
  }
  
  extension [Self <: AssessmentTargetFilter](x: Self) {
    
    inline def setAssessmentTargetNamePattern(value: NamePattern): Self = StObject.set(x, "assessmentTargetNamePattern", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTargetNamePatternUndefined: Self = StObject.set(x, "assessmentTargetNamePattern", js.undefined)
  }
}
