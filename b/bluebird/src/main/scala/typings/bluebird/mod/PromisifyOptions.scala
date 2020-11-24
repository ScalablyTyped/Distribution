package typings.bluebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromisifyOptions extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var multiArgs: js.UndefOr[Boolean] = js.native
}
object PromisifyOptions {
  
  @scala.inline
  def apply(): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromisifyOptions]
  }
  
  @scala.inline
  implicit class PromisifyOptionsOps[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setMultiArgs(value: Boolean): Self = this.set("multiArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiArgs: Self = this.set("multiArgs", js.undefined)
  }
}
