package typings.baseui

import typings.baseui.baseuiStrings.ch_
import typings.baseui.baseuiStrings.cm_
import typings.baseui.baseuiStrings.in_
import typings.baseui.baseuiStrings.mm_
import typings.baseui.baseuiStrings.pt_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridTypesMod {
  
  type Alignment = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ALIGNMENT.start */ Any
  
  type Behavior = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BEHAVIOR.fixed */ Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.cm_
    - typings.baseui.baseuiStrings.mm_
    - typings.baseui.baseuiStrings.Q
    - typings.baseui.baseuiStrings.in_
    - typings.baseui.baseuiStrings.pc
    - typings.baseui.baseuiStrings.px
    - typings.baseui.baseuiStrings.pt_
    - typings.baseui.baseuiStrings.em
    - typings.baseui.baseuiStrings.ex
    - typings.baseui.baseuiStrings.ch_
    - typings.baseui.baseuiStrings.rem
    - typings.baseui.baseuiStrings.lh
    - typings.baseui.baseuiStrings.vw
    - typings.baseui.baseuiStrings.vh
    - typings.baseui.baseuiStrings.vmin
    - typings.baseui.baseuiStrings.vmax
    - typings.baseui.baseuiStrings.Percentsign
  */
  trait CSSLengthUnit extends StObject
  object CSSLengthUnit {
    
    inline def Percentsign: typings.baseui.baseuiStrings.Percentsign = "%".asInstanceOf[typings.baseui.baseuiStrings.Percentsign]
    
    inline def Q: typings.baseui.baseuiStrings.Q = "Q".asInstanceOf[typings.baseui.baseuiStrings.Q]
    
    inline def ch: ch_ = "ch".asInstanceOf[ch_]
    
    inline def cm: cm_ = "cm".asInstanceOf[cm_]
    
    inline def em: typings.baseui.baseuiStrings.em = "em".asInstanceOf[typings.baseui.baseuiStrings.em]
    
    inline def ex: typings.baseui.baseuiStrings.ex = "ex".asInstanceOf[typings.baseui.baseuiStrings.ex]
    
    inline def in: in_ = "in".asInstanceOf[in_]
    
    inline def lh: typings.baseui.baseuiStrings.lh = "lh".asInstanceOf[typings.baseui.baseuiStrings.lh]
    
    inline def mm: mm_ = "mm".asInstanceOf[mm_]
    
    inline def pc: typings.baseui.baseuiStrings.pc = "pc".asInstanceOf[typings.baseui.baseuiStrings.pc]
    
    inline def pt: pt_ = "pt".asInstanceOf[pt_]
    
    inline def px: typings.baseui.baseuiStrings.px = "px".asInstanceOf[typings.baseui.baseuiStrings.px]
    
    inline def rem: typings.baseui.baseuiStrings.rem = "rem".asInstanceOf[typings.baseui.baseuiStrings.rem]
    
    inline def vh: typings.baseui.baseuiStrings.vh = "vh".asInstanceOf[typings.baseui.baseuiStrings.vh]
    
    inline def vmax: typings.baseui.baseuiStrings.vmax = "vmax".asInstanceOf[typings.baseui.baseuiStrings.vmax]
    
    inline def vmin: typings.baseui.baseuiStrings.vmin = "vmin".asInstanceOf[typings.baseui.baseuiStrings.vmin]
    
    inline def vw: typings.baseui.baseuiStrings.vw = "vw".asInstanceOf[typings.baseui.baseuiStrings.vw]
  }
  
  trait CellOverrides extends StObject {
    
    var Cell: js.UndefOr[Override[Any]] = js.undefined
  }
  object CellOverrides {
    
    inline def apply(): CellOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellOverrides] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Override[Any]): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
    }
  }
  
  trait CellProps
    extends StObject
       with SharedGridProps {
    
    /** Control vertical alignment of individual cell at each breakpoint. Limited proxy for `align-self` CSS property. */
    var align: js.UndefOr[Responsive[Alignment]] = js.undefined
    
    /** Content to be placed in Cell. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Control placement order of cell in flex row at each breakpoint. Proxy for `order` CSS property. */
    var order: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Overrides for a single cell. */
    var overrides: js.UndefOr[CellOverrides] = js.undefined
    
    /** Control number of columns to offset cell at each breakpoint. */
    var skip: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Control number of columns the cell should span. */
    var span: js.UndefOr[Responsive[Double]] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Responsive[Alignment]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAlignVarargs(value: Alignment*): Self = StObject.set(x, "align", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOrder(value: Responsive[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setOverrides(value: CellOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSkip(value: Responsive[Double]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipVarargs(value: Double*): Self = StObject.set(x, "skip", js.Array(value*))
      
      inline def setSpan(value: Responsive[Double]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
    }
  }
  
  trait GridOverrides extends StObject {
    
    var Grid: js.UndefOr[Override[Any]] = js.undefined
    
    var GridWrapper: js.UndefOr[Override[Any]] = js.undefined
  }
  object GridOverrides {
    
    inline def apply(): GridOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridOverrides] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: Override[Any]): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
      
      inline def setGridWrapper(value: Override[Any]): Self = StObject.set(x, "GridWrapper", value.asInstanceOf[js.Any])
      
      inline def setGridWrapperUndefined: Self = StObject.set(x, "GridWrapper", js.undefined)
    }
  }
  
  trait GridProps
    extends StObject
       with SharedGridProps {
    
    /** Control vertical alignment of cells at each breakpoint. */
    var align: js.UndefOr[Responsive[Alignment]] = js.undefined
    
    /** Grid container behavior beyond max width. Fluid will continue to expand. Fixed will limit grid container to max width and center the container horizontally within parent element. */
    var behavior: js.UndefOr[Behavior] = js.undefined
    
    /** Children should be Cells. */
    var children: ReactNode
    
    /** Gap on either side of grid container at each breakpoint. */
    var gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Maximum width of the grid container. Does not include Margins. Only applies when `behavior` is `fluid`. */
    var gridMaxWidth: js.UndefOr[Double] = js.undefined
    
    /** Style for your grid. The `default` style will pull values from the theme, while other styles have preset values that are unaffected by the theme. **/
    var gridStyle: js.UndefOr[GridStyle] = js.undefined
    
    /** Overrides for your grid. */
    var overrides: js.UndefOr[GridOverrides] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Responsive[Alignment]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAlignVarargs(value: Alignment*): Self = StObject.set(x, "align", js.Array(value*))
      
      inline def setBehavior(value: Behavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGridMargins(value: Responsive[Double]): Self = StObject.set(x, "gridMargins", value.asInstanceOf[js.Any])
      
      inline def setGridMarginsUndefined: Self = StObject.set(x, "gridMargins", js.undefined)
      
      inline def setGridMarginsVarargs(value: Double*): Self = StObject.set(x, "gridMargins", js.Array(value*))
      
      inline def setGridMaxWidth(value: Double): Self = StObject.set(x, "gridMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setGridMaxWidthUndefined: Self = StObject.set(x, "gridMaxWidth", js.undefined)
      
      inline def setGridStyle(value: GridStyle): Self = StObject.set(x, "gridStyle", value.asInstanceOf[js.Any])
      
      inline def setGridStyleUndefined: Self = StObject.set(x, "gridStyle", js.undefined)
      
      inline def setOverrides(value: GridOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.compact
  */
  trait GridStyle extends StObject
  
  type Responsive[T] = T | js.Array[T]
  
  trait SharedGridProps extends StObject {
    
    /** Number of columns at each breakpoint. */
    var gridColumns: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Gap between rows at each breakpoint. */
    var gridGaps: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Gap between columns at each breakpoint. */
    var gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Modify the CSS length unit used to measure columns and rows. Defaults to theme value. */
    var gridUnit: js.UndefOr[CSSLengthUnit] = js.undefined
  }
  object SharedGridProps {
    
    inline def apply(): SharedGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedGridProps] (val x: Self) extends AnyVal {
      
      inline def setGridColumns(value: Responsive[Double]): Self = StObject.set(x, "gridColumns", value.asInstanceOf[js.Any])
      
      inline def setGridColumnsUndefined: Self = StObject.set(x, "gridColumns", js.undefined)
      
      inline def setGridColumnsVarargs(value: Double*): Self = StObject.set(x, "gridColumns", js.Array(value*))
      
      inline def setGridGaps(value: Responsive[Double]): Self = StObject.set(x, "gridGaps", value.asInstanceOf[js.Any])
      
      inline def setGridGapsUndefined: Self = StObject.set(x, "gridGaps", js.undefined)
      
      inline def setGridGapsVarargs(value: Double*): Self = StObject.set(x, "gridGaps", js.Array(value*))
      
      inline def setGridGutters(value: Responsive[Double]): Self = StObject.set(x, "gridGutters", value.asInstanceOf[js.Any])
      
      inline def setGridGuttersUndefined: Self = StObject.set(x, "gridGutters", js.undefined)
      
      inline def setGridGuttersVarargs(value: Double*): Self = StObject.set(x, "gridGutters", js.Array(value*))
      
      inline def setGridUnit(value: CSSLengthUnit): Self = StObject.set(x, "gridUnit", value.asInstanceOf[js.Any])
      
      inline def setGridUnitUndefined: Self = StObject.set(x, "gridUnit", js.undefined)
    }
  }
  
  trait StyledCellProps extends StObject {
    
    /** Control vertical alignment of individual cell at each breakpoint. Limited proxy for `align-self` CSS property. */
    @JSName("$align")
    var $align: js.UndefOr[Responsive[Alignment]] = js.undefined
    
    /** Number of columns at each breakpoint. */
    @JSName("$gridColumns")
    var $gridColumns: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Gap between rows at each breakpoint. */
    @JSName("$gridGaps")
    var $gridGaps: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Gap between columns at each breakpoint. */
    @JSName("$gridGutters")
    var $gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Modify the CSS length unit used to measure columns and rows. Defaults to theme value. */
    @JSName("$gridUnit")
    var $gridUnit: js.UndefOr[CSSLengthUnit] = js.undefined
    
    /** Control placement order of cell in flex row at each breakpoint. Proxy for `order` CSS property. */
    @JSName("$order")
    var $order: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Control number of columns to offset cell at each breakpoint. */
    @JSName("$skip")
    var $skip: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Control number of columns the cell should span. */
    @JSName("$span")
    var $span: js.UndefOr[Responsive[Double]] = js.undefined
  }
  object StyledCellProps {
    
    inline def apply(): StyledCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyledCellProps] (val x: Self) extends AnyVal {
      
      inline def set$align(value: Responsive[Alignment]): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
      
      inline def set$alignUndefined: Self = StObject.set(x, "$align", js.undefined)
      
      inline def set$alignVarargs(value: Alignment*): Self = StObject.set(x, "$align", js.Array(value*))
      
      inline def set$gridColumns(value: Responsive[Double]): Self = StObject.set(x, "$gridColumns", value.asInstanceOf[js.Any])
      
      inline def set$gridColumnsUndefined: Self = StObject.set(x, "$gridColumns", js.undefined)
      
      inline def set$gridColumnsVarargs(value: Double*): Self = StObject.set(x, "$gridColumns", js.Array(value*))
      
      inline def set$gridGaps(value: Responsive[Double]): Self = StObject.set(x, "$gridGaps", value.asInstanceOf[js.Any])
      
      inline def set$gridGapsUndefined: Self = StObject.set(x, "$gridGaps", js.undefined)
      
      inline def set$gridGapsVarargs(value: Double*): Self = StObject.set(x, "$gridGaps", js.Array(value*))
      
      inline def set$gridGutters(value: Responsive[Double]): Self = StObject.set(x, "$gridGutters", value.asInstanceOf[js.Any])
      
      inline def set$gridGuttersUndefined: Self = StObject.set(x, "$gridGutters", js.undefined)
      
      inline def set$gridGuttersVarargs(value: Double*): Self = StObject.set(x, "$gridGutters", js.Array(value*))
      
      inline def set$gridUnit(value: CSSLengthUnit): Self = StObject.set(x, "$gridUnit", value.asInstanceOf[js.Any])
      
      inline def set$gridUnitUndefined: Self = StObject.set(x, "$gridUnit", js.undefined)
      
      inline def set$order(value: Responsive[Double]): Self = StObject.set(x, "$order", value.asInstanceOf[js.Any])
      
      inline def set$orderUndefined: Self = StObject.set(x, "$order", js.undefined)
      
      inline def set$orderVarargs(value: Double*): Self = StObject.set(x, "$order", js.Array(value*))
      
      inline def set$skip(value: Responsive[Double]): Self = StObject.set(x, "$skip", value.asInstanceOf[js.Any])
      
      inline def set$skipUndefined: Self = StObject.set(x, "$skip", js.undefined)
      
      inline def set$skipVarargs(value: Double*): Self = StObject.set(x, "$skip", js.Array(value*))
      
      inline def set$span(value: Responsive[Double]): Self = StObject.set(x, "$span", value.asInstanceOf[js.Any])
      
      inline def set$spanUndefined: Self = StObject.set(x, "$span", js.undefined)
      
      inline def set$spanVarargs(value: Double*): Self = StObject.set(x, "$span", js.Array(value*))
    }
  }
  
  trait StyledGridProps extends StObject {
    
    /** Control vertical alignment of cells at each breakpoint. */
    @JSName("$align")
    var $align: js.UndefOr[Responsive[Alignment]] = js.undefined
    
    /** Grid container behavior beyond max width. Fluid will continue to expand. Fixed will limit grid container to max width and center the container horizontally within parent element. */
    @JSName("$behavior")
    var $behavior: js.UndefOr[Behavior] = js.undefined
    
    /** Gap between columns at each breakpoint. */
    @JSName("$gridGutters")
    var $gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Gap on either side of grid container at each breakpoint. */
    @JSName("$gridMargins")
    var $gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Maximum width of the grid container. Does not include Margins. Only applies when `behavior` is `fluid`. */
    @JSName("$gridMaxWidth")
    var $gridMaxWidth: js.UndefOr[Double] = js.undefined
    
    /** Style for your grid. The `default` style will pull values from the theme, while other styles have preset values that are unaffected by the theme. **/
    @JSName("$gridStyle")
    var $gridStyle: js.UndefOr[GridStyle] = js.undefined
    
    /** Modify the CSS length unit used to measure columns and rows. Defaults to theme value. */
    @JSName("$gridUnit")
    var $gridUnit: js.UndefOr[CSSLengthUnit] = js.undefined
  }
  object StyledGridProps {
    
    inline def apply(): StyledGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyledGridProps] (val x: Self) extends AnyVal {
      
      inline def set$align(value: Responsive[Alignment]): Self = StObject.set(x, "$align", value.asInstanceOf[js.Any])
      
      inline def set$alignUndefined: Self = StObject.set(x, "$align", js.undefined)
      
      inline def set$alignVarargs(value: Alignment*): Self = StObject.set(x, "$align", js.Array(value*))
      
      inline def set$behavior(value: Behavior): Self = StObject.set(x, "$behavior", value.asInstanceOf[js.Any])
      
      inline def set$behaviorUndefined: Self = StObject.set(x, "$behavior", js.undefined)
      
      inline def set$gridGutters(value: Responsive[Double]): Self = StObject.set(x, "$gridGutters", value.asInstanceOf[js.Any])
      
      inline def set$gridGuttersUndefined: Self = StObject.set(x, "$gridGutters", js.undefined)
      
      inline def set$gridGuttersVarargs(value: Double*): Self = StObject.set(x, "$gridGutters", js.Array(value*))
      
      inline def set$gridMargins(value: Responsive[Double]): Self = StObject.set(x, "$gridMargins", value.asInstanceOf[js.Any])
      
      inline def set$gridMarginsUndefined: Self = StObject.set(x, "$gridMargins", js.undefined)
      
      inline def set$gridMarginsVarargs(value: Double*): Self = StObject.set(x, "$gridMargins", js.Array(value*))
      
      inline def set$gridMaxWidth(value: Double): Self = StObject.set(x, "$gridMaxWidth", value.asInstanceOf[js.Any])
      
      inline def set$gridMaxWidthUndefined: Self = StObject.set(x, "$gridMaxWidth", js.undefined)
      
      inline def set$gridStyle(value: GridStyle): Self = StObject.set(x, "$gridStyle", value.asInstanceOf[js.Any])
      
      inline def set$gridStyleUndefined: Self = StObject.set(x, "$gridStyle", js.undefined)
      
      inline def set$gridUnit(value: CSSLengthUnit): Self = StObject.set(x, "$gridUnit", value.asInstanceOf[js.Any])
      
      inline def set$gridUnitUndefined: Self = StObject.set(x, "$gridUnit", js.undefined)
    }
  }
  
  trait StyledGridWrapperProps extends StObject {
    
    /** Grid container behavior beyond max width. Fluid will continue to expand. Fixed will limit grid container to max width and center the container horizontally within parent element. */
    @JSName("$behavior")
    var $behavior: js.UndefOr[Behavior] = js.undefined
    
    /** Gap on either side of grid container at each breakpoint. */
    @JSName("$gridMargins")
    var $gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Maximum width of the grid container. Does not include Margins. Only applies when `behavior` is `fluid`. */
    @JSName("$gridMaxWidth")
    var $gridMaxWidth: js.UndefOr[Double] = js.undefined
    
    /** Modify the CSS length unit used to measure columns and rows. Defaults to theme value. */
    @JSName("$gridUnit")
    var $gridUnit: js.UndefOr[CSSLengthUnit] = js.undefined
  }
  object StyledGridWrapperProps {
    
    inline def apply(): StyledGridWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledGridWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyledGridWrapperProps] (val x: Self) extends AnyVal {
      
      inline def set$behavior(value: Behavior): Self = StObject.set(x, "$behavior", value.asInstanceOf[js.Any])
      
      inline def set$behaviorUndefined: Self = StObject.set(x, "$behavior", js.undefined)
      
      inline def set$gridMargins(value: Responsive[Double]): Self = StObject.set(x, "$gridMargins", value.asInstanceOf[js.Any])
      
      inline def set$gridMarginsUndefined: Self = StObject.set(x, "$gridMargins", js.undefined)
      
      inline def set$gridMarginsVarargs(value: Double*): Self = StObject.set(x, "$gridMargins", js.Array(value*))
      
      inline def set$gridMaxWidth(value: Double): Self = StObject.set(x, "$gridMaxWidth", value.asInstanceOf[js.Any])
      
      inline def set$gridMaxWidthUndefined: Self = StObject.set(x, "$gridMaxWidth", js.undefined)
      
      inline def set$gridUnit(value: CSSLengthUnit): Self = StObject.set(x, "$gridUnit", value.asInstanceOf[js.Any])
      
      inline def set$gridUnitUndefined: Self = StObject.set(x, "$gridUnit", js.undefined)
    }
  }
}
