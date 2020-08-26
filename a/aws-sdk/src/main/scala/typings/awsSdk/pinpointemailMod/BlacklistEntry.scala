package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlacklistEntry extends js.Object {
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.native
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typings.awsSdk.pinpointemailMod.RblName] = js.native
}

object BlacklistEntry {
  @scala.inline
  def apply(): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlacklistEntry]
  }
  @scala.inline
  implicit class BlacklistEntryOps[Self <: BlacklistEntry] (val x: Self) extends AnyVal {
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
    def setDescription(value: BlacklistingDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setListingTime(value: Timestamp): Self = this.set("ListingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListingTime: Self = this.set("ListingTime", js.undefined)
    @scala.inline
    def setRblName(value: RblName): Self = this.set("RblName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRblName: Self = this.set("RblName", js.undefined)
  }
  
}

