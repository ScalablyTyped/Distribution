package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusSummary extends StObject {
  
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
  implicit class InstanceStatusSummaryMutableBuilder[Self <: InstanceStatusSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: InstanceStatusDetailsList): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: InstanceStatusDetails*): Self = StObject.set(x, "Details", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SummaryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
