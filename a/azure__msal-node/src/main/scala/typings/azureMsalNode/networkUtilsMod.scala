package typings.azureMsalNode

import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkUtilsMod {
  
  @JSImport("@azure/msal-node/dist/utils/NetworkUtils", "NetworkUtils")
  @js.native
  open class NetworkUtils () extends StObject
  /* static members */
  object NetworkUtils {
    
    @JSImport("@azure/msal-node/dist/utils/NetworkUtils", "NetworkUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns best compatible network client object.
      */
    inline def getNetworkClient(): INetworkModule = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkClient")().asInstanceOf[INetworkModule]
  }
}
