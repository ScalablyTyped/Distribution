package typings.baseui.inputMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SIZE extends StObject {
  
  var default: default_
  
  var compact: typings.baseui.baseuiStrings.compact
  
  var large: large_
  
  var mini: typings.baseui.baseuiStrings.mini
}
object SIZE {
  
  @JSImport("baseui/input", "SIZE")
  @js.native
  val ^ : SIZE = js.native
  
  @scala.inline
  implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
  }
}
