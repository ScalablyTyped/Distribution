package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesTypesEndpointRuleObjectMod.EndpointRuleObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateEndpointRuleMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateEndpointRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateEndpointRule(endpointRule: EndpointRuleObject, options: EvaluateOptions): js.UndefOr[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateEndpointRule")(endpointRule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EndpointV2]]
}
