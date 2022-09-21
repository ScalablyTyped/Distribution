package typings.cookieJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/DefinitelyTyped/DefinitelyTyped/pull/16025#issuecomment-295784660
  */
object mod {
  
  inline def apply(key: String): String = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(key: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(keys: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].apply(keys.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(keys: js.Array[String], fallback: String): String = (^.asInstanceOf[js.Dynamic].apply(keys.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cookiejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[Any]
  
  @JSImport("cookiejs", "defaults")
  @js.native
  def defaults: Options = js.native
  inline def defaults_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  inline def empty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Unit]
  
  inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
  
  inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def get(key: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def get(keys: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def get(keys: js.Array[String], fallback: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(keys.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def remove(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(keys: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(keys.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeSpecific(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeSpecific(key: String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeSpecific(keys: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(keys.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeSpecific(keys: js.Array[String], options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSpecific")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(key: String, value: String, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(obj: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("cookiejs", "utils")
  @js.native
  def utils: UtilStatic = js.native
  inline def utils_=(x: UtilStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
}
