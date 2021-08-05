package typings.awsSdkMiddlewareHeaderDefault

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-header-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def headerDefault(headerBag: HeaderDefaultArgs): BuildMiddleware[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("headerDefault")(headerBag.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  
  type HeaderDefaultArgs = StringDictionary[String]
}
