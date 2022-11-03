package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.Expression
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateExpressionMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateExpression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateExpression(obj: Expression, keyName: String, options: EvaluateOptions): FunctionReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateExpression")(obj.asInstanceOf[js.Any], keyName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionReturn]
}
