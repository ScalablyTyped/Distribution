package typings.azureMsalNode

import typings.azureMsalCommon.distResponseServerAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkLoopbackClientMod {
  
  @JSImport("@azure/msal-node/dist/network/LoopbackClient", "LoopbackClient")
  @js.native
  open class LoopbackClient () extends StObject {
    
    /**
      * Close the loopback server
      */
    def closeServer(): Unit = js.native
    
    /**
      * Get the port that the loopback server is running on
      * @returns
      */
    def getRedirectUri(): String = js.native
    
    /**
      * Spins up a loopback server which returns the server response when the localhost redirectUri is hit
      * @param successTemplate
      * @param errorTemplate
      * @returns
      */
    def listenForAuthCode(): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: String, errorTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: Unit, errorTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
    
    /* private */ var server: Any = js.native
  }
}
