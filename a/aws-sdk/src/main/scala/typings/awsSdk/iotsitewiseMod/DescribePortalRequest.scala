package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortalRequest extends StObject {
  
  /**
    * The ID of the portal.
    */
  var portalId: ID = js.native
}
object DescribePortalRequest {
  
  @scala.inline
  def apply(portalId: ID): DescribePortalRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequest]
  }
  
  @scala.inline
  implicit class DescribePortalRequestMutableBuilder[Self <: DescribePortalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
  }
}
