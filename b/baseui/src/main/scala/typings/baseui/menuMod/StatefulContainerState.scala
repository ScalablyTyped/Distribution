package typings.baseui.menuMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerState extends StObject {
  
  var activedescendantId: js.UndefOr[String] = js.undefined
  
  var highlightedIndex: Double
  
  var isFocused: Boolean
}
object StatefulContainerState {
  
  @scala.inline
  def apply(highlightedIndex: Double, isFocused: Boolean): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerState]
  }
  
  @scala.inline
  implicit class StatefulContainerStateMutableBuilder[Self <: StatefulContainerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivedescendantId(value: String): Self = StObject.set(x, "activedescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivedescendantIdUndefined: Self = StObject.set(x, "activedescendantId", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
