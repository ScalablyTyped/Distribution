package typings.awsSdkMiddlewareSerializer

import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream, Any]]): SerializeMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializerMiddleware")(requestSerializerProvider.asInstanceOf[js.Any]).asInstanceOf[SerializeMiddleware[Input, Output]]
}
