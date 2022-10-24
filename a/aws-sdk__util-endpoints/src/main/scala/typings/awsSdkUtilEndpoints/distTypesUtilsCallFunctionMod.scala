package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsCallFunctionMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/callFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callFunction(param0: FunctionObject, options: EvaluateOptions): FunctionReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("callFunction")(param0.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionReturn]
}
