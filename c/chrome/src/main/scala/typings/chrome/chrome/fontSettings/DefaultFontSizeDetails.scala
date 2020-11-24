package typings.chrome.chrome.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultFontSizeDetails extends js.Object {
  
  /** The font size in pixels. */
  var pixelSize: Double = js.native
}
object DefaultFontSizeDetails {
  
  @scala.inline
  def apply(pixelSize: Double): DefaultFontSizeDetails = {
    val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFontSizeDetails]
  }
  
  @scala.inline
  implicit class DefaultFontSizeDetailsOps[Self <: DefaultFontSizeDetails] (val x: Self) extends AnyVal {
    
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
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
  }
}
