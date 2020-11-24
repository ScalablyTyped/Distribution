package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizeDetails extends js.Object {
  
  /** The level of control this extension has over the setting. */
  var levelOfControl: String = js.native
  
  /** The font size in pixels. */
  var pixelSize: Double = js.native
}
object FontSizeDetails {
  
  @scala.inline
  def apply(levelOfControl: String, pixelSize: Double): FontSizeDetails = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeDetails]
  }
  
  @scala.inline
  implicit class FontSizeDetailsOps[Self <: FontSizeDetails] (val x: Self) extends AnyVal {
    
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
    def setLevelOfControl(value: String): Self = this.set("levelOfControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
  }
}
