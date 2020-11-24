package typings.blueprintjsCore.breadcrumbsMod

import typings.blueprintjsCore.anon.PartialIOverflowListProps
import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBreadcrumbsProps extends IProps {
  
  /**
    * Callback invoked to render visible breadcrumbs. Best practice is to
    * render a `<Breadcrumb>` element. If `currentBreadcrumbRenderer` is also
    * supplied, that callback will be used for the current breadcrumb instead.
    * @default Breadcrumb
    */
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.native
  
  /**
    * Which direction the breadcrumbs should collapse from: start or end.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  /**
    * Callback invoked to render the current breadcrumb, which is the last
    * element in the `items` array.
    *
    * If this prop is omitted, `breadcrumbRenderer` will be invoked for the
    * current breadcrumb instead.
    */
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.native
  
  /**
    * All breadcrumbs to display. Breadcrumbs that do not fit in the container
    * will be rendered in an overflow menu instead.
    */
  var items: js.Array[IBreadcrumbProps] = js.native
  
  /**
    * The minimum number of visible breadcrumbs that should never collapse into
    * the overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  /**
    * Props to spread to `OverflowList`. Note that `items`,
    * `overflowRenderer`, and `visibleItemRenderer` cannot be changed.
    */
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.native
  
  /**
    * Props to spread to the `Popover` showing the overflow menu.
    */
  var popoverProps: js.UndefOr[IPopoverProps] = js.native
}
object IBreadcrumbsProps {
  
  @scala.inline
  def apply(items: js.Array[IBreadcrumbProps]): IBreadcrumbsProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbsProps]
  }
  
  @scala.inline
  implicit class IBreadcrumbsPropsOps[Self <: IBreadcrumbsProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: IBreadcrumbProps*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IBreadcrumbProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = this.set("breadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbRenderer: Self = this.set("breadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setCurrentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = this.set("currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCurrentBreadcrumbRenderer: Self = this.set("currentBreadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setMinVisibleItems(value: Double): Self = this.set("minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVisibleItems: Self = this.set("minVisibleItems", js.undefined)
    
    @scala.inline
    def setOverflowListProps(value: PartialIOverflowListProps): Self = this.set("overflowListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowListProps: Self = this.set("overflowListProps", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: IPopoverProps): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
  }
}
