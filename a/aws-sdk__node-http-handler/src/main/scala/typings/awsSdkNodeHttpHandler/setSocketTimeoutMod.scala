package typings.awsSdkNodeHttpHandler

import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSocketTimeoutMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/set-socket-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSocketTimeout")(request.asInstanceOf[js.Any], reject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ js.Error, Unit], timeoutInMs: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSocketTimeout")(request.asInstanceOf[js.Any], reject.asInstanceOf[js.Any], timeoutInMs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
