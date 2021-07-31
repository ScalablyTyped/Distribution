package typings.chromeApps.WebView

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data uploaded in a URL request.
  * @since Chrome 23.
  */
trait UploadData extends StObject {
  
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[ArrayBuffer] = js.undefined
  
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}
object UploadData {
  
  @scala.inline
  def apply(): UploadData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadData]
  }
  
  @scala.inline
  implicit class UploadDataMutableBuilder[Self <: UploadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: ArrayBuffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
