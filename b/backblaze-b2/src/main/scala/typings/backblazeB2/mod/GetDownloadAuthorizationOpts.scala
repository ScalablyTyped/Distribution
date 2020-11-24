package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDownloadAuthorizationOpts extends CommonArgs {
  
  var b2ContentDisposition: String = js.native
  
  var bucketId: String = js.native
  
  var fileNamePrefix: String = js.native
  
  /**
    * Authorization validity : 0 to 604800
    */
  var validDurationInSeconds: Double = js.native
}
object GetDownloadAuthorizationOpts {
  
  @scala.inline
  def apply(
    b2ContentDisposition: String,
    bucketId: String,
    fileNamePrefix: String,
    validDurationInSeconds: Double
  ): GetDownloadAuthorizationOpts = {
    val __obj = js.Dynamic.literal(b2ContentDisposition = b2ContentDisposition.asInstanceOf[js.Any], bucketId = bucketId.asInstanceOf[js.Any], fileNamePrefix = fileNamePrefix.asInstanceOf[js.Any], validDurationInSeconds = validDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDownloadAuthorizationOpts]
  }
  
  @scala.inline
  implicit class GetDownloadAuthorizationOptsOps[Self <: GetDownloadAuthorizationOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setB2ContentDisposition(value: String): Self = this.set("b2ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamePrefix(value: String): Self = this.set("fileNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidDurationInSeconds(value: Double): Self = this.set("validDurationInSeconds", value.asInstanceOf[js.Any])
  }
}
