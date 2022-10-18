package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmComponentsMenuMenuItemMod.IMenuItemProps
import typings.blueprintjsTable.libEsmInteractionsMenusMenuContextMod.IMenuContext
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsMenusCopyCellsMenuItemMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus/copyCellsMenuItem", "CopyCellsMenuItem")
  @js.native
  open class CopyCellsMenuItem protected ()
    extends PureComponent[ICopyCellsMenuItemProps, js.Object, Any] {
    def this(props: ICopyCellsMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICopyCellsMenuItemProps, context: Any) = this()
    
    /* private */ var handleClick: Any = js.native
  }
  
  trait ICopyCellsMenuItemProps
    extends StObject
       with IMenuItemProps {
    
    /**
      * The `IMenuContext` that launched the menu.
      */
    var context: IMenuContext
    
    /**
      * A callback that returns the data for a specific cell. This need not
      * match the value displayed in the `<Cell>` component. The value will be
      * invisibly added as `textContent` into the DOM before copying.
      */
    def getCellData(row: Double, col: Double): Any
    
    /**
      * If you want to do something after the copy or if you want to notify the
      * user if a copy fails, you may provide this optional callback.
      *
      * Due to browser limitations, the copy can fail. This usually occurs if
      * the selection is too large, like 20,000+ cells. The copy will also fail
      * if the browser does not support the copy method (see
      * `Clipboard.isCopySupported`).
      */
    var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
  }
  object ICopyCellsMenuItemProps {
    
    inline def apply(context: IMenuContext, getCellData: (Double, Double) => Any): ICopyCellsMenuItemProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData))
      __obj.asInstanceOf[ICopyCellsMenuItemProps]
    }
    
    extension [Self <: ICopyCellsMenuItemProps](x: Self) {
      
      inline def setContext(value: IMenuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setGetCellData(value: (Double, Double) => Any): Self = StObject.set(x, "getCellData", js.Any.fromFunction2(value))
      
      inline def setOnCopy(value: /* success */ Boolean => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    }
  }
}
