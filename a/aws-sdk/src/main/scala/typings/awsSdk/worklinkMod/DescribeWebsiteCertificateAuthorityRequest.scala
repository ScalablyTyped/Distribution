package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWebsiteCertificateAuthorityRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  
  /**
    * A unique identifier for the certificate authority.
    */
  var WebsiteCaId: Id = js.native
}
object DescribeWebsiteCertificateAuthorityRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn, WebsiteCaId: Id): DescribeWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class DescribeWebsiteCertificateAuthorityRequestMutableBuilder[Self <: DescribeWebsiteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
  }
}
