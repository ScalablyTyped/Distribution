package typings.baseui

import typings.baseui.blockTypesMod.BlockProps
import typings.baseui.blockTypesMod.Responsive
import typings.baseui.blockTypesMod.Scale
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridTypesMod {
  
  trait FlexGridItemProps[T /* <: ElementType[Any] */]
    extends StObject
       with FlexGridProps[T] {
    
    /** Total count of items in FlexGrid, used to determine gaps **/
    var flexGridItemCount: js.UndefOr[Double] = js.undefined
    
    /** Index of item in FlexGrid, used to determine gaps **/
    var flexGridItemIndex: js.UndefOr[Double] = js.undefined
  }
  object FlexGridItemProps {
    
    inline def apply[T /* <: ElementType[Any] */](): FlexGridItemProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridItemProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexGridItemProps[?], T /* <: ElementType[Any] */] (val x: Self & FlexGridItemProps[T]) extends AnyVal {
      
      inline def setFlexGridItemCount(value: Double): Self = StObject.set(x, "flexGridItemCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemCountUndefined: Self = StObject.set(x, "flexGridItemCount", js.undefined)
      
      inline def setFlexGridItemIndex(value: Double): Self = StObject.set(x, "flexGridItemIndex", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemIndexUndefined: Self = StObject.set(x, "flexGridItemIndex", js.undefined)
    }
  }
  
  trait FlexGridProps[T /* <: ElementType[Any] */]
    extends StObject
       with BlockProps[T] {
    
    /** Number of equal-width columns to allow for */
    var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Grid gap between columns */
    var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    /** Grid gap between rows */
    var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object FlexGridProps {
    
    inline def apply[T /* <: ElementType[Any] */](): FlexGridProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexGridProps[?], T /* <: ElementType[Any] */] (val x: Self & FlexGridProps[T]) extends AnyVal {
      
      inline def setFlexGridColumnCount(value: Responsive[Double]): Self = StObject.set(x, "flexGridColumnCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnCountUndefined: Self = StObject.set(x, "flexGridColumnCount", js.undefined)
      
      inline def setFlexGridColumnCountVarargs(value: Double*): Self = StObject.set(x, "flexGridColumnCount", js.Array(value*))
      
      inline def setFlexGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnGapUndefined: Self = StObject.set(x, "flexGridColumnGap", js.undefined)
      
      inline def setFlexGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridColumnGap", js.Array(value*))
      
      inline def setFlexGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridRowGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridRowGapUndefined: Self = StObject.set(x, "flexGridRowGap", js.undefined)
      
      inline def setFlexGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridRowGap", js.Array(value*))
    }
  }
}
