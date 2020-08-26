package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnerEventSourceAccount extends js.Object {
  /**
    * The AWS account ID that the partner event source was offered to.
    */
  var Account: js.UndefOr[AccountId] = js.native
  /**
    * The date and time the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for it.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.native
}

object PartnerEventSourceAccount {
  @scala.inline
  def apply(): PartnerEventSourceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerEventSourceAccount]
  }
  @scala.inline
  implicit class PartnerEventSourceAccountOps[Self <: PartnerEventSourceAccount] (val x: Self) extends AnyVal {
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
    def setAccount(value: AccountId): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    @scala.inline
    def setState(value: EventSourceState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

