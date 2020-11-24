package typings.bootstrap.toastMod.Toast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Apply a CSS fade transition to the toast
    *
    * @default true
    */
  var animation: Boolean = js.native
  
  /**
    * Auto hide the toast
    *
    * @default true
    */
  var autohide: Boolean = js.native
  
  /**
    * Delay hiding the toast (ms)
    *
    * @default 500
    */
  var delay: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(animation: Boolean, autohide: Boolean, delay: Double): Options = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], autohide = autohide.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any])
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
  }
}
