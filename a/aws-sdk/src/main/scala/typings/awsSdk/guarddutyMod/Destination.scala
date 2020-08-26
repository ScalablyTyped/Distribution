package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The unique ID of the publishing destination.
    */
  var DestinationId: String = js.native
  /**
    * The type of resource used for the publishing destination. Currently, only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.guarddutyMod.DestinationType = js.native
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}

object Destination {
  @scala.inline
  def apply(DestinationId: String, DestinationType: DestinationType, Status: PublishingStatus): Destination = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
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
    def setDestinationId(value: String): Self = this.set("DestinationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationType(value: DestinationType): Self = this.set("DestinationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PublishingStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

