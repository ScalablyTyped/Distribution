package typings.awsSdkMiddlewareHeaderDefault

import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-header-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def headerDefault(headerBag: HeaderDefaultArgs): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("headerDefault")(headerBag.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  type HeaderDefaultArgs = Record[String, String]
}
