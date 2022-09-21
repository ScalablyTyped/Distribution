package typings.logkitty0luekPG6

import typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEBUG
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.ERROR
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.FATAL
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.INFO
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.SILENT
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.UNKNOWN
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.VERBOSE
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsDTsMod {
  
  object Priority {
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.FATAL")
    @js.native
    def FATAL: Double = js.native
    inline def FATAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.SILENT")
    @js.native
    def SILENT: Double = js.native
    inline def SILENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.UNKNOWN")
    @js.native
    def UNKNOWN: Double = js.native
    inline def UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.VERBOSE")
    @js.native
    def VERBOSE: Double = js.native
    inline def VERBOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/android/constants.d.ts", "Priority.WARN")
    @js.native
    def WARN: Double = js.native
    inline def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT]
  }
  
  /* keyof .logkitty-0luekPG6.anon.DEBUG */ /* Rewritten from type alias, can be one of: 
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.UNKNOWN
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.VERBOSE
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEBUG
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.INFO
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.WARN
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.ERROR
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.FATAL
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.SILENT
  */
  trait PriorityNames extends StObject
}
