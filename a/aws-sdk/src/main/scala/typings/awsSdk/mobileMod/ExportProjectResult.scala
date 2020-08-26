package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportProjectResult extends js.Object {
  /**
    *  URL which can be used to download the exported project configuation file(s). 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.native
  /**
    *  URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that is created when this API is called. If you want to share additional changes to your project configuration, then you will need to create and share a new snapshot by calling this method again. 
    */
  var shareUrl: js.UndefOr[ShareUrl] = js.native
  /**
    *  Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in the share URL. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.native
}

object ExportProjectResult {
  @scala.inline
  def apply(): ExportProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportProjectResult]
  }
  @scala.inline
  implicit class ExportProjectResultOps[Self <: ExportProjectResult] (val x: Self) extends AnyVal {
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
    def setDownloadUrl(value: DownloadUrl): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    @scala.inline
    def setShareUrl(value: ShareUrl): Self = this.set("shareUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareUrl: Self = this.set("shareUrl", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
  }
  
}

