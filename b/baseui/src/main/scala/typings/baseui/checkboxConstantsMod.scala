package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.CHANGE
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxConstantsMod {
  
  /* Inlined std.Readonly<{ readonly top :'top',  readonly right :'right',  readonly bottom :'bottom',  readonly left :'left'}> */
  object LABEL_PLACEMENT {
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/checkbox/constants", "LABEL_PLACEMENT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
  }
  
  object STATE_TYPE {
    
    @JSImport("baseui/checkbox/constants", "STATE_TYPE.change")
    @js.native
    val change: CHANGE = js.native
  }
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly toggle :'toggle',  readonly toggle_round :'toggle'}> */
  object STYLE_TYPE extends Shortcut {
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.toggle")
    @js.native
    val toggle: typings.baseui.baseuiStrings.toggle = js.native
    
    @JSImport("baseui/checkbox/constants", "STYLE_TYPE.toggle_round")
    @js.native
    val toggleRound: typings.baseui.baseuiStrings.toggle = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_TYPE.foo` */
    override def _to: default_ = default
  }
}
