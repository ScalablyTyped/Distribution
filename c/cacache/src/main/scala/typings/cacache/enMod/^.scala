package typings.cacache.enMod

import typings.cacache.enMod.getNs.Options
import typings.cacache.enMod.lsNs.Cache
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearMemoized(): Record[String, CacheObject] = js.native
  def get(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  def get(cachePath: String, key: String, options: Options): js.Promise[CacheObject] = js.native
  def ls(cachePath: String): js.Promise[Cache] = js.native
  def put(cachePath: String, key: String, data: js.Any): js.Promise[String] = js.native
  def put(cachePath: String, key: String, data: js.Any, opts: typings.cacache.enMod.putNs.Options): js.Promise[String] = js.native
  def rm(cachePath: String, key: String): js.Promise[_] = js.native
  def setLocale(locale: String): js.Any = js.native
  def verify(cachePath: String): js.Promise[_] = js.native
  def verify(cachePath: String, opts: typings.cacache.enMod.verifyNs.Options): js.Promise[_] = js.native
}

