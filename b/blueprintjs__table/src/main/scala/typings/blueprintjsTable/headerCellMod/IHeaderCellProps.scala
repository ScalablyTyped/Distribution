package typings.blueprintjsTable.headerCellMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.resizeHandleMod.ResizeHandle
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderCellProps extends IProps {
  
  /**
    * The index of the cell in the header. If provided, this will be passed as an argument to any
    * callbacks when they are invoked.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, will apply the active class to the header to indicate it is
    * part of an external operation.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
    * `resizeHandle` will not be rendered. If passing in additional children to this component, you
    * will also want to conditionally apply `Classes.SKELETON` where appropriate.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
    * anywhere in the header. The callback will receive the cell index if it was provided via
    * props.
    */
  var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Element]] = js.native
  
  /**
    * The name displayed in the header of the row/column.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A `ReorderHandle` React component that allows users to drag-reorder the column header.
    */
  var reorderHandle: js.UndefOr[Element] = js.native
  
  /**
    * A `ResizeHandle` React component that allows users to drag-resize the header.
    */
  var resizeHandle: js.UndefOr[ResizeHandle] = js.native
  
  /**
    * CSS styles for the top level element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}
object IHeaderCellProps {
  
  @scala.inline
  def apply(): IHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeaderCellProps]
  }
  
  @scala.inline
  implicit class IHeaderCellPropsOps[Self <: IHeaderCellProps] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMenuRenderer(value: /* index */ js.UndefOr[Double] => Element): Self = this.set("menuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuRenderer: Self = this.set("menuRenderer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReorderHandle(value: Element): Self = this.set("reorderHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderHandle: Self = this.set("reorderHandle", js.undefined)
    
    @scala.inline
    def setResizeHandle(value: ResizeHandle): Self = this.set("resizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHandle: Self = this.set("resizeHandle", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
