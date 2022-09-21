package typings.baseui

import typings.baseui.anon.Data
import typings.baseui.tableSemanticTypesMod.TableProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticTableMod {
  
  @JSImport("baseui/table-semantic/table", JSImport.Default)
  @js.native
  open class default () extends Table
  /* static members */
  object default {
    
    @JSImport("baseui/table-semantic/table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table-semantic/table", "default.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Table
    extends Component[TableProps, js.Object, Any]
}
