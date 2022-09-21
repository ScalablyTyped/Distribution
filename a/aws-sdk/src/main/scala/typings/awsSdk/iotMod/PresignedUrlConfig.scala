package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresignedUrlConfig extends StObject {
  
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
    */
  var expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined
  
  /**
    * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.  For information about addressing the confused deputy problem, see cross-service confused deputy prevention in the Amazon Web Services IoT Core developer guide. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object PresignedUrlConfig {
  
  inline def apply(): PresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresignedUrlConfig]
  }
  
  extension [Self <: PresignedUrlConfig](x: Self) {
    
    inline def setExpiresInSec(value: ExpiresInSec): Self = StObject.set(x, "expiresInSec", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSecUndefined: Self = StObject.set(x, "expiresInSec", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
