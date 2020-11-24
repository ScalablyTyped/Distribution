package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/accessibility", JSImport.Namespace)
@js.native
object accessibilityMod extends js.Object {
  
  @js.native
  object FocusStyleManager extends js.Object {
    
    def alwaysShowFocus(): Boolean | Unit = js.native
    
    def isActive(): Boolean = js.native
    
    def onlyShowFocusOnTabs(): Boolean | Unit = js.native
  }
}
