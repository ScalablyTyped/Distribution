package typings.backblazeB2.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOpts
  extends StObject
     with CommonArgs {
  
  /**
    * data length
    * @default  data.byteLength or data.length
    */
  var contentLength: js.UndefOr[Double] = js.undefined
  
  var data: Buffer
  
  var fileName: String
  
  /**
    * data hash
    * @default sha1(data)
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * info headers, prepended with X-Bz-Info- when sent,
    * throws error if more than 10 keys set.
    * valid characters should be a-z, A-Z and '-',
    * all other characters will cause an error to be thrown
    */
  var info: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * mime type
    * @default 'b2/x-auto'
    */
  var mime: js.UndefOr[String] = js.undefined
  
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  
  var uploadAuthToken: String
  
  var uploadUrl: String
}
object UploadFileOpts {
  
  inline def apply(data: Buffer, fileName: String, uploadAuthToken: String, uploadUrl: String): UploadFileOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFileOpts] (val x: Self) extends AnyVal {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInfo(value: Record[String, String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setOnUploadProgress(value: /* event */ Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressNull: Self = StObject.set(x, "onUploadProgress", null)
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setUploadAuthToken(value: String): Self = StObject.set(x, "uploadAuthToken", value.asInstanceOf[js.Any])
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
  }
}
