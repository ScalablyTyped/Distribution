package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLedgerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the ledger.
    */
  var Arn: js.UndefOr[typings.awsSdk.qldbMod.Arn] = js.native
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.qldbMod.DeletionProtection] = js.native
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.native
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.native
}

object CreateLedgerResponse {
  @scala.inline
  def apply(): CreateLedgerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLedgerResponse]
  }
  @scala.inline
  implicit class CreateLedgerResponseOps[Self <: CreateLedgerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationDateTime(value: Timestamp): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    @scala.inline
    def setDeletionProtection(value: DeletionProtection): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    @scala.inline
    def setName(value: LedgerName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setState(value: LedgerState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

