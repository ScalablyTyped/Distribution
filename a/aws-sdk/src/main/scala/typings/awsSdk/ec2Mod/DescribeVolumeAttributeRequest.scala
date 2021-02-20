package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumeAttributeRequest extends StObject {
  
  /**
    * The attribute of the volume. This parameter is required.
    */
  var Attribute: VolumeAttributeName = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}
object DescribeVolumeAttributeRequest {
  
  @scala.inline
  def apply(Attribute: VolumeAttributeName, VolumeId: VolumeId): DescribeVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumeAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumeAttributeRequestMutableBuilder[Self <: DescribeVolumeAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: VolumeAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
