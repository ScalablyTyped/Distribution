package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import typings.awsSdkUtilEndpoints.distTypesTypesTreeRuleObjectMod.RuleSetRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateRulesMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateRules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateRules(rules: RuleSetRules, options: EvaluateOptions): EndpointV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateRules")(rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointV2]
}
