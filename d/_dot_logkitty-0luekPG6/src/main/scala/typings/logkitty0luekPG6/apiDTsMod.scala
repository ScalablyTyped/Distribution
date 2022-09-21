package typings.logkitty0luekPG6

import typings.logkitty0luekPG6.errorsDTsMod.CodeError
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEBUG
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEFAULT
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.ERROR
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.FATAL
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.INFO
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.SILENT
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.UNKNOWN
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.VERBOSE
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.WARN
import typings.logkitty0luekPG6.typesDTsMod.Entry
import typings.logkitty0luekPG6.typesDTsMod.IFilter
import typings.logkitty0luekPG6.typesDTsMod.Platform
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiDTsMod {
  
  @JSImport(".logkitty-0luekPG6/build/api.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AndroidPriority {
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.FATAL")
    @js.native
    def FATAL: Double = js.native
    inline def FATAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.SILENT")
    @js.native
    def SILENT: Double = js.native
    inline def SILENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.UNKNOWN")
    @js.native
    def UNKNOWN: Double = js.native
    inline def UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.VERBOSE")
    @js.native
    def VERBOSE: Double = js.native
    inline def VERBOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "AndroidPriority.WARN")
    @js.native
    def WARN: Double = js.native
    inline def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT]
  }
  
  object IosPriority {
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "IosPriority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "IosPriority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "IosPriority.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    inline def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "IosPriority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/api.d.ts", "IosPriority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: DEBUG | INFO | ERROR | DEFAULT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[DEBUG | INFO | ERROR | DEFAULT]
  }
  
  inline def formatEntry(entry: Entry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatError(error: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatError(error: CodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def logkitty(options: LogkittyOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("logkitty")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  inline def makeAppFilter(appIdentifier: String): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAppFilter")(appIdentifier.asInstanceOf[js.Any]).asInstanceOf[FilterCreator]
  
  inline def makeCustomFilter(patterns: String*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCustomFilter")(patterns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FilterCreator]
  
  inline def makeMatchFilter(regexes: js.RegExp*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMatchFilter")(regexes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FilterCreator]
  
  inline def makeTagsFilter(tags: String*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagsFilter")(tags.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FilterCreator]
  
  type FilterCreator = js.Function3[
    /* platform */ Platform, 
    /* minPriority */ js.UndefOr[Double], 
    /* adbPath */ js.UndefOr[String], 
    IFilter
  ]
  
  trait LogkittyOptions extends StObject {
    
    var adbPath: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[FilterCreator] = js.undefined
    
    var platform: Platform
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object LogkittyOptions {
    
    inline def apply(platform: Platform): LogkittyOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogkittyOptions]
    }
    
    extension [Self <: LogkittyOptions](x: Self) {
      
      inline def setAdbPath(value: String): Self = StObject.set(x, "adbPath", value.asInstanceOf[js.Any])
      
      inline def setAdbPathUndefined: Self = StObject.set(x, "adbPath", js.undefined)
      
      inline def setFilter(
        value: (/* platform */ Platform, /* minPriority */ js.UndefOr[Double], /* adbPath */ js.UndefOr[String]) => IFilter
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
