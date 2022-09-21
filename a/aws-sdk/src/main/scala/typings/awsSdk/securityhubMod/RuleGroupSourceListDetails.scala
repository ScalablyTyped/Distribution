package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceListDetails extends StObject {
  
  /**
    * Indicates whether to allow or deny access to the domains listed in Targets.
    */
  var GeneratedRulesType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The protocols that you want to inspect. Specify LS_SNI for HTTPS. Specify HTTP_HOST for HTTP. You can specify either or both.
    */
  var TargetTypes: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The domains that you want to inspect for in your traffic flows. You can provide full domain names, or use the '.' prefix as a wildcard. For example, .example.com matches all domains that end with example.com.
    */
  var Targets: js.UndefOr[NonEmptyStringList] = js.undefined
}
object RuleGroupSourceListDetails {
  
  inline def apply(): RuleGroupSourceListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceListDetails]
  }
  
  extension [Self <: RuleGroupSourceListDetails](x: Self) {
    
    inline def setGeneratedRulesType(value: NonEmptyString): Self = StObject.set(x, "GeneratedRulesType", value.asInstanceOf[js.Any])
    
    inline def setGeneratedRulesTypeUndefined: Self = StObject.set(x, "GeneratedRulesType", js.undefined)
    
    inline def setTargetTypes(value: NonEmptyStringList): Self = StObject.set(x, "TargetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesUndefined: Self = StObject.set(x, "TargetTypes", js.undefined)
    
    inline def setTargetTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "TargetTypes", js.Array(value*))
    
    inline def setTargets(value: NonEmptyStringList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
