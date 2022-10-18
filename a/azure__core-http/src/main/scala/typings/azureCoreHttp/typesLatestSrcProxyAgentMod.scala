package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typings.azureCoreHttp.typesLatestSrcServiceClientMod.ProxySettings
import typings.node.httpMod.Agent
import typings.tunnel.mod.HttpsOverHttpsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcProxyAgentMod {
  
  @JSImport("@azure/core-http/types/latest/src/proxyAgent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProxyAgent(requestUrl: String, proxySettings: ProxySettings): ProxyAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyAgent")(requestUrl.asInstanceOf[js.Any], proxySettings.asInstanceOf[js.Any])).asInstanceOf[ProxyAgent]
  inline def createProxyAgent(requestUrl: String, proxySettings: ProxySettings, headers: HttpHeadersLike): ProxyAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyAgent")(requestUrl.asInstanceOf[js.Any], proxySettings.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[ProxyAgent]
  
  inline def createTunnel(isRequestHttps: Boolean, isProxyHttps: Boolean, tunnelOptions: HttpsOverHttpsOptions): Agent | typings.node.httpsMod.Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("createTunnel")(isRequestHttps.asInstanceOf[js.Any], isProxyHttps.asInstanceOf[js.Any], tunnelOptions.asInstanceOf[js.Any])).asInstanceOf[Agent | typings.node.httpsMod.Agent]
  
  inline def isUrlHttps(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlHttps")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ProxyAgent extends StObject {
    
    var agent: Agent | typings.node.httpsMod.Agent
    
    var isHttps: Boolean
  }
  object ProxyAgent {
    
    inline def apply(agent: Agent | typings.node.httpsMod.Agent, isHttps: Boolean): ProxyAgent = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], isHttps = isHttps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyAgent]
    }
    
    extension [Self <: ProxyAgent](x: Self) {
      
      inline def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setIsHttps(value: Boolean): Self = StObject.set(x, "isHttps", value.asInstanceOf[js.Any])
    }
  }
}
