package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Destination extends StObject {
  
  /**
    * The name of the bucket.
    */
  var bucketName: string = js.native
  
  /**
    * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store classification results in the bucket.
    */
  var keyPrefix: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
    */
  var kmsKeyArn: string = js.native
}
object S3Destination {
  
  @scala.inline
  def apply(bucketName: string, kmsKeyArn: string): S3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit class S3DestinationMutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: string): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefix(value: string): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: string): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
