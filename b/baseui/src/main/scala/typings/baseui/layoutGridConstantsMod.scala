package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.Columns
import typings.baseui.baseuiStrings.`flex-end`
import typings.baseui.baseuiStrings.`flex-start`
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridConstantsMod {
  
  /* Inlined std.Readonly<{ readonly start :'flex-start',  readonly center :'center',  readonly end :'flex-end'}> */
  object ALIGNMENT {
    
    @JSImport("baseui/layout-grid/constants", "ALIGNMENT.center")
    @js.native
    val center: typings.baseui.baseuiStrings.center = js.native
    
    @JSImport("baseui/layout-grid/constants", "ALIGNMENT.end")
    @js.native
    val end: `flex-end` = js.native
    
    @JSImport("baseui/layout-grid/constants", "ALIGNMENT.start")
    @js.native
    val start: `flex-start` = js.native
  }
  
  /* Inlined std.Readonly<{ readonly fluid :'fluid',  readonly fixed :'fixed'}> */
  object BEHAVIOR {
    
    @JSImport("baseui/layout-grid/constants", "BEHAVIOR.fixed")
    @js.native
    val fixed: typings.baseui.baseuiStrings.fixed = js.native
    
    @JSImport("baseui/layout-grid/constants", "BEHAVIOR.fluid")
    @js.native
    val fluid: typings.baseui.baseuiStrings.fluid = js.native
  }
  
  /* Inlined std.Readonly<{ readonly default :'default',  readonly compact :'compact'}> */
  object STYLE extends Shortcut {
    
    @JSImport("baseui/layout-grid/constants", "STYLE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/layout-grid/constants", "STYLE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `STYLE.foo` */
    override def _to: default_ = default
  }
  
  /* Inlined std.Readonly<{  default :any,   compact :{  columns :std.Array<number>,   gutters :std.Array<number>,   margins :std.Array<number>,   gaps :number,   unit :string,   maxWidth :number}}> */
  object STYLE_VALUES extends Shortcut {
    
    @JSImport("baseui/layout-grid/constants", "STYLE_VALUES.default")
    @js.native
    val default: Any = js.native
    
    @JSImport("baseui/layout-grid/constants", "STYLE_VALUES.compact")
    @js.native
    val compact: Columns = js.native
    
    type _To = Any
    
    /* This means you don't have to write `default`, but can instead just say `STYLE_VALUES.foo` */
    override def _to: Any = default
  }
}
