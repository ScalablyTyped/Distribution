package typings.blackEngine

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputKeyInfoMod {
  
  @JSImport("black-engine/input/KeyInfo", "KeyInfo")
  @js.native
  open class KeyInfo protected () extends StObject {
    def this(nativeEvent: KeyboardEvent) = this()
    
    var altKey: Boolean = js.native
    
    var char: String = js.native
    
    var code: String = js.native
    
    var ctrlKey: Boolean = js.native
    
    var keyCode: Double = js.native
    
    var shiftKey: Boolean = js.native
  }
}
