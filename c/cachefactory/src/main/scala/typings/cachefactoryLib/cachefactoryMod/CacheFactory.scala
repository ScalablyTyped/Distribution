package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cachefactory", "CacheFactory")
@js.native
class CacheFactory () extends js.Object {
  def clearAll(): scala.Unit = js.native
  def createCache(id: java.lang.String): Cache = js.native
  def createCache(id: java.lang.String, options: CacheOptions): Cache = js.native
  def destroy(id: java.lang.String): scala.Unit = js.native
  def destroyAll(): scala.Unit = js.native
  def disableAll(): scala.Unit = js.native
  def enabledAll(): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def get(id: java.lang.String): Cache = js.native
  def info(): CacheFactoryInfo = js.native
  def keySet(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def removeExpiredFromAll(): ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
  def touchAll(): scala.Unit = js.native
}

