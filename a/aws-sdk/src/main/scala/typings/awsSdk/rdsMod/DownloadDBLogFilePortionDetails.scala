package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadDBLogFilePortionDetails extends StObject {
  
  /**
    * Boolean value that if true, indicates there is more data to be downloaded.
    */
  var AdditionalDataPending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Entries from the specified log file.
    */
  var LogFileData: js.UndefOr[String] = js.undefined
  
  /**
    * A pagination token that can be used in a later DownloadDBLogFilePortion request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DownloadDBLogFilePortionDetails {
  
  @scala.inline
  def apply(): DownloadDBLogFilePortionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDBLogFilePortionDetails]
  }
  
  @scala.inline
  implicit class DownloadDBLogFilePortionDetailsMutableBuilder[Self <: DownloadDBLogFilePortionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDataPending(value: Boolean): Self = StObject.set(x, "AdditionalDataPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataPendingUndefined: Self = StObject.set(x, "AdditionalDataPending", js.undefined)
    
    @scala.inline
    def setLogFileData(value: String): Self = StObject.set(x, "LogFileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileDataUndefined: Self = StObject.set(x, "LogFileData", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
