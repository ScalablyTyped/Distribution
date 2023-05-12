package typings.azureMsalNode

import typings.azureMsalCommon.distResponseServerAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkIloopbackclientMod {
  
  @js.native
  trait ILoopbackClient extends StObject {
    
    def closeServer(): Unit = js.native
    
    def getRedirectUri(): String = js.native
    
    def listenForAuthCode(): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: String, errorTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
    def listenForAuthCode(successTemplate: Unit, errorTemplate: String): js.Promise[ServerAuthorizationCodeResponse] = js.native
  }
}
