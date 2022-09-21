package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VolumeAttachment extends StObject {
  
  /**
    * The datetime when the attachment initiated.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the EBS volume is deleted when the EC2 instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the EC2 instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The attachment state of the volume. Valid values are as follows:    attaching     attached     busy     detaching     detached   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VolumeAttachment {
  
  inline def apply(): AwsEc2VolumeAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeAttachment]
  }
  
  extension [Self <: AwsEc2VolumeAttachment](x: Self) {
    
    inline def setAttachTime(value: NonEmptyString): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    inline def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
