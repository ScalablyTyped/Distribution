package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Config extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.forecastserviceMod.KMSKeyArn] = js.undefined
  
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
    */
  var Path: S3Path
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket or files. If you provide a value for the KMSKeyArn key, the role must allow access to the key. Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an InvalidInputException error.
    */
  var RoleArn: Arn
}
object S3Config {
  
  inline def apply(Path: S3Path, RoleArn: Arn): S3Config = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  
  extension [Self <: S3Config](x: Self) {
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    inline def setPath(value: S3Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
