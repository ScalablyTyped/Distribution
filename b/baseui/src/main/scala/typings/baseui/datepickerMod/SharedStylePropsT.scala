package typings.baseui.datepickerMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStylePropsT extends StObject {
  
  @JSName("$date")
  var $date: Date
  
  @JSName("$disabled")
  var $disabled: Boolean
  
  @JSName("$hasRangeHighlighted")
  var $hasRangeHighlighted: Boolean
  
  @JSName("$hasRangeOnRight")
  var $hasRangeOnRight: Boolean
  
  @JSName("$hasRangeSelected")
  var $hasRangeSelected: Boolean
  
  @JSName("$isHeader")
  var $isHeader: Boolean
  
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  
  @JSName("$isHovered")
  var $isHovered: Boolean
  
  @JSName("$outsideMonth")
  var $outsideMonth: Boolean
  
  @JSName("$pseudoHighlighted")
  var $pseudoHighlighted: Boolean
  
  @JSName("$pseudoSelected")
  var $pseudoSelected: Boolean
  
  @JSName("$range")
  var $range: Boolean
  
  @JSName("$selected")
  var $selected: Boolean
  
  @JSName("$startDate")
  var $startDate: Boolean
}
object SharedStylePropsT {
  
  inline def apply(
    $date: Date,
    $disabled: Boolean,
    $hasRangeHighlighted: Boolean,
    $hasRangeOnRight: Boolean,
    $hasRangeSelected: Boolean,
    $isHeader: Boolean,
    $isHighlighted: Boolean,
    $isHovered: Boolean,
    $outsideMonth: Boolean,
    $pseudoHighlighted: Boolean,
    $pseudoSelected: Boolean,
    $range: Boolean,
    $selected: Boolean,
    $startDate: Boolean
  ): SharedStylePropsT = {
    val __obj = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $hasRangeHighlighted = $hasRangeHighlighted.asInstanceOf[js.Any], $hasRangeOnRight = $hasRangeOnRight.asInstanceOf[js.Any], $hasRangeSelected = $hasRangeSelected.asInstanceOf[js.Any], $isHeader = $isHeader.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $outsideMonth = $outsideMonth.asInstanceOf[js.Any], $pseudoHighlighted = $pseudoHighlighted.asInstanceOf[js.Any], $pseudoSelected = $pseudoSelected.asInstanceOf[js.Any], $range = $range.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any], $startDate = $startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsT]
  }
  
  extension [Self <: SharedStylePropsT](x: Self) {
    
    inline def set$date(value: Date): Self = StObject.set(x, "$date", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeHighlighted(value: Boolean): Self = StObject.set(x, "$hasRangeHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeOnRight(value: Boolean): Self = StObject.set(x, "$hasRangeOnRight", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeSelected(value: Boolean): Self = StObject.set(x, "$hasRangeSelected", value.asInstanceOf[js.Any])
    
    inline def set$isHeader(value: Boolean): Self = StObject.set(x, "$isHeader", value.asInstanceOf[js.Any])
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHovered(value: Boolean): Self = StObject.set(x, "$isHovered", value.asInstanceOf[js.Any])
    
    inline def set$outsideMonth(value: Boolean): Self = StObject.set(x, "$outsideMonth", value.asInstanceOf[js.Any])
    
    inline def set$pseudoHighlighted(value: Boolean): Self = StObject.set(x, "$pseudoHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$pseudoSelected(value: Boolean): Self = StObject.set(x, "$pseudoSelected", value.asInstanceOf[js.Any])
    
    inline def set$range(value: Boolean): Self = StObject.set(x, "$range", value.asInstanceOf[js.Any])
    
    inline def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
    
    inline def set$startDate(value: Boolean): Self = StObject.set(x, "$startDate", value.asInstanceOf[js.Any])
  }
}
