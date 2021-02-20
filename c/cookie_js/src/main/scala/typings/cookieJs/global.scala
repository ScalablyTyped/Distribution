package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cookie {
    
    @JSGlobal("cookie")
    @js.native
    def apply(key: String): String = js.native
    @JSGlobal("cookie")
    @js.native
    def apply(key: String, fallback: String): String = js.native
    @JSGlobal("cookie")
    @js.native
    def apply(keys: js.Array[String]): String = js.native
    @JSGlobal("cookie")
    @js.native
    def apply(keys: js.Array[String], fallback: String): String = js.native
    @JSGlobal("cookie")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("cookie.all")
    @js.native
    def all(): js.Any = js.native
    
    @JSGlobal("cookie.defaults")
    @js.native
    def defaults: Options = js.native
    @scala.inline
    def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSGlobal("cookie.empty")
    @js.native
    def empty(): Unit = js.native
    
    @JSGlobal("cookie.enabled")
    @js.native
    def enabled(): Boolean = js.native
    
    @JSGlobal("cookie.get")
    @js.native
    def get(key: String): String = js.native
    @JSGlobal("cookie.get")
    @js.native
    def get(key: String, fallback: String): String = js.native
    @JSGlobal("cookie.get")
    @js.native
    def get(keys: js.Array[String]): js.Any = js.native
    @JSGlobal("cookie.get")
    @js.native
    def get(keys: js.Array[String], fallback: String): js.Any = js.native
    
    @JSGlobal("cookie.remove")
    @js.native
    def remove(args: String*): Unit = js.native
    @JSGlobal("cookie.remove")
    @js.native
    def remove(key: String): Unit = js.native
    @JSGlobal("cookie.remove")
    @js.native
    def remove(keys: js.Array[String]): Unit = js.native
    
    @JSGlobal("cookie.removeSpecific")
    @js.native
    def removeSpecific(key: String): Unit = js.native
    @JSGlobal("cookie.removeSpecific")
    @js.native
    def removeSpecific(key: String, options: js.Any): Unit = js.native
    @JSGlobal("cookie.removeSpecific")
    @js.native
    def removeSpecific(keys: js.Array[String]): Unit = js.native
    @JSGlobal("cookie.removeSpecific")
    @js.native
    def removeSpecific(keys: js.Array[String], options: js.Any): Unit = js.native
    
    @JSGlobal("cookie.set")
    @js.native
    def set(key: String, value: String): Unit = js.native
    @JSGlobal("cookie.set")
    @js.native
    def set(key: String, value: String, options: js.Any): Unit = js.native
    @JSGlobal("cookie.set")
    @js.native
    def set(obj: js.Any): Unit = js.native
    @JSGlobal("cookie.set")
    @js.native
    def set(obj: js.Any, options: js.Any): Unit = js.native
    
    @JSGlobal("cookie.utils")
    @js.native
    def utils: UtilStatic = js.native
    @scala.inline
    def utils_=(x: UtilStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  }
}
