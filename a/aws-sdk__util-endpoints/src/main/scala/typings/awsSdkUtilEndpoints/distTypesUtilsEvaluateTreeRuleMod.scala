package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import typings.awsSdkUtilEndpoints.distTypesTypesTreeRuleObjectMod.TreeRuleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateTreeRuleMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateTreeRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateTreeRule(treeRule: TreeRuleObject, options: EvaluateOptions): js.UndefOr[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateTreeRule")(treeRule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EndpointV2]]
}
