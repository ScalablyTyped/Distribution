package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.headerCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowHeaderCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeaderCell", "RowHeaderCell")
  @js.native
  class RowHeaderCell protected ()
    extends AbstractPureComponent2[IRowHeaderCellProps, js.Object, js.Object] {
    def this(props: IRowHeaderCellProps) = this()
    def this(props: IRowHeaderCellProps, context: js.Any) = this()
  }
  
  @js.native
  trait IRowHeaderCellProps extends IHeaderCellProps {
    
    /**
      * Specifies if the row is reorderable.
      */
    var enableRowReordering: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether the full row is part of a selection.
      */
    var isRowSelected: js.UndefOr[Boolean] = js.native
    
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
    var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.native
  }
  object IRowHeaderCellProps {
    
    @scala.inline
    def apply(): IRowHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowHeaderCellProps]
    }
    
    @scala.inline
    implicit class IRowHeaderCellPropsMutableBuilder[Self <: IRowHeaderCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
      
      @scala.inline
      def setIsRowSelected(value: Boolean): Self = StObject.set(x, "isRowSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRowSelectedUndefined: Self = StObject.set(x, "isRowSelected", js.undefined)
      
      @scala.inline
      def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
    }
  }
}
