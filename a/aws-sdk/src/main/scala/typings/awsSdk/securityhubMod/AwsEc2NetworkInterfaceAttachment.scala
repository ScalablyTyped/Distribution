package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceAttachment extends StObject {
  
  /**
    * Indicates when the attachment initiated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var AttachTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the network interface attachment
    */
  var AttachmentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The attachment state. Valid values: attaching | attached | detaching | detached 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkInterfaceAttachment {
  
  inline def apply(): AwsEc2NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceAttachment]
  }
  
  extension [Self <: AwsEc2NetworkInterfaceAttachment](x: Self) {
    
    inline def setAttachTime(value: NonEmptyString): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    inline def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    inline def setAttachmentId(value: NonEmptyString): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setDeviceIndex(value: Integer): Self = StObject.set(x, "DeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setDeviceIndexUndefined: Self = StObject.set(x, "DeviceIndex", js.undefined)
    
    inline def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceOwnerId(value: NonEmptyString): Self = StObject.set(x, "InstanceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setInstanceOwnerIdUndefined: Self = StObject.set(x, "InstanceOwnerId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
