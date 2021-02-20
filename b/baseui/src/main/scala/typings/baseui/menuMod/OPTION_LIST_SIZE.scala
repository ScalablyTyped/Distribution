package typings.baseui.menuMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OPTION_LIST_SIZE extends StObject {
  
  var default: default_ = js.native
  
  var compact: typings.baseui.baseuiStrings.compact = js.native
}
object OPTION_LIST_SIZE {
  
  @JSImport("baseui/menu", "OPTION_LIST_SIZE")
  @js.native
  val ^ : OPTION_LIST_SIZE = js.native
  
  @scala.inline
  implicit class OPTION_LIST_SIZEMutableBuilder[Self <: OPTION_LIST_SIZE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
