package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /**
    * The S3 bucket where training output is placed.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.rekognitionMod.S3Bucket] = js.undefined
  
  /**
    * The prefix applied to the training output files. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.rekognitionMod.S3KeyPrefix] = js.undefined
}
object OutputConfig {
  
  @scala.inline
  def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigMutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
