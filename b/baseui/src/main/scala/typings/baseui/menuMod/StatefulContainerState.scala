package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulContainerState extends js.Object {
  
  var activedescendantId: js.UndefOr[String] = js.native
  
  var highlightedIndex: Double = js.native
  
  var isFocused: Boolean = js.native
}
object StatefulContainerState {
  
  @scala.inline
  def apply(highlightedIndex: Double, isFocused: Boolean): StatefulContainerState = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerState]
  }
  
  @scala.inline
  implicit class StatefulContainerStateOps[Self <: StatefulContainerState] (val x: Self) extends AnyVal {
    
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
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivedescendantId(value: String): Self = this.set("activedescendantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivedescendantId: Self = this.set("activedescendantId", js.undefined)
  }
}
