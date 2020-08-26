package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentReference extends js.Object {
  /**
    * The unique identifier for the segment.
    */
  var Id: string = js.native
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[integer] = js.native
}

object SegmentReference {
  @scala.inline
  def apply(Id: string): SegmentReference = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentReference]
  }
  @scala.inline
  implicit class SegmentReferenceOps[Self <: SegmentReference] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: integer): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

