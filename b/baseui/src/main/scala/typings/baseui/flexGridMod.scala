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
    
    inline def apply(): FlexGridItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridItemProps]
    }
    
    extension [Self <: FlexGridItemProps](x: Self) {
      
      inline def setFlexGridItemCount(value: Double): Self = StObject.set(x, "flexGridItemCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemCountUndefined: Self = StObject.set(x, "flexGridItemCount", js.undefined)
      
      inline def setFlexGridItemIndex(value: Double): Self = StObject.set(x, "flexGridItemIndex", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemIndexUndefined: Self = StObject.set(x, "flexGridItemIndex", js.undefined)
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
    
    inline def apply(): FlexGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridProps]
    }
    
    extension [Self <: FlexGridProps](x: Self) {
      
      inline def setFlexGridColumnCount(value: Responsive[Double]): Self = StObject.set(x, "flexGridColumnCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnCountUndefined: Self = StObject.set(x, "flexGridColumnCount", js.undefined)
      
      inline def setFlexGridColumnCountVarargs(value: Double*): Self = StObject.set(x, "flexGridColumnCount", js.Array(value :_*))
      
      inline def setFlexGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnGapUndefined: Self = StObject.set(x, "flexGridColumnGap", js.undefined)
      
      inline def setFlexGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridColumnGap", js.Array(value :_*))
      
      inline def setFlexGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridRowGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridRowGapUndefined: Self = StObject.set(x, "flexGridRowGap", js.undefined)
      
      inline def setFlexGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridRowGap", js.Array(value :_*))
    }
  }
}
