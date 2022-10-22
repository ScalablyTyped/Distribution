package typings.concurrently

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPrefixColorSelectorMod {
  
  @JSImport("concurrently/dist/src/prefix-color-selector", "PrefixColorSelector")
  @js.native
  open class PrefixColorSelector () extends StObject {
    def this(customColors: js.Array[String]) = this()
    
    /* private */ var colorGenerator: Any = js.native
    
    /**
      * @returns The given custom colors then a set of acceptable console colors indefinitely.
      */
    def getNextColor(): String = js.native
  }
}
