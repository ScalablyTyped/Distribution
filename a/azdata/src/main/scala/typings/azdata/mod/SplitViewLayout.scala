package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitViewLayout extends FlexLayout {
  
  /**
    * Orientation of the views inside split
    */
  var orientation: String = js.native
  
  /**
    * SplitView height
    */
  var splitViewHeight: Double | String = js.native
}
object SplitViewLayout {
  
  @scala.inline
  def apply(orientation: String, splitViewHeight: Double | String): SplitViewLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], splitViewHeight = splitViewHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewLayout]
  }
  
  @scala.inline
  implicit class SplitViewLayoutOps[Self <: SplitViewLayout] (val x: Self) extends AnyVal {
    
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
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitViewHeight(value: Double | String): Self = this.set("splitViewHeight", value.asInstanceOf[js.Any])
  }
}
