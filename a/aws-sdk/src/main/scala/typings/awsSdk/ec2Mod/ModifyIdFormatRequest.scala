package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyIdFormatRequest extends StObject {
  
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | route-table | route-table-association | security-group | subnet | subnet-cidr-block-association | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway. Alternatively, use the all-current option to include all resource types that are currently within their opt-in period for longer IDs.
    */
  var Resource: String = js.native
  
  /**
    * Indicate whether the resource should use longer IDs (17-character IDs).
    */
  var UseLongIds: Boolean = js.native
}
object ModifyIdFormatRequest {
  
  @scala.inline
  def apply(Resource: String, UseLongIds: Boolean): ModifyIdFormatRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], UseLongIds = UseLongIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIdFormatRequest]
  }
  
  @scala.inline
  implicit class ModifyIdFormatRequestMutableBuilder[Self <: ModifyIdFormatRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongIds(value: Boolean): Self = StObject.set(x, "UseLongIds", value.asInstanceOf[js.Any])
  }
}
