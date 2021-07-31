package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cookie {
    
    @scala.inline
    def apply(key: String): String = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(key: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def apply(keys: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].apply(keys.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(keys: js.Array[String], fallback: String): String = (^.asInstanceOf[js.Dynamic].apply(keys.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("cookie")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def all(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Any]
    
    @JSGlobal("cookie.defaults")
    @js.native
    def defaults: Options = js.native
    @scala.inline
    def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def empty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Unit]
    
    @scala.inline
    def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    
    @scala.inline
    def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def get(key: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def get(keys: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def get(keys: js.Array[String], fallback: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(keys.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def remove(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def remove(keys: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(keys.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def removeSpecific(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def removeSpecific(key: String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeSpecific(keys: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(keys.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def removeSpecific(keys: js.Array[String], options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def set(key: String, value: String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def set(obj: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def set(obj: js.Any, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("cookie.utils")
    @js.native
    def utils: UtilStatic = js.native
    @scala.inline
    def utils_=(x: UtilStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  }
}
