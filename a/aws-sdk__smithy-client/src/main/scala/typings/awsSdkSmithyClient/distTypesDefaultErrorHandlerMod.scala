package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultErrorHandlerMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/default-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throwDefaultError(param0: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDefaultError")(param0.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def withBaseException(ExceptionCtor: Instantiable1[/* args */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withBaseException")(ExceptionCtor.asInstanceOf[js.Any]).asInstanceOf[Any]
}
