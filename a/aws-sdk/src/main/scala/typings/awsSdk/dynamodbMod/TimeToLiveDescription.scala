package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveDescription extends js.Object {
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.native
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveStatus] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeName(value: TimeToLiveAttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    @scala.inline
    def setTimeToLiveStatus(value: TimeToLiveStatus): Self = this.set("TimeToLiveStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLiveStatus: Self = this.set("TimeToLiveStatus", js.undefined)
  }
  
}

