package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeBasedCanary extends js.Object {
  
  /**
    * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
    */
  var canaryInterval: js.UndefOr[WaitTimeInMins] = js.native
  
  /**
    * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
    */
  var canaryPercentage: js.UndefOr[Percentage] = js.native
}
object TimeBasedCanary {
  
  @scala.inline
  def apply(): TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedCanary]
  }
  
  @scala.inline
  implicit class TimeBasedCanaryOps[Self <: TimeBasedCanary] (val x: Self) extends AnyVal {
    
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
    def setCanaryInterval(value: WaitTimeInMins): Self = this.set("canaryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanaryInterval: Self = this.set("canaryInterval", js.undefined)
    
    @scala.inline
    def setCanaryPercentage(value: Percentage): Self = this.set("canaryPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanaryPercentage: Self = this.set("canaryPercentage", js.undefined)
  }
}
