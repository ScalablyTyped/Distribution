package typings.ctrlTinycolor.randomMod

import typings.ctrlTinycolor.ctrlTinycolorStrings.blue
import typings.ctrlTinycolor.ctrlTinycolorStrings.bright
import typings.ctrlTinycolor.ctrlTinycolorStrings.dark
import typings.ctrlTinycolor.ctrlTinycolorStrings.green
import typings.ctrlTinycolor.ctrlTinycolorStrings.light
import typings.ctrlTinycolor.ctrlTinycolorStrings.monochrome
import typings.ctrlTinycolor.ctrlTinycolorStrings.orange
import typings.ctrlTinycolor.ctrlTinycolorStrings.pink
import typings.ctrlTinycolor.ctrlTinycolorStrings.purple
import typings.ctrlTinycolor.ctrlTinycolorStrings.red
import typings.ctrlTinycolor.ctrlTinycolorStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomOptions extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var hue: js.UndefOr[
    Double | String | red | orange | yellow | green | blue | purple | pink | monochrome
  ] = js.native
  
  var luminosity: js.UndefOr[typings.ctrlTinycolor.ctrlTinycolorStrings.random | bright | dark | light] = js.native
  
  var seed: js.UndefOr[Double] = js.native
}
object RandomOptions {
  
  @scala.inline
  def apply(): RandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomOptions]
  }
  
  @scala.inline
  implicit class RandomOptionsOps[Self <: RandomOptions] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setHue(value: Double | String | red | orange | yellow | green | blue | purple | pink | monochrome): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setLuminosity(value: typings.ctrlTinycolor.ctrlTinycolorStrings.random | bright | dark | light): Self = this.set("luminosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuminosity: Self = this.set("luminosity", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
