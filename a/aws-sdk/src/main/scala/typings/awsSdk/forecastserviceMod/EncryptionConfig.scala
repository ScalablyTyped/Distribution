package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key.
    */
  var KMSKeyArn: typings.awsSdk.forecastserviceMod.KMSKeyArn
  
  /**
    * The ARN of the IAM role that Amazon Forecast can assume to access the AWS KMS key. Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an InvalidInputException error.
    */
  var RoleArn: Arn
}
object EncryptionConfig {
  
  inline def apply(KMSKeyArn: KMSKeyArn, RoleArn: Arn): EncryptionConfig = {
    val __obj = js.Dynamic.literal(KMSKeyArn = KMSKeyArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
