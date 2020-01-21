package typings.cosmiconfig

import typings.cosmiconfig.typesMod.Cache
import typings.cosmiconfig.typesMod.CosmiconfigResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/cacheWrapper", JSImport.Namespace)
@js.native
object cacheWrapperMod extends js.Object {
  def cacheWrapper(cache: Cache, key: String, fn: js.Function0[js.Promise[CosmiconfigResult]]): js.Promise[CosmiconfigResult] = js.native
  def cacheWrapperSync(cache: Cache, key: String, fn: js.Function0[CosmiconfigResult]): CosmiconfigResult = js.native
}

