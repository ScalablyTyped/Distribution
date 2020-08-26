package typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DISABLING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLED
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ENABLING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveDescription extends js.Object {
  /**
    * <p> The name of the Time to Live attribute for items in the table.</p>
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * <p> The Time to Live status for the table.</p>
    */
  var TimeToLiveStatus: js.UndefOr[ENABLING | DISABLING | ENABLED | DISABLED | String] = js.native
}

object TimeToLiveDescription {
  @scala.inline
  def apply(): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveDescription]
  }
  @scala.inline
  implicit class TimeToLiveDescriptionOps[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    @scala.inline
    def setTimeToLiveStatus(value: ENABLING | DISABLING | ENABLED | DISABLED | String): Self = this.set("TimeToLiveStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLiveStatus: Self = this.set("TimeToLiveStatus", js.undefined)
  }
  
}

