package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupVariablesPortSetsDetails extends StObject {
  
  /**
    * The list of port ranges.
    */
  var Definition: js.UndefOr[NonEmptyStringList] = js.undefined
}
object RuleGroupVariablesPortSetsDetails {
  
  inline def apply(): RuleGroupVariablesPortSetsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupVariablesPortSetsDetails]
  }
  
  extension [Self <: RuleGroupVariablesPortSetsDetails](x: Self) {
    
    inline def setDefinition(value: NonEmptyStringList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setDefinitionVarargs(value: NonEmptyString*): Self = StObject.set(x, "Definition", js.Array(value*))
  }
}
