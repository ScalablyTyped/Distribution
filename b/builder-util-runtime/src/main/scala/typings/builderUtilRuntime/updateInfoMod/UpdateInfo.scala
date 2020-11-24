package typings.builderUtilRuntime.updateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInfo extends js.Object {
  
  val files: js.Array[UpdateFileInfo] = js.native
  
  /** @deprecated */
  val path: String = js.native
  
  /**
    * The release date.
    */
  var releaseDate: String = js.native
  
  /**
    * The release name.
    */
  var releaseName: js.UndefOr[String | Null] = js.native
  
  /**
    * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
    */
  var releaseNotes: js.UndefOr[String | js.Array[ReleaseNoteInfo] | Null] = js.native
  
  /** @deprecated */
  val sha512: String = js.native
  
  /**
    * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
    */
  val stagingPercentage: js.UndefOr[Double] = js.native
  
  /**
    * The version.
    */
  val version: String = js.native
}
object UpdateInfo {
  
  @scala.inline
  def apply(
    files: js.Array[UpdateFileInfo],
    path: String,
    releaseDate: String,
    sha512: String,
    version: String
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
  
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: UpdateFileInfo*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[UpdateFileInfo]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512(value: String): Self = this.set("sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseName(value: String): Self = this.set("releaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseName: Self = this.set("releaseName", js.undefined)
    
    @scala.inline
    def setReleaseNameNull: Self = this.set("releaseName", null)
    
    @scala.inline
    def setReleaseNotesVarargs(value: ReleaseNoteInfo*): Self = this.set("releaseNotes", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotes(value: String | js.Array[ReleaseNoteInfo]): Self = this.set("releaseNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseNotes: Self = this.set("releaseNotes", js.undefined)
    
    @scala.inline
    def setReleaseNotesNull: Self = this.set("releaseNotes", null)
    
    @scala.inline
    def setStagingPercentage(value: Double): Self = this.set("stagingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStagingPercentage: Self = this.set("stagingPercentage", js.undefined)
  }
}
