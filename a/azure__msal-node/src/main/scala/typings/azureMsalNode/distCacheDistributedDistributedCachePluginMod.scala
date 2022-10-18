package typings.azureMsalNode

import typings.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typings.azureMsalCommon.mod.TokenCacheContext
import typings.azureMsalNode.distCacheDistributedIcacheclientMod.ICacheClient
import typings.azureMsalNode.distCacheDistributedIpartitionmanagerMod.IPartitionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheDistributedDistributedCachePluginMod {
  
  @JSImport("@azure/msal-node/dist/cache/distributed/DistributedCachePlugin", "DistributedCachePlugin")
  @js.native
  open class DistributedCachePlugin protected ()
    extends StObject
       with ICachePlugin {
    def this(client: ICacheClient, partitionManager: IPartitionManager) = this()
    
    def afterCacheAccess(cacheContext: TokenCacheContext): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def afterCacheAccess(
      tokenCacheContext: typings.azureMsalCommon.distCachePersistenceTokenCacheContextMod.TokenCacheContext
    ): js.Promise[Unit] = js.native
    
    def beforeCacheAccess(cacheContext: TokenCacheContext): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def beforeCacheAccess(
      tokenCacheContext: typings.azureMsalCommon.distCachePersistenceTokenCacheContextMod.TokenCacheContext
    ): js.Promise[Unit] = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var partitionManager: Any = js.native
  }
}
