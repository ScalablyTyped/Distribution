package typings.ctrlTinycolor.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinyColorOptions extends js.Object {
  
  var format: String = js.native
  
  var gradientType: String = js.native
}
object TinyColorOptions {
  
  @scala.inline
  def apply(format: String, gradientType: String): TinyColorOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinyColorOptions]
  }
  
  @scala.inline
  implicit class TinyColorOptionsOps[Self <: TinyColorOptions] (val x: Self) extends AnyVal {
    
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
    def setGradientType(value: String): Self = this.set("gradientType", value.asInstanceOf[js.Any])
  }
}
