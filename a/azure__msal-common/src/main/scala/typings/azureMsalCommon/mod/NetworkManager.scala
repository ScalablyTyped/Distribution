package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "NetworkManager")
@js.native
open class NetworkManager protected ()
  extends typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkManager {
  def this(
    networkClient: INetworkModule,
    cacheManager: typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
  ) = this()
}
