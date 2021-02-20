package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2VolumeAttachment extends StObject {
  
  /**
    * The datetime when the attachment initiated.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the EBS volume is deleted when the EC2 instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * The identifier of the EC2 instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The attachment state of the volume.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2VolumeAttachment {
  
  @scala.inline
  def apply(): AwsEc2VolumeAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeAttachment]
  }
  
  @scala.inline
  implicit class AwsEc2VolumeAttachmentMutableBuilder[Self <: AwsEc2VolumeAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTime(value: NonEmptyString): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
