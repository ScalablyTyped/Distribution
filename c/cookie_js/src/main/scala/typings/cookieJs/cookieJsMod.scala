package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookieJsMod {
  
  @JSImport("cookie_js", JSImport.Namespace)
  @js.native
  def apply(key: String): String = js.native
  @JSImport("cookie_js", JSImport.Namespace)
  @js.native
  def apply(key: String, fallback: String): String = js.native
  @JSImport("cookie_js", JSImport.Namespace)
  @js.native
  def apply(keys: js.Array[String]): String = js.native
  @JSImport("cookie_js", JSImport.Namespace)
  @js.native
  def apply(keys: js.Array[String], fallback: String): String = js.native
  
  @JSImport("cookie_js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cookie_js", "all")
  @js.native
  def all(): js.Any = js.native
  
  @JSImport("cookie_js", "defaults")
  @js.native
  def defaults: Options = js.native
  @scala.inline
  def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("cookie_js", "empty")
  @js.native
  def empty(): Unit = js.native
  
  @JSImport("cookie_js", "enabled")
  @js.native
  def enabled(): Boolean = js.native
  
  @JSImport("cookie_js", "get")
  @js.native
  def get(key: String): String = js.native
  @JSImport("cookie_js", "get")
  @js.native
  def get(key: String, fallback: String): String = js.native
  @JSImport("cookie_js", "get")
  @js.native
  def get(keys: js.Array[String]): js.Any = js.native
  @JSImport("cookie_js", "get")
  @js.native
  def get(keys: js.Array[String], fallback: String): js.Any = js.native
  
  @JSImport("cookie_js", "remove")
  @js.native
  def remove(args: String*): Unit = js.native
  @JSImport("cookie_js", "remove")
  @js.native
  def remove(key: String): Unit = js.native
  @JSImport("cookie_js", "remove")
  @js.native
  def remove(keys: js.Array[String]): Unit = js.native
  
  @JSImport("cookie_js", "removeSpecific")
  @js.native
  def removeSpecific(key: String): Unit = js.native
  @JSImport("cookie_js", "removeSpecific")
  @js.native
  def removeSpecific(key: String, options: js.Any): Unit = js.native
  @JSImport("cookie_js", "removeSpecific")
  @js.native
  def removeSpecific(keys: js.Array[String]): Unit = js.native
  @JSImport("cookie_js", "removeSpecific")
  @js.native
  def removeSpecific(keys: js.Array[String], options: js.Any): Unit = js.native
  
  @JSImport("cookie_js", "set")
  @js.native
  def set(key: String, value: String): Unit = js.native
  @JSImport("cookie_js", "set")
  @js.native
  def set(key: String, value: String, options: js.Any): Unit = js.native
  @JSImport("cookie_js", "set")
  @js.native
  def set(obj: js.Any): Unit = js.native
  @JSImport("cookie_js", "set")
  @js.native
  def set(obj: js.Any, options: js.Any): Unit = js.native
  
  @JSImport("cookie_js", "utils")
  @js.native
  def utils: UtilStatic = js.native
  @scala.inline
  def utils_=(x: UtilStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
}
