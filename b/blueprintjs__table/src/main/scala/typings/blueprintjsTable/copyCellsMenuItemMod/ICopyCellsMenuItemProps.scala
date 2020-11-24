package typings.blueprintjsTable.copyCellsMenuItemMod

import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.blueprintjsTable.menuContextMod.IMenuContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ICopyCellsMenuItemPropsOps[Self <: ICopyCellsMenuItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: IMenuContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellData(value: (Double, Double) => js.Any): Self = this.set("getCellData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCopy(value: /* success */ Boolean => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
  }
}
