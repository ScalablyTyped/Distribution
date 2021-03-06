package typings.backblazeB2.mod

import typings.backblazeB2.backblazeB2Strings.arraybuffer
import typings.backblazeB2.backblazeB2Strings.blob
import typings.backblazeB2.backblazeB2Strings.document
import typings.backblazeB2.backblazeB2Strings.json
import typings.backblazeB2.backblazeB2Strings.stream
import typings.backblazeB2.backblazeB2Strings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownlaodFileByNameOpts extends DownloadFileOpts {
  
  var bucketName: String = js.native
  
  var fileName: String = js.native
}
object DownlaodFileByNameOpts {
  
  @scala.inline
  def apply(
    bucketName: String,
    fileName: String,
    responseType: arraybuffer | blob | document | json | text | stream
  ): DownlaodFileByNameOpts = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownlaodFileByNameOpts]
  }
  
  @scala.inline
  implicit class DownlaodFileByNameOptsMutableBuilder[Self <: DownlaodFileByNameOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
