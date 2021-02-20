package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupCertificateAuthoritiesRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}
object ListGroupCertificateAuthoritiesRequest {
  
  @scala.inline
  def apply(GroupId: string): ListGroupCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesRequest]
  }
  
  @scala.inline
  implicit class ListGroupCertificateAuthoritiesRequestMutableBuilder[Self <: ListGroupCertificateAuthoritiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
