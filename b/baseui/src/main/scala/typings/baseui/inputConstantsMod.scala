package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.end_
import typings.baseui.baseuiStrings.large_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputConstantsMod {
  
  object ADJOINED {
    
    @JSImport("baseui/input/constants", "ADJOINED.both")
    @js.native
    val both: typings.baseui.baseuiStrings.both = js.native
    
    @JSImport("baseui/input/constants", "ADJOINED.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/input/constants", "ADJOINED.none")
    @js.native
    val none: typings.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/input/constants", "ADJOINED.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
  }
  
  object CUSTOM_INPUT_TYPE {
    
    @JSImport("baseui/input/constants", "CUSTOM_INPUT_TYPE.textarea")
    @js.native
    val textarea: typings.baseui.baseuiStrings.textarea = js.native
  }
  
  object ENHANCER_POSITION {
    
    @JSImport("baseui/input/constants", "ENHANCER_POSITION.end")
    @js.native
    val end: end_ = js.native
    
    @JSImport("baseui/input/constants", "ENHANCER_POSITION.start")
    @js.native
    val start: typings.baseui.baseuiStrings.start = js.native
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/input/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/input/constants", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/input/constants", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/input/constants", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/input/constants", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
}
