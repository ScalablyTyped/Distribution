package typings.debug

import org.scalablytyped.runtime.StringDictionary
import typings.debug.anon.FnCall
import typings.ms.anon.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined debug.debug.Debug & {  debug :debug.debug.Debug,   default :debug.debug.Debug} */
object mod {
  
  inline def apply(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  
  @JSImport("debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("debug", "default")
  @js.native
  def default: Debug = js.native
  inline def default(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  
  inline def coerce(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("debug", "debug")
  @js.native
  def debug: Debug = js.native
  inline def debug(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  inline def debug_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  inline def default_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  inline def disable(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[String]
  
  inline def enable(namespaces: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enabled(namespaces: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def formatArgs(args: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("debug", "formatters")
  @js.native
  def formatters: Formatters = js.native
  inline def formatters_=(x: Formatters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatters")(x.asInstanceOf[js.Any])
  
  @JSImport("debug", "humanize")
  @js.native
  def humanize: FnCall = js.native
  inline def humanize(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def humanize(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def humanize(value: Double, options: Long): String = (^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def humanize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("humanize")(x.asInstanceOf[js.Any])
  
  inline def log(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("debug", "names")
  @js.native
  def names: js.Array[js.RegExp] = js.native
  inline def names_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
  
  inline def selectColor(namespace: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectColor")(namespace.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  @JSImport("debug", "skips")
  @js.native
  def skips: js.Array[js.RegExp] = js.native
  inline def skips_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skips")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Debug extends StObject {
    
    def apply(namespace: String): Debugger = js.native
    
    def coerce(`val`: Any): Any = js.native
    
    def disable(): String = js.native
    
    def enable(namespaces: String): Unit = js.native
    
    def enabled(namespaces: String): Boolean = js.native
    
    def formatArgs(args: js.Array[Any]): Unit = js.native
    
    var formatters: Formatters = js.native
    
    def humanize(value: String): Double = js.native
    def humanize(value: Double): String = js.native
    def humanize(value: Double, options: Long): String = js.native
    @JSName("humanize")
    var humanize_Original: FnCall = js.native
    
    def log(args: Any*): Any = js.native
    
    var names: js.Array[js.RegExp] = js.native
    
    def selectColor(namespace: String): String | Double = js.native
    
    var skips: js.Array[js.RegExp] = js.native
  }
  
  @js.native
  trait Debugger extends StObject {
    
    def apply(formatter: Any, args: Any*): Unit = js.native
    
    var color: String = js.native
    
    def destroy(): Boolean = js.native
    
    var diff: Double = js.native
    
    var enabled: Boolean = js.native
    
    def extend(namespace: String): Debugger = js.native
    def extend(namespace: String, delimiter: String): Debugger = js.native
    
    def log(args: Any*): Any = js.native
    
    var namespace: String = js.native
  }
  
  type Formatters = StringDictionary[js.Function1[/* v */ Any, String]]
  
  type IDebug = Debug
  
  type IDebugger = Debugger
}
