package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadDBLogFilePortionDetails extends js.Object {
  
  /**
    * Boolean value that if true, indicates there is more data to be downloaded.
    */
  var AdditionalDataPending: js.UndefOr[Boolean] = js.native
  
  /**
    * Entries from the specified log file.
    */
  var LogFileData: js.UndefOr[String] = js.native
  
  /**
    * A pagination token that can be used in a later DownloadDBLogFilePortion request.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DownloadDBLogFilePortionDetails {
  
  @scala.inline
  def apply(): DownloadDBLogFilePortionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
  }
  
  @scala.inline
  implicit class DownloadDBLogFilePortionDetailsOps[Self <: DownloadDBLogFilePortionDetails] (val x: Self) extends AnyVal {
    
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
    def setAdditionalDataPending(value: Boolean): Self = this.set("AdditionalDataPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalDataPending: Self = this.set("AdditionalDataPending", js.undefined)
    
    @scala.inline
    def setLogFileData(value: String): Self = this.set("LogFileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFileData: Self = this.set("LogFileData", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
