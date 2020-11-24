package typings.cacache.enMod.get

import typings.cacache.enMod.GetCacheObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "get")
@js.native
object ^ extends js.Object {
  
  def apply(cachePath: String, key: String): js.Promise[GetCacheObject] = js.native
  def apply(cachePath: String, key: String, options: Options): js.Promise[GetCacheObject] = js.native
}
