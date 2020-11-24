package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadDelta extends js.Object {
  
  /** Optional. The change in canResume, if any.  */
  var canResume: js.UndefOr[BooleanDelta] = js.native
  
  /** Optional. The change in danger, if any.  */
  var danger: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in endTime, if any.  */
  var endTime: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in error, if any.  */
  var error: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in exists, if any.  */
  var exists: js.UndefOr[BooleanDelta] = js.native
  
  /** Optional. The change in fileSize, if any.  */
  var fileSize: js.UndefOr[DoubleDelta] = js.native
  
  /** Optional. The change in filename, if any.  */
  var filename: js.UndefOr[StringDelta] = js.native
  
  /**
    * Optional. The change in finalUrl, if any.
    * @since Since Chrome 54.
    */
  var finalUrl: StringDelta = js.native
  
  /** The id of the DownloadItem that changed. */
  var id: Double = js.native
  
  /** Optional. The change in mime, if any.  */
  var mime: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in paused, if any.  */
  var paused: js.UndefOr[BooleanDelta] = js.native
  
  /** Optional. The change in startTime, if any.  */
  var startTime: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in state, if any.  */
  var state: js.UndefOr[StringDelta] = js.native
  
  /** Optional. The change in totalBytes, if any.  */
  var totalBytes: js.UndefOr[DoubleDelta] = js.native
  
  /** Optional. The change in url, if any.  */
  var url: js.UndefOr[StringDelta] = js.native
}
object DownloadDelta {
  
  @scala.inline
  def apply(finalUrl: StringDelta, id: Double): DownloadDelta = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDelta]
  }
  
  @scala.inline
  implicit class DownloadDeltaOps[Self <: DownloadDelta] (val x: Self) extends AnyVal {
    
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
    def setFinalUrl(value: StringDelta): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResume(value: BooleanDelta): Self = this.set("canResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanResume: Self = this.set("canResume", js.undefined)
    
    @scala.inline
    def setDanger(value: StringDelta): Self = this.set("danger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDanger: Self = this.set("danger", js.undefined)
    
    @scala.inline
    def setEndTime(value: StringDelta): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setError(value: StringDelta): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExists(value: BooleanDelta): Self = this.set("exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    
    @scala.inline
    def setFileSize(value: DoubleDelta): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFilename(value: StringDelta): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMime(value: StringDelta): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setPaused(value: BooleanDelta): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setStartTime(value: StringDelta): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: StringDelta): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTotalBytes(value: DoubleDelta): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytes: Self = this.set("totalBytes", js.undefined)
    
    @scala.inline
    def setUrl(value: StringDelta): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
