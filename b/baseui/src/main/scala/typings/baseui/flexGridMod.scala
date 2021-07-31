package typings.baseui

import typings.baseui.blockMod.BlockProps
import typings.baseui.blockMod.Responsive
import typings.baseui.blockMod.Scale
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridMod {
  
  @JSImport("baseui/flex-grid", "FlexGrid")
  @js.native
  val FlexGrid: FC[FlexGridProps] = js.native
  
  @JSImport("baseui/flex-grid", "FlexGridItem")
  @js.native
  val FlexGridItem: FC[FlexGridItemProps] = js.native
  
  trait FlexGridItemProps
    extends StObject
       with FlexGridProps {
    
    var flexGridItemCount: js.UndefOr[Double] = js.undefined
    
    var flexGridItemIndex: js.UndefOr[Double] = js.undefined
  }
  object FlexGridItemProps {
    
    @scala.inline
    def apply(): FlexGridItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridItemProps]
    }
    
    @scala.inline
    implicit class FlexGridItemPropsMutableBuilder[Self <: FlexGridItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlexGridItemCount(value: Double): Self = StObject.set(x, "flexGridItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGridItemCountUndefined: Self = StObject.set(x, "flexGridItemCount", js.undefined)
      
      @scala.inline
      def setFlexGridItemIndex(value: Double): Self = StObject.set(x, "flexGridItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGridItemIndexUndefined: Self = StObject.set(x, "flexGridItemIndex", js.undefined)
    }
  }
  
  trait FlexGridProps
    extends StObject
       with BlockProps {
    
    var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.undefined
    
    var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object FlexGridProps {
    
    @scala.inline
    def apply(): FlexGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridProps]
    }
    
    @scala.inline
    implicit class FlexGridPropsMutableBuilder[Self <: FlexGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlexGridColumnCount(value: Responsive[Double]): Self = StObject.set(x, "flexGridColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGridColumnCountUndefined: Self = StObject.set(x, "flexGridColumnCount", js.undefined)
      
      @scala.inline
      def setFlexGridColumnCountVarargs(value: Double*): Self = StObject.set(x, "flexGridColumnCount", js.Array(value :_*))
      
      @scala.inline
      def setFlexGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGridColumnGapUndefined: Self = StObject.set(x, "flexGridColumnGap", js.undefined)
      
      @scala.inline
      def setFlexGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridColumnGap", js.Array(value :_*))
      
      @scala.inline
      def setFlexGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridRowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGridRowGapUndefined: Self = StObject.set(x, "flexGridRowGap", js.undefined)
      
      @scala.inline
      def setFlexGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridRowGap", js.Array(value :_*))
    }
  }
}
