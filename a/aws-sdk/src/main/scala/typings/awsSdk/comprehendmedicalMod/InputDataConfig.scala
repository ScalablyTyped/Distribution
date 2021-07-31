package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint that you are calling. Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
    */
  var S3Bucket: typings.awsSdk.comprehendmedicalMod.S3Bucket
  
  /**
    * The path to the input data files in the S3 bucket.
    */
  var S3Key: js.UndefOr[typings.awsSdk.comprehendmedicalMod.S3Key] = js.undefined
}
object InputDataConfig {
  
  @scala.inline
  def apply(S3Bucket: S3Bucket): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit class InputDataConfigMutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
