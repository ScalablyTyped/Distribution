package typings.awsSdkFetchHttpHandler.fetchHttpHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserHttpOptions extends js.Object {
  
  /**
    * The number of milliseconds a request can take before being automatically
    * terminated.
    */
  var requestTimeout: js.UndefOr[Double] = js.native
}
object BrowserHttpOptions {
  
  @scala.inline
  def apply(): BrowserHttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserHttpOptions]
  }
  
  @scala.inline
  implicit class BrowserHttpOptionsOps[Self <: BrowserHttpOptions] (val x: Self) extends AnyVal {
    
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
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
  }
}
