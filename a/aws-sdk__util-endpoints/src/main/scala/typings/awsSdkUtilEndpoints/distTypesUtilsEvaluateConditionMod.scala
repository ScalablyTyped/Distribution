package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.anon.Result
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ConditionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateConditionMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateCondition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateCondition(param0: ConditionObject, options: EvaluateOptions): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateCondition")(param0.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
}
