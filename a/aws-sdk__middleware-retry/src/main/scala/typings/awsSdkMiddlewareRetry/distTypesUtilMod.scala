package typings.awsSdkMiddlewareRetry

import typings.awsSdkTypes.distTypesShapesMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asSdkError(error: Any): SdkError = ^.asInstanceOf[js.Dynamic].applyDynamic("asSdkError")(error.asInstanceOf[js.Any]).asInstanceOf[SdkError]
}
