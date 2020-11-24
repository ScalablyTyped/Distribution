package typings.ccap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
      // set pic quality,default is 50
  var fontsize: js.UndefOr[Double] = js.native
  
      // set font size,default is 57
  // Custom the function to generate captcha text
  var generate: js.UndefOr[js.Function0[String]] = js.native
  
      // set width,default is 256
  var height: js.UndefOr[Double] = js.native
  
      // set height,default is 60
  var offset: js.UndefOr[Double] = js.native
  
      // set text spacing,default is 40
  var quality: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFontsize(value: Double): Self = this.set("fontsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontsize: Self = this.set("fontsize", js.undefined)
    
    @scala.inline
    def setGenerate(value: () => String): Self = this.set("generate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
