package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingCriteria extends StObject {
  
  /**
    * Represents a map of finding properties that match specified conditions and values when querying findings.
    */
  var Criterion: js.UndefOr[typings.awsSdk.guarddutyMod.Criterion] = js.undefined
}
object FindingCriteria {
  
  inline def apply(): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingCriteria]
  }
  
  extension [Self <: FindingCriteria](x: Self) {
    
    inline def setCriterion(value: Criterion): Self = StObject.set(x, "Criterion", value.asInstanceOf[js.Any])
    
    inline def setCriterionUndefined: Self = StObject.set(x, "Criterion", js.undefined)
  }
}
