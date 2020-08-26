package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscription extends js.Object {
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.directoryserviceMod.LogGroupName] = js.native
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.SubscriptionCreatedDateTime] = js.native
}

object LogSubscription {
  @scala.inline
  def apply(): LogSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSubscription]
  }
  @scala.inline
  implicit class LogSubscriptionOps[Self <: LogSubscription] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    @scala.inline
    def setSubscriptionCreatedDateTime(value: SubscriptionCreatedDateTime): Self = this.set("SubscriptionCreatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionCreatedDateTime: Self = this.set("SubscriptionCreatedDateTime", js.undefined)
  }
  
}

