package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionStepMetadata extends StObject {
  
  /**
    * The outcome of the Condition step evaluation.
    */
  var Outcome: js.UndefOr[ConditionOutcome] = js.undefined
}
object ConditionStepMetadata {
  
  inline def apply(): ConditionStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionStepMetadata]
  }
  
  extension [Self <: ConditionStepMetadata](x: Self) {
    
    inline def setOutcome(value: ConditionOutcome): Self = StObject.set(x, "Outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "Outcome", js.undefined)
  }
}
