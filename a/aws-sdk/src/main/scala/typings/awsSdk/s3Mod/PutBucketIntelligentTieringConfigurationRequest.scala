package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketIntelligentTieringConfigurationRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
    */
  var Bucket: BucketName
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId
  
  /**
    * Container for S3 Intelligent-Tiering configuration.
    */
  var IntelligentTieringConfiguration: typings.awsSdk.s3Mod.IntelligentTieringConfiguration
}
object PutBucketIntelligentTieringConfigurationRequest {
  
  @scala.inline
  def apply(
    Bucket: BucketName,
    Id: IntelligentTieringId,
    IntelligentTieringConfiguration: IntelligentTieringConfiguration
  ): PutBucketIntelligentTieringConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IntelligentTieringConfiguration = IntelligentTieringConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketIntelligentTieringConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketIntelligentTieringConfigurationRequestMutableBuilder[Self <: PutBucketIntelligentTieringConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IntelligentTieringId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntelligentTieringConfiguration(value: IntelligentTieringConfiguration): Self = StObject.set(x, "IntelligentTieringConfiguration", value.asInstanceOf[js.Any])
  }
}
