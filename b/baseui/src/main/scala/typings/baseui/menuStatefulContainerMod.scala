package typings.baseui

import typings.baseui.anon.AddMenuToNesting
import typings.baseui.menuTypesMod.StatefulContainerProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuStatefulContainerMod {
  
  object default {
    
    inline def apply(props: StatefulContainerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/menu/stateful-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/menu/stateful-container", "default.defaultProps")
    @js.native
    def defaultProps: AddMenuToNesting = js.native
    inline def defaultProps_=(x: AddMenuToNesting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
