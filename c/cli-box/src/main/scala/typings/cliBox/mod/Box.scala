package typings.cliBox.mod

import typings.cliBox.anon.Fullscreen
import typings.cliBox.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box extends js.Object {
  
  var options: Fullscreen = js.native
  
  var settings: Height = js.native
  
  def stringify(): String = js.native
}
object Box {
  
  @scala.inline
  def apply(options: Fullscreen, settings: Height, stringify: () => String): Box = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
    __obj.asInstanceOf[Box]
  }
  
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: Fullscreen): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Height): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringify(value: () => String): Self = this.set("stringify", js.Any.fromFunction0(value))
  }
}
