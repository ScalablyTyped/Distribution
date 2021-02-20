package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/DefinitelyTyped/DefinitelyTyped/pull/16025#issuecomment-295784660
  */
object mod {
  
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  def apply(key: String): String = js.native
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  def apply(key: String, fallback: String): String = js.native
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  def apply(keys: js.Array[String]): String = js.native
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  def apply(keys: js.Array[String], fallback: String): String = js.native
  
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cookiejs", "all")
  @js.native
  def all(): js.Any = js.native
  
  @JSImport("cookiejs", "defaults")
  @js.native
  def defaults: Options = js.native
  @scala.inline
  def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("cookiejs", "empty")
  @js.native
  def empty(): Unit = js.native
  
  @JSImport("cookiejs", "enabled")
  @js.native
  def enabled(): Boolean = js.native
  
  @JSImport("cookiejs", "get")
  @js.native
  def get(key: String): String = js.native
  @JSImport("cookiejs", "get")
  @js.native
  def get(key: String, fallback: String): String = js.native
  @JSImport("cookiejs", "get")
  @js.native
  def get(keys: js.Array[String]): js.Any = js.native
  @JSImport("cookiejs", "get")
  @js.native
  def get(keys: js.Array[String], fallback: String): js.Any = js.native
  
  @JSImport("cookiejs", "remove")
  @js.native
  def remove(args: String*): Unit = js.native
  @JSImport("cookiejs", "remove")
  @js.native
  def remove(key: String): Unit = js.native
  @JSImport("cookiejs", "remove")
  @js.native
  def remove(keys: js.Array[String]): Unit = js.native
  
  @JSImport("cookiejs", "removeSpecific")
  @js.native
  def removeSpecific(key: String): Unit = js.native
  @JSImport("cookiejs", "removeSpecific")
  @js.native
  def removeSpecific(key: String, options: js.Any): Unit = js.native
  @JSImport("cookiejs", "removeSpecific")
  @js.native
  def removeSpecific(keys: js.Array[String]): Unit = js.native
  @JSImport("cookiejs", "removeSpecific")
  @js.native
  def removeSpecific(keys: js.Array[String], options: js.Any): Unit = js.native
  
  @JSImport("cookiejs", "set")
  @js.native
  def set(key: String, value: String): Unit = js.native
  @JSImport("cookiejs", "set")
  @js.native
  def set(key: String, value: String, options: js.Any): Unit = js.native
  @JSImport("cookiejs", "set")
  @js.native
  def set(obj: js.Any): Unit = js.native
  @JSImport("cookiejs", "set")
  @js.native
  def set(obj: js.Any, options: js.Any): Unit = js.native
  
  @JSImport("cookiejs", "utils")
  @js.native
  def utils: UtilStatic = js.native
  @scala.inline
  def utils_=(x: UtilStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
}
