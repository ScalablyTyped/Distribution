package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsPopover2.contextMenu2Mod.ContextMenu2ContentProps
import typings.blueprintjsTable.anon.Loading
import typings.blueprintjsTable.tableBodyMod.TableBodyProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBody2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/tableBody2", "TableBody2")
  @js.native
  open class TableBody2 protected ()
    extends AbstractComponent2[TableBodyProps, js.Object, js.Object] {
    def this(props: TableBodyProps) = this()
    def this(props: TableBodyProps, context: Any) = this()
    
    /* private */ var activationCell: Any = js.native
    
    /* private */ var handleContextMenu: Any = js.native
    
    /* private */ var handleSelectionEnd: Any = js.native
    
    /* private */ var locateClick: Any = js.native
    
    /* private */ var locateDrag: Any = js.native
    
    def renderContextMenu(hasMouseEvent: ContextMenu2ContentProps): js.UndefOr[Element] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTableBody2(nextProps: TableBodyProps): Boolean = js.native
  }
  /* static members */
  object TableBody2 {
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody2", "TableBody2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated, will be removed from public API in the next major version
      */
    inline def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellClassNames")(rowIndex.asInstanceOf[js.Any], columnIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSImport("@blueprintjs/table/lib/esm/tableBody2", "TableBody2.defaultProps")
    @js.native
    def defaultProps: Loading = js.native
    inline def defaultProps_=(x: Loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
