package typings.baseui

import org.scalablytyped.runtime.NumberDictionary
import typings.baseui.anon.Kind
import typings.baseui.buttonGroupTypesMod.ButtonGroupProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupButtonGroupMod {
  
  @JSImport("baseui/button-group/button-group", JSImport.Default)
  @js.native
  open class default () extends ButtonGroup
  /* static members */
  object default {
    
    @JSImport("baseui/button-group/button-group", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group/button-group", "default.defaultProps")
    @js.native
    def defaultProps: Kind = js.native
    inline def defaultProps_=(x: Kind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ButtonGroup
    extends Component[ButtonGroupProps, js.Object, Any] {
    
    var childRefs: NumberDictionary[RefObject[Any]] = js.native
  }
}
