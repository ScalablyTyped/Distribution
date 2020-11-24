package typings.browserSync.mod

import typings.browserSync.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIOptions extends js.Object {
  
  /** set the default port */
  var port: js.UndefOr[Double] = js.native
  
  /** set the default weinre port */
  var weinre: js.UndefOr[Port] = js.native
}
object UIOptions {
  
  @scala.inline
  def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  
  @scala.inline
  implicit class UIOptionsOps[Self <: UIOptions] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setWeinre(value: Port): Self = this.set("weinre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeinre: Self = this.set("weinre", js.undefined)
  }
}
