package typings.azureMsalNode

import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.NetworkRequestOptions
import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typings.node.httpMod.AgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkHttpClientMod {
  
  @JSImport("@azure/msal-node/dist/network/HttpClient", "HttpClient")
  @js.native
  open class HttpClient ()
    extends StObject
       with INetworkModule {
    def this(proxyUrl: String) = this()
    def this(proxyUrl: String, customAgentOptions: AgentOptions) = this()
    def this(proxyUrl: String, customAgentOptions: typings.node.httpsMod.AgentOptions) = this()
    def this(proxyUrl: Unit, customAgentOptions: AgentOptions) = this()
    def this(proxyUrl: Unit, customAgentOptions: typings.node.httpsMod.AgentOptions) = this()
    
    /* private */ var customAgentOptions: Any = js.native
    
    /* private */ var proxyUrl: Any = js.native
    
    def sendPostRequestAsync[T](url: String, options: Unit, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
    def sendPostRequestAsync[T](url: String, options: NetworkRequestOptions, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
  }
}
