package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextboxOptions extends TextareaOptions {
  
  /**
    * Replace text with asterisks (*).
    */
  var censor: js.UndefOr[Boolean] = js.native
  
  /**
    * Completely hide text.
    */
  var secret: js.UndefOr[Boolean] = js.native
}
object TextboxOptions {
  
  @scala.inline
  def apply(): TextboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextboxOptions]
  }
  
  @scala.inline
  implicit class TextboxOptionsOps[Self <: TextboxOptions] (val x: Self) extends AnyVal {
    
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
    def setCensor(value: Boolean): Self = this.set("censor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCensor: Self = this.set("censor", js.undefined)
    
    @scala.inline
    def setSecret(value: Boolean): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
