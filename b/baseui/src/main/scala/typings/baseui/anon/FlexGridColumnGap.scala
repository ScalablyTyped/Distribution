package typings.baseui.anon

import typings.baseui.blockTypesMod.Responsive
import typings.baseui.blockTypesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGridColumnGap extends StObject {
  
  @JSName("$flexGridColumnCount")
  var $flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.undefined
  
  @JSName("$flexGridColumnGap")
  var $flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
  
  @JSName("$flexGridItemCount")
  var $flexGridItemCount: js.UndefOr[Double] = js.undefined
  
  @JSName("$flexGridItemIndex")
  var $flexGridItemIndex: js.UndefOr[Double] = js.undefined
  
  @JSName("$flexGridRowGap")
  var $flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object FlexGridColumnGap {
  
  inline def apply($theme: typings.baseui.stylesTypesMod.Theme): FlexGridColumnGap = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGridColumnGap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexGridColumnGap] (val x: Self) extends AnyVal {
    
    inline def set$flexGridColumnCount(value: Responsive[Double]): Self = StObject.set(x, "$flexGridColumnCount", value.asInstanceOf[js.Any])
    
    inline def set$flexGridColumnCountUndefined: Self = StObject.set(x, "$flexGridColumnCount", js.undefined)
    
    inline def set$flexGridColumnCountVarargs(value: Double*): Self = StObject.set(x, "$flexGridColumnCount", js.Array(value*))
    
    inline def set$flexGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "$flexGridColumnGap", value.asInstanceOf[js.Any])
    
    inline def set$flexGridColumnGapUndefined: Self = StObject.set(x, "$flexGridColumnGap", js.undefined)
    
    inline def set$flexGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "$flexGridColumnGap", js.Array(value*))
    
    inline def set$flexGridItemCount(value: Double): Self = StObject.set(x, "$flexGridItemCount", value.asInstanceOf[js.Any])
    
    inline def set$flexGridItemCountUndefined: Self = StObject.set(x, "$flexGridItemCount", js.undefined)
    
    inline def set$flexGridItemIndex(value: Double): Self = StObject.set(x, "$flexGridItemIndex", value.asInstanceOf[js.Any])
    
    inline def set$flexGridItemIndexUndefined: Self = StObject.set(x, "$flexGridItemIndex", js.undefined)
    
    inline def set$flexGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "$flexGridRowGap", value.asInstanceOf[js.Any])
    
    inline def set$flexGridRowGapUndefined: Self = StObject.set(x, "$flexGridRowGap", js.undefined)
    
    inline def set$flexGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "$flexGridRowGap", js.Array(value*))
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
