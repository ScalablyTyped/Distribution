package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.distTypesTypesErrorRuleObjectMod.ErrorRuleObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateErrorRuleMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateErrorRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateErrorRule(errorRule: ErrorRuleObject, options: EvaluateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateErrorRule")(errorRule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
