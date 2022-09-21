package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectConstantsMod {
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/select/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/select/constants", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/select/constants", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/select/constants", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{ readonly select :'select',  readonly remove :'remove',  readonly clear :'clear'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/select/constants", "STATE_CHANGE_TYPE.clear")
    @js.native
    val clear: typings.baseui.baseuiStrings.clear = js.native
    
    @JSImport("baseui/select/constants", "STATE_CHANGE_TYPE.remove")
    @js.native
    val remove: typings.baseui.baseuiStrings.remove = js.native
    
    @JSImport("baseui/select/constants", "STATE_CHANGE_TYPE.select")
    @js.native
    val select: typings.baseui.baseuiStrings.select = js.native
  }
  
  object TYPE {
    
    @JSImport("baseui/select/constants", "TYPE.search")
    @js.native
    val search: typings.baseui.baseuiStrings.search = js.native
    
    @JSImport("baseui/select/constants", "TYPE.select")
    @js.native
    val select: typings.baseui.baseuiStrings.select = js.native
  }
}
