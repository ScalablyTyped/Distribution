package typings.baseui.menuMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPTION_LIST_SIZE extends StObject {
  
  var default: default_
  
  var compact: typings.baseui.baseuiStrings.compact
}
object OPTION_LIST_SIZE {
  
  @JSImport("baseui/menu", "OPTION_LIST_SIZE")
  @js.native
  val ^ : OPTION_LIST_SIZE = js.native
  
  extension [Self <: OPTION_LIST_SIZE](x: Self) {
    
    inline def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
