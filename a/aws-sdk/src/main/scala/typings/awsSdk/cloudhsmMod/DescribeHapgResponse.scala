package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHapgResponse extends js.Object {
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
  implicit class DescribeHapgResponseOps[Self <: DescribeHapgResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHapgArn(value: HapgArn): Self = this.set("HapgArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHapgArn: Self = this.set("HapgArn", js.undefined)
    @scala.inline
    def setHapgSerial(value: String): Self = this.set("HapgSerial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHapgSerial: Self = this.set("HapgSerial", js.undefined)
    @scala.inline
    def setHsmsLastActionFailedVarargs(value: HsmArn*): Self = this.set("HsmsLastActionFailed", js.Array(value :_*))
    @scala.inline
    def setHsmsLastActionFailed(value: HsmList): Self = this.set("HsmsLastActionFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmsLastActionFailed: Self = this.set("HsmsLastActionFailed", js.undefined)
    @scala.inline
    def setHsmsPendingDeletionVarargs(value: HsmArn*): Self = this.set("HsmsPendingDeletion", js.Array(value :_*))
    @scala.inline
    def setHsmsPendingDeletion(value: HsmList): Self = this.set("HsmsPendingDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmsPendingDeletion: Self = this.set("HsmsPendingDeletion", js.undefined)
    @scala.inline
    def setHsmsPendingRegistrationVarargs(value: HsmArn*): Self = this.set("HsmsPendingRegistration", js.Array(value :_*))
    @scala.inline
    def setHsmsPendingRegistration(value: HsmList): Self = this.set("HsmsPendingRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmsPendingRegistration: Self = this.set("HsmsPendingRegistration", js.undefined)
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    @scala.inline
    def setLastModifiedTimestamp(value: Timestamp): Self = this.set("LastModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("LastModifiedTimestamp", js.undefined)
    @scala.inline
    def setPartitionSerialListVarargs(value: PartitionSerial*): Self = this.set("PartitionSerialList", js.Array(value :_*))
    @scala.inline
    def setPartitionSerialList(value: PartitionSerialList): Self = this.set("PartitionSerialList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionSerialList: Self = this.set("PartitionSerialList", js.undefined)
    @scala.inline
    def setState(value: CloudHsmObjectState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

