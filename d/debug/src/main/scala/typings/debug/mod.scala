package typings.debug

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined debug.debug.Debug & {  debug :debug.debug.Debug,   default :debug.debug.Debug} */
object mod {
  
  @scala.inline
  def apply(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  
  @JSImport("debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("debug", "default")
  @js.native
  def default: Debug = js.native
  @scala.inline
  def default(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  
  @scala.inline
  def coerce(`val`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("debug", "debug")
  @js.native
  def debug: Debug = js.native
  @scala.inline
  def debug(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  @scala.inline
  def debug_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def disable(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[String]
  
  @scala.inline
  def enable(namespaces: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enabled(namespaces: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("debug", "formatters")
  @js.native
  def formatters: Formatters = js.native
  @scala.inline
  def formatters_=(x: Formatters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatters")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def log(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("debug", "names")
  @js.native
  def names: js.Array[RegExp] = js.native
  @scala.inline
  def names_=(x: js.Array[RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
  
  @JSImport("debug", "skips")
  @js.native
  def skips: js.Array[RegExp] = js.native
  @scala.inline
  def skips_=(x: js.Array[RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skips")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Debug extends StObject {
    
    def apply(namespace: String): Debugger = js.native
    
    def coerce(`val`: js.Any): js.Any = js.native
    
    def disable(): String = js.native
    
    def enable(namespaces: String): Unit = js.native
    
    def enabled(namespaces: String): Boolean = js.native
    
    var formatters: Formatters = js.native
    
    def log(args: js.Any*): js.Any = js.native
    
    var names: js.Array[RegExp] = js.native
    
    var skips: js.Array[RegExp] = js.native
  }
  
  @js.native
  trait Debugger extends StObject {
    
    def apply(formatter: js.Any, args: js.Any*): Unit = js.native
    
    var color: String = js.native
    
    def destroy(): Boolean = js.native
    
    var enabled: Boolean = js.native
    
    def extend(namespace: String): Debugger = js.native
    def extend(namespace: String, delimiter: String): Debugger = js.native
    
    def log(args: js.Any*): js.Any = js.native
    
    var namespace: String = js.native
  }
  
  type Formatters = StringDictionary[js.Function1[/* v */ js.Any, String]]
  
  type IDebug = Debug
  
  type IDebugger = Debugger
}
