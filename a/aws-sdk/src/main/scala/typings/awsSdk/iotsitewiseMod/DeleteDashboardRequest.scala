package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDashboardRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the dashboard to delete.
    */
  var dashboardId: ID
}
object DeleteDashboardRequest {
  
  @scala.inline
  def apply(dashboardId: ID): DeleteDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardRequest]
  }
  
  @scala.inline
  implicit class DeleteDashboardRequestMutableBuilder[Self <: DeleteDashboardRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setDashboardId(value: ID): Self = StObject.set(x, "dashboardId", value.asInstanceOf[js.Any])
  }
}
