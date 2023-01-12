package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxiosProgressEvent extends StObject {
  
  var bytes: Double
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var estimated: js.UndefOr[Double] = js.undefined
  
  var loaded: Double
  
  var progress: js.UndefOr[Double] = js.undefined
  
  var rate: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
  
  var upload: js.UndefOr[Boolean] = js.undefined
}
object AxiosProgressEvent {
  
  inline def apply(bytes: Double, loaded: Double): AxiosProgressEvent = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxiosProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setEstimated(value: Double): Self = StObject.set(x, "estimated", value.asInstanceOf[js.Any])
    
    inline def setEstimatedUndefined: Self = StObject.set(x, "estimated", js.undefined)
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
