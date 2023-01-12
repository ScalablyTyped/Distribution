package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.libEsmHeadersHeaderCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersRowHeaderCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeaderCell", "RowHeaderCell")
  @js.native
  open class RowHeaderCell protected ()
    extends AbstractPureComponent2[IRowHeaderCellProps, js.Object, js.Object] {
    def this(props: IRowHeaderCellProps) = this()
    def this(props: IRowHeaderCellProps, context: Any) = this()
  }
  
  trait IRowHeaderCellProps
    extends StObject
       with IHeaderCellProps {
    
    /**
      * Specifies if the row is reorderable.
      */
    var enableRowReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the full row is part of a selection.
      */
    var isRowSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback to override the default name rendering behavior. The default
      * behavior is to simply use the `RowHeaderCell`s name prop.
      *
      * This render callback can be used, for example, to provide a
      * `EditableName` component for editing row names.
      *
      * The callback will also receive the row index if an `index` was originally
      * provided via props.
      */
    var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.undefined
  }
  object IRowHeaderCellProps {
    
    inline def apply(): IRowHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowHeaderCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRowHeaderCellProps] (val x: Self) extends AnyVal {
      
      inline def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
      
      inline def setIsRowSelected(value: Boolean): Self = StObject.set(x, "isRowSelected", value.asInstanceOf[js.Any])
      
      inline def setIsRowSelectedUndefined: Self = StObject.set(x, "isRowSelected", js.undefined)
      
      inline def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      inline def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
    }
  }
  
  type RowHeaderCellProps = IRowHeaderCellProps
}
