package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDashboardResponse extends StObject {
  
  /**
    * Information about the dashboard.
    */
  var Dashboard: js.UndefOr[typings.awsSdk.quicksightMod.Dashboard] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of this request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeDashboardResponse {
  
  @scala.inline
  def apply(): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
  
  @scala.inline
  implicit class DescribeDashboardResponseMutableBuilder[Self <: DescribeDashboardResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboard(value: Dashboard): Self = StObject.set(x, "Dashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardUndefined: Self = StObject.set(x, "Dashboard", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
