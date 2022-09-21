package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleMatchAttributesSources extends StObject {
  
  /**
    * An IP address or a block of IP addresses.
    */
  var AddressDefinition: js.UndefOr[NonEmptyString] = js.undefined
}
object RuleGroupSourceStatelessRuleMatchAttributesSources {
  
  inline def apply(): RuleGroupSourceStatelessRuleMatchAttributesSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesSources]
  }
  
  extension [Self <: RuleGroupSourceStatelessRuleMatchAttributesSources](x: Self) {
    
    inline def setAddressDefinition(value: NonEmptyString): Self = StObject.set(x, "AddressDefinition", value.asInstanceOf[js.Any])
    
    inline def setAddressDefinitionUndefined: Self = StObject.set(x, "AddressDefinition", js.undefined)
  }
}
