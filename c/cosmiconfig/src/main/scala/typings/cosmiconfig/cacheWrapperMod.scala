package typings.cosmiconfig

import typings.cosmiconfig.typesMod.Cache
import typings.cosmiconfig.typesMod.CosmiconfigResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheWrapperMod {
  
  @JSImport("cosmiconfig/dist/cacheWrapper", "cacheWrapper")
  @js.native
  def cacheWrapper(cache: Cache, key: String, fn: js.Function0[js.Promise[CosmiconfigResult]]): js.Promise[CosmiconfigResult] = js.native
  
  @JSImport("cosmiconfig/dist/cacheWrapper", "cacheWrapperSync")
  @js.native
  def cacheWrapperSync(cache: Cache, key: String, fn: js.Function0[CosmiconfigResult]): CosmiconfigResult = js.native
}
