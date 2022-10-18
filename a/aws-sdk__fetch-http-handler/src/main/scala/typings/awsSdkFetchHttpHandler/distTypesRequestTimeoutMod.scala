package typings.awsSdkFetchHttpHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestTimeoutMod {
  
  @JSImport("@aws-sdk/fetch-http-handler/dist-types/request-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestTimeout(): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTimeout")().asInstanceOf[js.Promise[scala.Nothing]]
  inline def requestTimeout(timeoutInMs: Double): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTimeout")(timeoutInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Nothing]]
}
