package typings.blueprintjsCore.anon

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs.IBreadcrumbsProps> */
@js.native
trait PartialIBreadcrumbsProps extends js.Object {
  
  var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapseFrom: js.UndefOr[Boundary] = js.native
  
  var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ IBreadcrumbProps, Element]] = js.native
  
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.native
  
  var minVisibleItems: js.UndefOr[Double] = js.native
  
  var overflowListProps: js.UndefOr[PartialIOverflowListProps] = js.native
  
  var popoverProps: js.UndefOr[IPopoverProps] = js.native
}
object PartialIBreadcrumbsProps {
  
  @scala.inline
  def apply(): PartialIBreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIBreadcrumbsProps]
  }
  
  @scala.inline
  implicit class PartialIBreadcrumbsPropsOps[Self <: PartialIBreadcrumbsProps] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = this.set("breadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbRenderer: Self = this.set("breadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapseFrom(value: Boundary): Self = this.set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseFrom: Self = this.set("collapseFrom", js.undefined)
    
    @scala.inline
    def setCurrentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => Element): Self = this.set("currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCurrentBreadcrumbRenderer: Self = this.set("currentBreadcrumbRenderer", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IBreadcrumbProps*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IBreadcrumbProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
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
