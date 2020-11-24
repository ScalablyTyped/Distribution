package typings.awsSdk.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaiterConfiguration extends js.Object {
  
  /**
    * The number of seconds to wait between requests
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of requests to send while waiting
    */
  var maxAttempts: js.UndefOr[Double] = js.native
}
object WaiterConfiguration {
  
  @scala.inline
  def apply(): WaiterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaiterConfiguration]
  }
  
  @scala.inline
  implicit class WaiterConfigurationOps[Self <: WaiterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
  }
}
