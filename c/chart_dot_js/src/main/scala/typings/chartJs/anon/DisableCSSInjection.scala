package typings.chartJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableCSSInjection extends js.Object {
  
  var disableCSSInjection: Boolean = js.native
}
object DisableCSSInjection {
  
  @scala.inline
  def apply(disableCSSInjection: Boolean): DisableCSSInjection = {
    val __obj = js.Dynamic.literal(disableCSSInjection = disableCSSInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCSSInjection]
  }
  
  @scala.inline
  implicit class DisableCSSInjectionOps[Self <: DisableCSSInjection] (val x: Self) extends AnyVal {
    
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
    def setDisableCSSInjection(value: Boolean): Self = this.set("disableCSSInjection", value.asInstanceOf[js.Any])
  }
}
