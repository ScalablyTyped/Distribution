package typings.cachefactory.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cachefactory", "CacheFactory")
@js.native
class CacheFactory () extends js.Object {
  
  def clearAll(): Unit = js.native
  
  def createCache(id: String): Cache = js.native
  def createCache(id: String, options: CacheOptions): Cache = js.native
  
  def destroy(id: String): Unit = js.native
  
  def destroyAll(): Unit = js.native
  
  def disableAll(): Unit = js.native
  
  def enabledAll(): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  
  def get(id: String): Cache = js.native
  
  def info(): CacheFactoryInfo = js.native
  
  def keySet(): StringDictionary[String] = js.native
  
  def keys(): js.Array[String] = js.native
  
  def removeExpiredFromAll(): StringDictionary[StringDictionary[js.Any]] = js.native
  
  def touchAll(): Unit = js.native
}
