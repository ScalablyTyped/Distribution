package typings.blueprintjsTable

import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsTable.menuContextMod.IMenuContext
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyCellsMenuItemMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus/copyCellsMenuItem", "CopyCellsMenuItem")
  @js.native
  class CopyCellsMenuItem protected ()
    extends PureComponent[ICopyCellsMenuItemProps, js.Object, js.Any] {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: js.Any) = this()
    
    var handleClick: js.Any = js.native
  }
  
  @js.native
  trait ICopyCellsMenuItemProps extends IMenuItemProps {
    
    /**
      * The `IMenuContext` that launched the menu.
      */
    var context: IMenuContext = js.native
    
    /**
      * A callback that returns the data for a specific cell. This need not
      * match the value displayed in the `<Cell>` component. The value will be
      * invisibly added as `textContent` into the DOM before copying.
      */
    def getCellData(row: Double, col: Double): js.Any = js.native
    
    /**
      * If you want to do something after the copy or if you want to notify the
      * user if a copy fails, you may provide this optional callback.
      *
      * Due to browser limitations, the copy can fail. This usually occurs if
      * the selection is too large, like 20,000+ cells. The copy will also fail
      * if the browser does not support the copy method (see
      * `Clipboard.isCopySupported`).
      */
    var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.native
  }
  object ICopyCellsMenuItemProps {
    
    @scala.inline
    def apply(context: IMenuContext, getCellData: (Double, Double) => js.Any): ICopyCellsMenuItemProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData))
      __obj.asInstanceOf[ICopyCellsMenuItemProps]
    }
    
    @scala.inline
    implicit class ICopyCellsMenuItemPropsMutableBuilder[Self <: ICopyCellsMenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: IMenuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCellData(value: (Double, Double) => js.Any): Self = StObject.set(x, "getCellData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCopy(value: /* success */ Boolean => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    }
  }
}
