package typings.logkitty0luekPG6

import typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEBUG
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEFAULT
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.ERROR
import typings.logkitty0luekPG6.logkitty0luekPG6Strings.INFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsDotDTsMod {
  
  object Priority {
    
    @JSImport(".logkitty-0luekPG6/build/ios/constants.d.ts", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".logkitty-0luekPG6/build/ios/constants.d.ts", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/ios/constants.d.ts", "Priority.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    inline def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/ios/constants.d.ts", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport(".logkitty-0luekPG6/build/ios/constants.d.ts", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: DEBUG | INFO | ERROR | DEFAULT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[DEBUG | INFO | ERROR | DEFAULT]
  }
  
  /* keyof .logkitty-0luekPG6.anon.DEFAULT */ /* Rewritten from type alias, can be one of: 
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEBUG
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.DEFAULT
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.INFO
    - typings.logkitty0luekPG6.logkitty0luekPG6Strings.ERROR
  */
  trait PriorityNames extends StObject
}
