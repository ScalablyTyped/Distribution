package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.distRequestNativeRequestMod.NativeRequest
import typings.azureMsalCommon.distRequestNativeSignOutRequestMod.NativeSignOutRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrokerNativeBrokerInativebrokerpluginMod {
  
  @js.native
  trait INativeBrokerPlugin extends StObject {
    
    def acquireTokenInteractive(request: NativeRequest): js.Promise[AuthenticationResult] = js.native
    def acquireTokenInteractive(request: NativeRequest, windowHandle: Buffer): js.Promise[AuthenticationResult] = js.native
    
    def acquireTokenSilent(request: NativeRequest): js.Promise[AuthenticationResult] = js.native
    
    def getAccountById(accountId: String, correlationId: String): js.Promise[AccountInfo] = js.native
    
    def getAllAccounts(clientId: String, correlationId: String): js.Promise[js.Array[AccountInfo]] = js.native
    
    var isBrokerAvailable: Boolean = js.native
    
    def setLogger(loggerOptions: LoggerOptions): Unit = js.native
    
    def signOut(request: NativeSignOutRequest): js.Promise[Unit] = js.native
  }
}
