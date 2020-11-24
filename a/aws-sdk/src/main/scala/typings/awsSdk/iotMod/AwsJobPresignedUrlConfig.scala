package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobPresignedUrlConfig extends js.Object {
  
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds. Pre-signed URLs are generated when a request for the job document is received.
    */
  var expiresInSec: js.UndefOr[ExpiresInSeconds] = js.native
}
object AwsJobPresignedUrlConfig {
  
  @scala.inline
  def apply(): AwsJobPresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobPresignedUrlConfig]
  }
  
  @scala.inline
  implicit class AwsJobPresignedUrlConfigOps[Self <: AwsJobPresignedUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpiresInSec(value: ExpiresInSeconds): Self = this.set("expiresInSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresInSec: Self = this.set("expiresInSec", js.undefined)
  }
}
