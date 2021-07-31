package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMountTargetSecurityGroupsRequest extends StObject {
  
  /**
    * The ID of the mount target whose security groups you want to retrieve.
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId
}
object DescribeMountTargetSecurityGroupsRequest {
  
  @scala.inline
  def apply(MountTargetId: MountTargetId): DescribeMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeMountTargetSecurityGroupsRequestMutableBuilder[Self <: DescribeMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
  }
}
