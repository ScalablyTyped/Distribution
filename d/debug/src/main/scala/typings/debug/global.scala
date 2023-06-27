package typings.debug

import typings.debug.anon.Colors
import typings.debug.anon.FnCall
import typings.debug.mod.Debug
import typings.debug.mod.Debugger
import typings.debug.mod.Formatters
import typings.ms.anon.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* Inlined debug.debug.Debug & {  debug :debug.debug.Debug,   default :debug.debug.Debug} */
  object debug {
    
    inline def apply(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
    
    @JSGlobal("debug")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("debug.default")
    @js.native
    def default: Debug = js.native
    inline def default(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
    
    inline def coerce(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSGlobal("debug.debug")
    @js.native
    def debug: Debug = js.native
    inline def debug(namespace: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[Debugger]
    inline def debug_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: Debug): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    inline def disable(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[String]
    
    inline def enable(namespaces: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def enabled(namespaces: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(namespaces.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def formatArgs(args: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formatArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("debug.formatters")
    @js.native
    def formatters: Formatters = js.native
    inline def formatters_=(x: Formatters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatters")(x.asInstanceOf[js.Any])
    
    @JSGlobal("debug.humanize")
    @js.native
    def humanize: FnCall = js.native
    inline def humanize(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def humanize(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def humanize(value: Double, options: Long): String = (^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def humanize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("humanize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("debug.inspectOpts")
    @js.native
    def inspectOpts: js.UndefOr[Colors] = js.native
    inline def inspectOpts_=(x: js.UndefOr[Colors]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inspectOpts")(x.asInstanceOf[js.Any])
    
    inline def log(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSGlobal("debug.names")
    @js.native
    def names: js.Array[js.RegExp] = js.native
    inline def names_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
    
    inline def selectColor(namespace: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectColor")(namespace.asInstanceOf[js.Any]).asInstanceOf[String | Double]
    
    @JSGlobal("debug.skips")
    @js.native
    def skips: js.Array[js.RegExp] = js.native
    inline def skips_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skips")(x.asInstanceOf[js.Any])
  }
}
