package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobPresignedUrlConfig extends StObject {
  
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
  implicit class AwsJobPresignedUrlConfigMutableBuilder[Self <: AwsJobPresignedUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresInSec(value: ExpiresInSeconds): Self = StObject.set(x, "expiresInSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInSecUndefined: Self = StObject.set(x, "expiresInSec", js.undefined)
  }
}
