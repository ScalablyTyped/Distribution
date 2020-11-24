package typings.baseui.flexGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexGridItemProps extends FlexGridProps {
  
  var flexGridItemCount: js.UndefOr[Double] = js.native
  
  var flexGridItemIndex: js.UndefOr[Double] = js.native
}
object FlexGridItemProps {
  
  @scala.inline
  def apply(): FlexGridItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGridItemProps]
  }
  
  @scala.inline
  implicit class FlexGridItemPropsOps[Self <: FlexGridItemProps] (val x: Self) extends AnyVal {
    
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
    def setFlexGridItemCount(value: Double): Self = this.set("flexGridItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGridItemCount: Self = this.set("flexGridItemCount", js.undefined)
    
    @scala.inline
    def setFlexGridItemIndex(value: Double): Self = this.set("flexGridItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGridItemIndex: Self = this.set("flexGridItemIndex", js.undefined)
  }
}
