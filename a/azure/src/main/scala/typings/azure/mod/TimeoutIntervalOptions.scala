package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutIntervalOptions extends js.Object {
  
  var locationMode: js.UndefOr[String] = js.native
  
  var maximumExecutionTimeInMs: js.UndefOr[Double] = js.native
  
  var timeoutIntervalInMs: js.UndefOr[Double] = js.native
}
object TimeoutIntervalOptions {
  
  @scala.inline
  def apply(): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
  
  @scala.inline
  implicit class TimeoutIntervalOptionsOps[Self <: TimeoutIntervalOptions] (val x: Self) extends AnyVal {
    
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
    def setLocationMode(value: String): Self = this.set("locationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMode: Self = this.set("locationMode", js.undefined)
    
    @scala.inline
    def setMaximumExecutionTimeInMs(value: Double): Self = this.set("maximumExecutionTimeInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumExecutionTimeInMs: Self = this.set("maximumExecutionTimeInMs", js.undefined)
    
    @scala.inline
    def setTimeoutIntervalInMs(value: Double): Self = this.set("timeoutIntervalInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutIntervalInMs: Self = this.set("timeoutIntervalInMs", js.undefined)
  }
}
