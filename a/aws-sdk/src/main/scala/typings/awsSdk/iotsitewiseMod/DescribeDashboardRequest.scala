package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDashboardRequest extends StObject {
  
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID = js.native
}
object DescribeDashboardRequest {
  
  @scala.inline
  def apply(dashboardId: ID): DescribeDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardRequest]
  }
  
  @scala.inline
  implicit class DescribeDashboardRequestMutableBuilder[Self <: DescribeDashboardRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
  }
}
