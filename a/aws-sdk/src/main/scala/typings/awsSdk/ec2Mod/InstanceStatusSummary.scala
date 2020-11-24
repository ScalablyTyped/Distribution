package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusSummary extends js.Object {
  
  /**
    * The system instance health or application instance health.
    */
  var Details: js.UndefOr[InstanceStatusDetailsList] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[SummaryStatus] = js.native
}
object InstanceStatusSummary {
  
  @scala.inline
  def apply(): InstanceStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusSummary]
  }
  
  @scala.inline
  implicit class InstanceStatusSummaryOps[Self <: InstanceStatusSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetailsVarargs(value: InstanceStatusDetails*): Self = this.set("Details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: InstanceStatusDetailsList): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setStatus(value: SummaryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
