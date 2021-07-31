package typings.cosmiconfig

import typings.cosmiconfig.typesMod.Cache
import typings.cosmiconfig.typesMod.CosmiconfigResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheWrapperMod {
  
  @JSImport("cosmiconfig/dist/cacheWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cacheWrapper(cache: Cache, key: String, fn: js.Function0[js.Promise[CosmiconfigResult]]): js.Promise[CosmiconfigResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheWrapper")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CosmiconfigResult]]
  
  @scala.inline
  def cacheWrapperSync(cache: Cache, key: String, fn: js.Function0[CosmiconfigResult]): CosmiconfigResult = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheWrapperSync")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CosmiconfigResult]
}
