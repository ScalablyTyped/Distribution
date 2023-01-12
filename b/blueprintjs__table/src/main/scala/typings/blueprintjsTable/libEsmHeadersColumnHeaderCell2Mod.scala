package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.anon.IsActive
import typings.blueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnHeaderCellProps
import typings.blueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnHeaderCellState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersColumnHeaderCell2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell2", "ColumnHeaderCell2")
  @js.native
  open class ColumnHeaderCell2 protected ()
    extends AbstractPureComponent2[ColumnHeaderCell2Props, IColumnHeaderCellState, js.Object] {
    def this(props: ColumnHeaderCell2Props) = this()
    def this(props: ColumnHeaderCell2Props, context: Any) = this()
    
    /* private */ var handlePopoverClosing: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var maybeRenderContent: Any = js.native
    
    /* private */ var maybeRenderDropdownMenu: Any = js.native
    
    /* private */ var renderName: Any = js.native
    
    @JSName("state")
    var state_ColumnHeaderCell2: IsActive = js.native
  }
  /* static members */
  object ColumnHeaderCell2 {
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell2", "ColumnHeaderCell2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell2", "ColumnHeaderCell2.defaultProps")
    @js.native
    def defaultProps: ColumnHeaderCell2Props = js.native
    inline def defaultProps_=(x: ColumnHeaderCell2Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell2", "ColumnHeaderCell2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /**
      * This method determines if a `MouseEvent` was triggered on a target that
      * should be used as the header click/drag target. This enables users of
      * this component to render fully interactive components in their header
      * cells without worry of selection or resize operations from capturing
      * their mouse events.
      */
    inline def isHeaderMouseTarget(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderMouseTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait ColumnHeaderCell2Props
    extends StObject
       with IColumnHeaderCellProps {
    
    /**
      * If `true`, adds an interaction bar on top of all column header cells, and
      * moves interaction triggers into it.
      *
      * @default false
      */
    var enableColumnInteractionBar: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnHeaderCell2Props {
    
    inline def apply(): ColumnHeaderCell2Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnHeaderCell2Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnHeaderCell2Props] (val x: Self) extends AnyVal {
      
      inline def setEnableColumnInteractionBar(value: Boolean): Self = StObject.set(x, "enableColumnInteractionBar", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnInteractionBarUndefined: Self = StObject.set(x, "enableColumnInteractionBar", js.undefined)
    }
  }
}
