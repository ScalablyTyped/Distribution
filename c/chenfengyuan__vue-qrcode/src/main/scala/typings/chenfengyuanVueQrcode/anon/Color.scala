package typings.chenfengyuanVueQrcode.anon

import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`0`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`1`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`2`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`3`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`4`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`5`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`6`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`7`
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.H
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.L
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.M
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.Q
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.high
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.low
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.medium
import typings.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.quartile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  
  var color: js.UndefOr[Dark] = js.native
  
  // Error correction level.
  var errorCorrectionLevel: js.UndefOr[low | medium | quartile | high | L | M | Q | H] = js.native
  
  // Define how much wide the quiet zone should be.
  var margin: js.UndefOr[Double] = js.native
  
  // Mask pattern used to mask the symbol.
  var maskPattern: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  
  // Scale factor.
  var scale: js.UndefOr[Double] = js.native
  
  // QR Code version.
  var version: js.UndefOr[Double] = js.native
  
  // Forces a specific width for the output image.
  var width: js.UndefOr[Double] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Dark): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setErrorCorrectionLevel(value: low | medium | quartile | high | L | M | Q | H): Self = this.set("errorCorrectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCorrectionLevel: Self = this.set("errorCorrectionLevel", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMaskPattern(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("maskPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskPattern: Self = this.set("maskPattern", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
