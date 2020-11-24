package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Support extends js.Object {
  
  var browser: Boolean = js.native
  
  var decompilation: Boolean = js.native
  
  var timeout: Boolean = js.native
}
object Support {
  
  @scala.inline
  def apply(browser: Boolean, decompilation: Boolean, timeout: Boolean): Support = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompilation(value: Boolean): Self = this.set("decompilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Boolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
