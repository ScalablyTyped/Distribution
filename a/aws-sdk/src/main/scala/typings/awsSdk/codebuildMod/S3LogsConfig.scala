package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogsConfig extends StObject {
  
  /**
    *  Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    *  The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is my-bucket, and your path prefix is build-log, then acceptable formats are my-bucket/build-log or arn:aws:s3:::my-bucket/build-log. 
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the S3 build logs. Valid values are:    ENABLED: S3 build logs are enabled for this build project.    DISABLED: S3 build logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType
}
object S3LogsConfig {
  
  inline def apply(status: LogsConfigStatusType): S3LogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfig]
  }
  
  extension [Self <: S3LogsConfig](x: Self) {
    
    inline def setEncryptionDisabled(value: WrapperBoolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStatus(value: LogsConfigStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
