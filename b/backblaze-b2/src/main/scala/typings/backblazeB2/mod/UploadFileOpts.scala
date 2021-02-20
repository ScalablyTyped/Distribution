package typings.backblazeB2.mod

import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOpts extends CommonArgs {
  
  /**
    * data length
    * @default  data.byteLength or data.length
    */
  var contentLength: js.UndefOr[Double] = js.native
  
  var data: Buffer = js.native
  
  var fileName: String = js.native
  
  /**
    * data hash
    * @default sha1(data)
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * info headers, prepended with X-Bz-Info- when sent,
    * throws error if more than 10 keys set.
    * valid characters should be a-z, A-Z and '-',
    * all other characters will cause an error to be thrown
    */
  var info: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * mime type
    * @default 'b2/x-auto'
    */
  var mime: js.UndefOr[String] = js.native
  
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.native
  
  var uploadAuthToken: String = js.native
  
  var uploadUrl: String = js.native
}
object UploadFileOpts {
  
  @scala.inline
  def apply(data: Buffer, fileName: String, uploadAuthToken: String, uploadUrl: String): UploadFileOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOpts]
  }
  
  @scala.inline
  implicit class UploadFileOptsMutableBuilder[Self <: UploadFileOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setInfo(value: Record[String, String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadProgressNull: Self = StObject.set(x, "onUploadProgress", null)
    
    @scala.inline
    def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    @scala.inline
    def setUploadAuthToken(value: String): Self = StObject.set(x, "uploadAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
  }
}
