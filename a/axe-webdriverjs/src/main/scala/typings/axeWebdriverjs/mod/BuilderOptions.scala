package typings.axeWebdriverjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuilderOptions extends js.Object {
  
  /**
    * Should errors be printed into console
    * @default true
    */
  var logIframeErrors: js.UndefOr[Boolean] = js.native
}
object BuilderOptions {
  
  @scala.inline
  def apply(): BuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOptions]
  }
  
  @scala.inline
  implicit class BuilderOptionsOps[Self <: BuilderOptions] (val x: Self) extends AnyVal {
    
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
    def setLogIframeErrors(value: Boolean): Self = this.set("logIframeErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogIframeErrors: Self = this.set("logIframeErrors", js.undefined)
  }
}
