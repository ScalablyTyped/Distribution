package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data uploaded in a URL request.
  * @since Chrome 23.
  */
trait UploadData extends StObject {
  
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}
object UploadData {
  
  inline def apply(): UploadData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadData]
  }
  
  extension [Self <: UploadData](x: Self) {
    
    inline def setBytes(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
