package typings.awsSdkNodeHttpHandler

import typings.node.httpMod.ClientRequest
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSocketTimeoutMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/set-socket-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSocketTimeout")(request.asInstanceOf[js.Any], reject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit], timeoutInMs: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSocketTimeout")(request.asInstanceOf[js.Any], reject.asInstanceOf[js.Any], timeoutInMs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
