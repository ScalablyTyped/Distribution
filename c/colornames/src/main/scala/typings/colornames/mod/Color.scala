package typings.colornames.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  
  /**
    * Gets a value indicating whether the color is a valid `CSS`-color.
    */
  var css: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the name of the color.
    */
  var name: String = js.native
  
  /**
    * Gets the value of the color.
    */
  var value: String = js.native
  
  /**
    * Gets a value indicating whether the color is a valid `VGA`-color.
    */
  var vga: js.UndefOr[Boolean] = js.native
}
object Color {
  
  @scala.inline
  def apply(name: String, value: String): Color = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: Boolean): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setVga(value: Boolean): Self = this.set("vga", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVga: Self = this.set("vga", js.undefined)
  }
}
