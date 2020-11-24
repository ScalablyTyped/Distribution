package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivContainerProperties extends ComponentProperties {
  
  /**
    * Indicates whether the element is clickable
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * Matches the overflow-y CSS property and its available values.
    */
  var overflowY: js.UndefOr[String] = js.native
  
  /**
    * Setting the scroll based on the y offset
    * This is used when its child component is webview
    */
  var yOffsetChange: js.UndefOr[Double] = js.native
}
object DivContainerProperties {
  
  @scala.inline
  def apply(): DivContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivContainerProperties]
  }
  
  @scala.inline
  implicit class DivContainerPropertiesOps[Self <: DivContainerProperties] (val x: Self) extends AnyVal {
    
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
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setOverflowY(value: String): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    
    @scala.inline
    def setYOffsetChange(value: Double): Self = this.set("yOffsetChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffsetChange: Self = this.set("yOffsetChange", js.undefined)
  }
}
