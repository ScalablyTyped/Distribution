package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafRulePredicateListDetails extends StObject {
  
  /**
    * A unique identifier for a predicate in a rule, such as ByteMatchSetId or IPSetId. 
    */
  var DataId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies if you want WAF to allow, block, or count requests based on the settings in the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. 
    */
  var Negated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of predicate in a rule, such as ByteMatch or IPSet. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafRulePredicateListDetails {
  
  inline def apply(): AwsWafRulePredicateListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafRulePredicateListDetails]
  }
  
  extension [Self <: AwsWafRulePredicateListDetails](x: Self) {
    
    inline def setDataId(value: NonEmptyString): Self = StObject.set(x, "DataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdUndefined: Self = StObject.set(x, "DataId", js.undefined)
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
    
    inline def setNegatedUndefined: Self = StObject.set(x, "Negated", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
