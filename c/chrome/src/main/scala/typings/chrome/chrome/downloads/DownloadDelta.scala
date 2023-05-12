package typings.chrome.chrome.downloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadDelta extends StObject {
  
  /** Optional. The change in canResume, if any.  */
  var canResume: js.UndefOr[BooleanDelta] = js.undefined
  
  /** Optional. The change in danger, if any.  */
  var danger: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in endTime, if any.  */
  var endTime: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in error, if any.  */
  var error: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in exists, if any.  */
  var exists: js.UndefOr[BooleanDelta] = js.undefined
  
  /** Optional. The change in fileSize, if any.  */
  var fileSize: js.UndefOr[DoubleDelta] = js.undefined
  
  /** Optional. The change in filename, if any.  */
  var filename: js.UndefOr[StringDelta] = js.undefined
  
  /**
    * Optional. The change in finalUrl, if any.
    * @since Since Chrome 54.
    */
  var finalUrl: js.UndefOr[StringDelta] = js.undefined
  
  /** The id of the DownloadItem that changed. */
  var id: Double
  
  /** Optional. The change in mime, if any.  */
  var mime: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in paused, if any.  */
  var paused: js.UndefOr[BooleanDelta] = js.undefined
  
  /** Optional. The change in startTime, if any.  */
  var startTime: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in state, if any.  */
  var state: js.UndefOr[StringDelta] = js.undefined
  
  /** Optional. The change in totalBytes, if any.  */
  var totalBytes: js.UndefOr[DoubleDelta] = js.undefined
  
  /** Optional. The change in url, if any.  */
  var url: js.UndefOr[StringDelta] = js.undefined
}
object DownloadDelta {
  
  inline def apply(id: Double): DownloadDelta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadDelta] (val x: Self) extends AnyVal {
    
    inline def setCanResume(value: BooleanDelta): Self = StObject.set(x, "canResume", value.asInstanceOf[js.Any])
    
    inline def setCanResumeUndefined: Self = StObject.set(x, "canResume", js.undefined)
    
    inline def setDanger(value: StringDelta): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
    
    inline def setEndTime(value: StringDelta): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: StringDelta): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExists(value: BooleanDelta): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setFileSize(value: DoubleDelta): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFilename(value: StringDelta): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFinalUrl(value: StringDelta): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    inline def setFinalUrlUndefined: Self = StObject.set(x, "finalUrl", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMime(value: StringDelta): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setPaused(value: BooleanDelta): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setStartTime(value: StringDelta): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: StringDelta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTotalBytes(value: DoubleDelta): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
    
    inline def setUrl(value: StringDelta): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
