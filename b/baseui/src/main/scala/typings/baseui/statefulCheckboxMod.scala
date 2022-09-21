package typings.baseui

import typings.baseui.checkboxTypesMod.StatefulCheckboxProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulCheckboxMod {
  
  object default {
    
    inline def apply(props: StatefulCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/checkbox/stateful-checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/checkbox/stateful-checkbox", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
