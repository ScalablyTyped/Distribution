package typings.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorHashOptions extends js.Object {
  
  var hash: js.UndefOr[HashFunction] = js.native
  
  var hue: js.UndefOr[Hue] = js.native
  
  var lightness: js.UndefOr[Lightness] = js.native
  
  var saturation: js.UndefOr[Saturation] = js.native
}
object ColorHashOptions {
  
  @scala.inline
  def apply(): ColorHashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHashOptions]
  }
  
  @scala.inline
  implicit class ColorHashOptionsOps[Self <: ColorHashOptions] (val x: Self) extends AnyVal {
    
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
    def setHash(value: /* input */ String => Double): Self = this.set("hash", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHueVarargs(value: HueObject*): Self = this.set("hue", js.Array(value :_*))
    
    @scala.inline
    def setHue(value: Hue): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setLightness(value: Lightness): Self = this.set("lightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightness: Self = this.set("lightness", js.undefined)
    
    @scala.inline
    def setSaturation(value: Saturation): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
  }
}
