package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDownloadAuthorizationOpts
  extends StObject
     with CommonArgs {
  
  var b2ContentDisposition: js.UndefOr[String] = js.undefined
  
  var bucketId: String
  
  var fileNamePrefix: String
  
  /**
    * Authorization validity : 0 to 604800
    */
  var validDurationInSeconds: Double
}
object GetDownloadAuthorizationOpts {
  
  inline def apply(bucketId: String, fileNamePrefix: String, validDurationInSeconds: Double): GetDownloadAuthorizationOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], fileNamePrefix = fileNamePrefix.asInstanceOf[js.Any], validDurationInSeconds = validDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadAuthorizationOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDownloadAuthorizationOpts] (val x: Self) extends AnyVal {
    
    inline def setB2ContentDisposition(value: String): Self = StObject.set(x, "b2ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setB2ContentDispositionUndefined: Self = StObject.set(x, "b2ContentDisposition", js.undefined)
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setFileNamePrefix(value: String): Self = StObject.set(x, "fileNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setValidDurationInSeconds(value: Double): Self = StObject.set(x, "validDurationInSeconds", value.asInstanceOf[js.Any])
  }
}
