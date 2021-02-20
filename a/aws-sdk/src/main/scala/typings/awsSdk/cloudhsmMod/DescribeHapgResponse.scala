package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HapgArn] = js.native
  
  /**
    * The serial number of the high-availability partition group.
    */
  var HapgSerial: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var HsmsLastActionFailed: js.UndefOr[HsmList] = js.native
  
  /**
    * 
    */
  var HsmsPendingDeletion: js.UndefOr[HsmList] = js.native
  
  /**
    * 
    */
  var HsmsPendingRegistration: js.UndefOr[HsmList] = js.native
  
  /**
    * The label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsSdk.cloudhsmMod.Label] = js.native
  
  /**
    * The date and time the high-availability partition group was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The list of partition serial numbers that belong to the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsSdk.cloudhsmMod.PartitionSerialList] = js.native
  
  /**
    * The state of the high-availability partition group.
    */
  var State: js.UndefOr[CloudHsmObjectState] = js.native
}
object DescribeHapgResponse {
  
  @scala.inline
  def apply(): DescribeHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHapgResponse]
  }
  
  @scala.inline
  implicit class DescribeHapgResponseMutableBuilder[Self <: DescribeHapgResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
    
    @scala.inline
    def setHapgSerial(value: String): Self = StObject.set(x, "HapgSerial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgSerialUndefined: Self = StObject.set(x, "HapgSerial", js.undefined)
    
    @scala.inline
    def setHsmsLastActionFailed(value: HsmList): Self = StObject.set(x, "HsmsLastActionFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmsLastActionFailedUndefined: Self = StObject.set(x, "HsmsLastActionFailed", js.undefined)
    
    @scala.inline
    def setHsmsLastActionFailedVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsLastActionFailed", js.Array(value :_*))
    
    @scala.inline
    def setHsmsPendingDeletion(value: HsmList): Self = StObject.set(x, "HsmsPendingDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmsPendingDeletionUndefined: Self = StObject.set(x, "HsmsPendingDeletion", js.undefined)
    
    @scala.inline
    def setHsmsPendingDeletionVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsPendingDeletion", js.Array(value :_*))
    
    @scala.inline
    def setHsmsPendingRegistration(value: HsmList): Self = StObject.set(x, "HsmsPendingRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmsPendingRegistrationUndefined: Self = StObject.set(x, "HsmsPendingRegistration", js.undefined)
    
    @scala.inline
    def setHsmsPendingRegistrationVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsPendingRegistration", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: Timestamp): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setPartitionSerialList(value: PartitionSerialList): Self = StObject.set(x, "PartitionSerialList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionSerialListUndefined: Self = StObject.set(x, "PartitionSerialList", js.undefined)
    
    @scala.inline
    def setPartitionSerialListVarargs(value: PartitionSerial*): Self = StObject.set(x, "PartitionSerialList", js.Array(value :_*))
    
    @scala.inline
    def setState(value: CloudHsmObjectState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
