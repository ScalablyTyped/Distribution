package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusStyleManagerMod {
  
  object FocusStyleManager {
    
    @JSImport("@blueprintjs/core/lib/esm/accessibility/focusStyleManager", "FocusStyleManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def alwaysShowFocus(): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alwaysShowFocus")().asInstanceOf[Boolean | Unit]
    
    @scala.inline
    def isActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")().asInstanceOf[Boolean]
    
    @scala.inline
    def onlyShowFocusOnTabs(): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyShowFocusOnTabs")().asInstanceOf[Boolean | Unit]
  }
}
