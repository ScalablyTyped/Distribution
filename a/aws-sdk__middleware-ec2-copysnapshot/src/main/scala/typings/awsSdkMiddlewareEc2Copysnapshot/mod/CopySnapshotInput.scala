package typings.awsSdkMiddlewareEc2Copysnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySnapshotInput extends js.Object {
  var DestinationRegion: js.UndefOr[String] = js.native
  var PresignedUrl: js.UndefOr[String] = js.native
  var SourceRegion: String = js.native
}

object CopySnapshotInput {
  @scala.inline
  def apply(SourceRegion: String): CopySnapshotInput = {
    val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotInput]
  }
  @scala.inline
  implicit class CopySnapshotInputOps[Self <: CopySnapshotInput] (val x: Self) extends AnyVal {
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
    def setSourceRegion(value: String): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationRegion(value: String): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationRegion: Self = this.set("DestinationRegion", js.undefined)
    @scala.inline
    def setPresignedUrl(value: String): Self = this.set("PresignedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresignedUrl: Self = this.set("PresignedUrl", js.undefined)
  }
  
}

