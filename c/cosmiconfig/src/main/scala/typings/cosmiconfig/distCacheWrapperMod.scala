package typings.cosmiconfig

import typings.cosmiconfig.distTypesMod.Cache
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/cacheWrapper", JSImport.Namespace)
@js.native
object distCacheWrapperMod extends js.Object {
  def cacheWrapper(cache: Cache, key: String, fn: js.Function0[js.Promise[CosmiconfigResult]]): js.Promise[CosmiconfigResult] = js.native
  def cacheWrapperSync(cache: Cache, key: String, fn: js.Function0[CosmiconfigResult]): CosmiconfigResult = js.native
}

