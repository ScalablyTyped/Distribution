package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDeploymentsRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * If true, performs a best-effort only core reset.
    */
  var Force: js.UndefOr[boolean] = js.undefined
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object ResetDeploymentsRequest {
  
  @scala.inline
  def apply(GroupId: string): ResetDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDeploymentsRequest]
  }
  
  @scala.inline
  implicit class ResetDeploymentsRequestMutableBuilder[Self <: ResetDeploymentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setForce(value: boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
