package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialBreadcrumbsProps
import typings.blueprintjsCore.anon.PartialOverflowListPropsB
import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsCore.breadcrumbMod.BreadcrumbProps
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.popoverMod.IPopoverProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs", "Breadcrumbs")
  @js.native
  open class Breadcrumbs protected ()
    extends AbstractPureComponent2[BreadcrumbsProps, js.Object, js.Object] {
    def this(props: BreadcrumbsProps) = this()
    def this(props: BreadcrumbsProps, context: Any) = this()
    
    /* private */ var renderBreadcrumb: Any = js.native
    
    /* private */ var renderBreadcrumbWrapper: Any = js.native
    
    /* private */ var renderOverflow: Any = js.native
    
    /* private */ var renderOverflowBreadcrumb: Any = js.native
  }
  /* static members */
  object Breadcrumbs {
    
    @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumbs", "Breadcrumbs.defaultProps")
    @js.native
    def defaultProps: PartialBreadcrumbsProps = js.native
    inline def defaultProps_=(x: PartialBreadcrumbsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type BreadcrumbsProps = IBreadcrumbsProps
  
  trait IBreadcrumbsProps
    extends StObject
       with IProps {
    
    /**
      * Callback invoked to render visible breadcrumbs. Best practice is to
      * render a `<Breadcrumb>` element. If `currentBreadcrumbRenderer` is also
      * supplied, that callback will be used for the current breadcrumb instead.
      *
      * @default Breadcrumb
      */
    var breadcrumbRenderer: js.UndefOr[js.Function1[/* props */ BreadcrumbProps, Element]] = js.undefined
    
    /**
      * Which direction the breadcrumbs should collapse from: start or end.
      *
      * @default Boundary.START
      */
    var collapseFrom: js.UndefOr[Boundary] = js.undefined
    
    /**
      * Callback invoked to render the current breadcrumb, which is the last
      * element in the `items` array.
      *
      * If this prop is omitted, `breadcrumbRenderer` will be invoked for the
      * current breadcrumb instead.
      */
    var currentBreadcrumbRenderer: js.UndefOr[js.Function1[/* props */ BreadcrumbProps, Element]] = js.undefined
    
    /**
      * All breadcrumbs to display. Breadcrumbs that do not fit in the container
      * will be rendered in an overflow menu instead.
      */
    var items: js.Array[BreadcrumbProps]
    
    /**
      * The minimum number of visible breadcrumbs that should never collapse into
      * the overflow menu, regardless of DOM dimensions.
      *
      * @default 0
      */
    var minVisibleItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Props to spread to `OverflowList`. Note that `items`,
      * `overflowRenderer`, and `visibleItemRenderer` cannot be changed.
      */
    var overflowListProps: js.UndefOr[PartialOverflowListPropsB] = js.undefined
    
    /**
      * Props to spread to the `Popover` showing the overflow menu.
      */
    var popoverProps: js.UndefOr[IPopoverProps] = js.undefined
  }
  object IBreadcrumbsProps {
    
    inline def apply(items: js.Array[BreadcrumbProps]): IBreadcrumbsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbsProps]
    }
    
    extension [Self <: IBreadcrumbsProps](x: Self) {
      
      inline def setBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): Self = StObject.set(x, "breadcrumbRenderer", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbRendererUndefined: Self = StObject.set(x, "breadcrumbRenderer", js.undefined)
      
      inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
      
      inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
      
      inline def setCurrentBreadcrumbRenderer(value: /* props */ BreadcrumbProps => Element): Self = StObject.set(x, "currentBreadcrumbRenderer", js.Any.fromFunction1(value))
      
      inline def setCurrentBreadcrumbRendererUndefined: Self = StObject.set(x, "currentBreadcrumbRenderer", js.undefined)
      
      inline def setItems(value: js.Array[BreadcrumbProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: BreadcrumbProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMinVisibleItems(value: Double): Self = StObject.set(x, "minVisibleItems", value.asInstanceOf[js.Any])
      
      inline def setMinVisibleItemsUndefined: Self = StObject.set(x, "minVisibleItems", js.undefined)
      
      inline def setOverflowListProps(value: PartialOverflowListPropsB): Self = StObject.set(x, "overflowListProps", value.asInstanceOf[js.Any])
      
      inline def setOverflowListPropsUndefined: Self = StObject.set(x, "overflowListProps", js.undefined)
      
      inline def setPopoverProps(value: IPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    }
  }
}
