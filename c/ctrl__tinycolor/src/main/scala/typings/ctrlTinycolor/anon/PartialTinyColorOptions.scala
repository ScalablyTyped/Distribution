package typings.ctrlTinycolor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ctrl/tinycolor.@ctrl/tinycolor/dist.TinyColorOptions> */
@js.native
trait PartialTinyColorOptions extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var gradientType: js.UndefOr[String] = js.native
}
object PartialTinyColorOptions {
  
  @scala.inline
  def apply(): PartialTinyColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTinyColorOptions]
  }
  
  @scala.inline
  implicit class PartialTinyColorOptionsOps[Self <: PartialTinyColorOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGradientType(value: String): Self = this.set("gradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientType: Self = this.set("gradientType", js.undefined)
  }
}
