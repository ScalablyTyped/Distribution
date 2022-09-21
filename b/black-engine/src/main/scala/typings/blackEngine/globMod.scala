package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globMod {
  
  @JSImport("black-engine/utils/Glob", "Glob")
  @js.native
  open class Glob protected () extends StObject {
    def this(pattern: String) = this()
    
    var mRegExp: js.RegExp = js.native
    
    def test(string: String): Boolean = js.native
  }
}
