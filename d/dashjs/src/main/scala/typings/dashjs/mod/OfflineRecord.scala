package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineRecord extends StObject {
  
  var id: String
  
  var originalUrl: String
  
  var progress: Double
  
  var status: String
  
  var url: String
}
object OfflineRecord {
  
  inline def apply(id: String, originalUrl: String, progress: Double, status: String, url: String): OfflineRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineRecord]
  }
  
  extension [Self <: OfflineRecord](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
