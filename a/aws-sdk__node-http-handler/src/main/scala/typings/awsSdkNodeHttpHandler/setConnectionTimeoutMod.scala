package typings.awsSdkNodeHttpHandler

import typings.node.httpMod.ClientRequest
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setConnectionTimeoutMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/set-connection-timeout", "setConnectionTimeout")
  @js.native
  def setConnectionTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/set-connection-timeout", "setConnectionTimeout")
  @js.native
  def setConnectionTimeout(request: ClientRequest, reject: js.Function1[/* err */ Error, Unit], timeoutInMs: Double): Unit = js.native
}
