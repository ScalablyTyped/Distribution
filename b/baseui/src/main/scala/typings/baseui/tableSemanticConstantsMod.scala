package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticConstantsMod {
  
  /* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical',  readonly grid :'grid',  readonly clean :'clean'}> */
  object DIVIDER {
    
    @JSImport("baseui/table-semantic/constants", "DIVIDER.clean")
    @js.native
    val clean: typings.baseui.baseuiStrings.clean = js.native
    
    @JSImport("baseui/table-semantic/constants", "DIVIDER.grid")
    @js.native
    val grid: typings.baseui.baseuiStrings.grid = js.native
    
    @JSImport("baseui/table-semantic/constants", "DIVIDER.horizontal")
    @js.native
    val horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/table-semantic/constants", "DIVIDER.vertical")
    @js.native
    val vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  
  /* Inlined std.Readonly<{ readonly compact :'compact',  readonly default :'default',  readonly spacious :'spacious'}> */
  object SIZE extends Shortcut {
    
    @JSImport("baseui/table-semantic/constants", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/table-semantic/constants", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/table-semantic/constants", "SIZE.spacious")
    @js.native
    val spacious: typings.baseui.baseuiStrings.spacious = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
}
