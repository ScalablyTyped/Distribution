package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationProperties extends StObject {
  
  /**
    * The ARN of the resource to publish to. To specify an S3 bucket folder use the following format: arn:aws:s3:::DOC-EXAMPLE-BUCKET/myFolder/ 
    */
  var DestinationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the KMS key to use for encryption.
    */
  var KmsKeyArn: js.UndefOr[String] = js.undefined
}
object DestinationProperties {
  
  inline def apply(): DestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationProperties]
  }
  
  extension [Self <: DestinationProperties](x: Self) {
    
    inline def setDestinationArn(value: String): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
