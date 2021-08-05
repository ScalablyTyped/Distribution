package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingCriteria extends StObject {
  
  /**
    * A condition that specifies the property, operator, and value to use to filter the results.
    */
  var criterion: js.UndefOr[Criterion] = js.undefined
}
object FindingCriteria {
  
  inline def apply(): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingCriteria]
  }
  
  extension [Self <: FindingCriteria](x: Self) {
    
    inline def setCriterion(value: Criterion): Self = StObject.set(x, "criterion", value.asInstanceOf[js.Any])
    
    inline def setCriterionUndefined: Self = StObject.set(x, "criterion", js.undefined)
  }
}
