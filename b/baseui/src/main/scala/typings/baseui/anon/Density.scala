package typings.baseui.anon

import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.high
import typings.baseui.datepickerTypesMod.InputRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Density[T] extends StObject {
  
  @JSName("$date")
  var $date: T
  
  @JSName("$density")
  var $density: default_ | high
  
  @JSName("$disabled")
  var $disabled: Boolean
  
  @JSName("$endDate")
  var $endDate: Boolean
  
  @JSName("$endOfMonth")
  var $endOfMonth: Boolean
  
  @JSName("$hasDateLabel")
  var $hasDateLabel: Boolean
  
  @JSName("$hasLockedBehavior")
  var $hasLockedBehavior: Boolean
  
  @JSName("$hasRangeHighlighted")
  var $hasRangeHighlighted: Boolean
  
  @JSName("$hasRangeOnRight")
  var $hasRangeOnRight: Boolean
  
  @JSName("$hasRangeSelected")
  var $hasRangeSelected: Boolean
  
  @JSName("$highlightedDate")
  var $highlightedDate: T
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  
  @JSName("$isHovered")
  var $isHovered: Boolean
  
  @JSName("$month")
  var $month: Double
  
  @JSName("$outsideMonth")
  var $outsideMonth: Boolean
  
  @JSName("$outsideMonthWithinRange")
  var $outsideMonthWithinRange: Boolean
  
  @JSName("$peekNextMonth")
  var $peekNextMonth: Boolean
  
  @JSName("$pseudoHighlighted")
  var $pseudoHighlighted: Boolean
  
  @JSName("$pseudoSelected")
  var $pseudoSelected: Boolean
  
  @JSName("$range")
  var $range: Boolean
  
  @JSName("$selected")
  var $selected: Boolean
  
  @JSName("$selectedInput")
  var $selectedInput: InputRole
  
  @JSName("$startDate")
  var $startDate: Boolean
  
  @JSName("$startOfMonth")
  var $startOfMonth: Boolean
  
  @JSName("$value")
  var $value: T | js.Array[T]
}
object Density {
  
  inline def apply[T](
    $date: T,
    $density: default_ | high,
    $disabled: Boolean,
    $endDate: Boolean,
    $endOfMonth: Boolean,
    $hasDateLabel: Boolean,
    $hasLockedBehavior: Boolean,
    $hasRangeHighlighted: Boolean,
    $hasRangeOnRight: Boolean,
    $hasRangeSelected: Boolean,
    $highlightedDate: T,
    $isFocusVisible: Boolean,
    $isHighlighted: Boolean,
    $isHovered: Boolean,
    $month: Double,
    $outsideMonth: Boolean,
    $outsideMonthWithinRange: Boolean,
    $peekNextMonth: Boolean,
    $pseudoHighlighted: Boolean,
    $pseudoSelected: Boolean,
    $range: Boolean,
    $selected: Boolean,
    $startDate: Boolean,
    $startOfMonth: Boolean,
    $value: T | js.Array[T]
  ): Density[T] = {
    val __obj = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $density = $density.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $endDate = $endDate.asInstanceOf[js.Any], $endOfMonth = $endOfMonth.asInstanceOf[js.Any], $hasDateLabel = $hasDateLabel.asInstanceOf[js.Any], $hasLockedBehavior = $hasLockedBehavior.asInstanceOf[js.Any], $hasRangeHighlighted = $hasRangeHighlighted.asInstanceOf[js.Any], $hasRangeOnRight = $hasRangeOnRight.asInstanceOf[js.Any], $hasRangeSelected = $hasRangeSelected.asInstanceOf[js.Any], $highlightedDate = $highlightedDate.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $month = $month.asInstanceOf[js.Any], $outsideMonth = $outsideMonth.asInstanceOf[js.Any], $outsideMonthWithinRange = $outsideMonthWithinRange.asInstanceOf[js.Any], $peekNextMonth = $peekNextMonth.asInstanceOf[js.Any], $pseudoHighlighted = $pseudoHighlighted.asInstanceOf[js.Any], $pseudoSelected = $pseudoSelected.asInstanceOf[js.Any], $range = $range.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any], $startDate = $startDate.asInstanceOf[js.Any], $startOfMonth = $startOfMonth.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Density[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Density[?], T] (val x: Self & Density[T]) extends AnyVal {
    
    inline def set$date(value: T): Self = StObject.set(x, "$date", value.asInstanceOf[js.Any])
    
    inline def set$density(value: default_ | high): Self = StObject.set(x, "$density", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$endDate(value: Boolean): Self = StObject.set(x, "$endDate", value.asInstanceOf[js.Any])
    
    inline def set$endOfMonth(value: Boolean): Self = StObject.set(x, "$endOfMonth", value.asInstanceOf[js.Any])
    
    inline def set$hasDateLabel(value: Boolean): Self = StObject.set(x, "$hasDateLabel", value.asInstanceOf[js.Any])
    
    inline def set$hasLockedBehavior(value: Boolean): Self = StObject.set(x, "$hasLockedBehavior", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeHighlighted(value: Boolean): Self = StObject.set(x, "$hasRangeHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeOnRight(value: Boolean): Self = StObject.set(x, "$hasRangeOnRight", value.asInstanceOf[js.Any])
    
    inline def set$hasRangeSelected(value: Boolean): Self = StObject.set(x, "$hasRangeSelected", value.asInstanceOf[js.Any])
    
    inline def set$highlightedDate(value: T): Self = StObject.set(x, "$highlightedDate", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$isHovered(value: Boolean): Self = StObject.set(x, "$isHovered", value.asInstanceOf[js.Any])
    
    inline def set$month(value: Double): Self = StObject.set(x, "$month", value.asInstanceOf[js.Any])
    
    inline def set$outsideMonth(value: Boolean): Self = StObject.set(x, "$outsideMonth", value.asInstanceOf[js.Any])
    
    inline def set$outsideMonthWithinRange(value: Boolean): Self = StObject.set(x, "$outsideMonthWithinRange", value.asInstanceOf[js.Any])
    
    inline def set$peekNextMonth(value: Boolean): Self = StObject.set(x, "$peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def set$pseudoHighlighted(value: Boolean): Self = StObject.set(x, "$pseudoHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$pseudoSelected(value: Boolean): Self = StObject.set(x, "$pseudoSelected", value.asInstanceOf[js.Any])
    
    inline def set$range(value: Boolean): Self = StObject.set(x, "$range", value.asInstanceOf[js.Any])
    
    inline def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
    
    inline def set$selectedInput(value: InputRole): Self = StObject.set(x, "$selectedInput", value.asInstanceOf[js.Any])
    
    inline def set$selectedInputNull: Self = StObject.set(x, "$selectedInput", null)
    
    inline def set$selectedInputUndefined: Self = StObject.set(x, "$selectedInput", js.undefined)
    
    inline def set$startDate(value: Boolean): Self = StObject.set(x, "$startDate", value.asInstanceOf[js.Any])
    
    inline def set$startOfMonth(value: Boolean): Self = StObject.set(x, "$startOfMonth", value.asInstanceOf[js.Any])
    
    inline def set$value(value: T | js.Array[T]): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
    
    inline def set$valueVarargs(value: T*): Self = StObject.set(x, "$value", js.Array(value*))
  }
}
