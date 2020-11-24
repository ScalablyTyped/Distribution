package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackOptions extends js.Object {
  
  var afterZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  
  var beforeZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Boolean]] = js.native
}
object CallbackOptions {
  
  @scala.inline
  def apply(): CallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackOptions]
  }
  
  @scala.inline
  implicit class CallbackOptionsOps[Self <: CallbackOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterZoom(value: (/* start */ Double, /* end */ Double) => Unit): Self = this.set("afterZoom", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterZoom: Self = this.set("afterZoom", js.undefined)
    
    @scala.inline
    def setBeforeZoom(value: (/* start */ Double, /* end */ Double) => Boolean): Self = this.set("beforeZoom", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeZoom: Self = this.set("beforeZoom", js.undefined)
  }
}
