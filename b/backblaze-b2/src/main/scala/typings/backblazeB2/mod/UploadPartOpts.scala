package typings.backblazeB2.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadPartOpts
  extends StObject
     with CommonArgs {
  
  var contentLength: js.UndefOr[Double] = js.undefined
  
  var data: Buffer
  
  var hash: js.UndefOr[String] = js.undefined
  
  var onUploadProgress: js.UndefOr[UploadProgressFn | Null] = js.undefined
  
  /**
    * part number: 1 to 10000
    */
  var partNumber: Double
  
  var uploadAuthToken: String
  
  var uploadUrl: String
}
object UploadPartOpts {
  
  @scala.inline
  def apply(data: Buffer, partNumber: Double, uploadAuthToken: String, uploadUrl: String): UploadPartOpts = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], uploadAuthToken = uploadAuthToken.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartOpts]
  }
  
  @scala.inline
  implicit class UploadPartOptsMutableBuilder[Self <: UploadPartOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadProgressNull: Self = StObject.set(x, "onUploadProgress", null)
    
    @scala.inline
    def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    @scala.inline
    def setPartNumber(value: Double): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadAuthToken(value: String): Self = StObject.set(x, "uploadAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
  }
}
