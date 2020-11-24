package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketIntelligentTieringConfigurationRequest extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId = js.native
  
  /**
    * Container for S3 Intelligent-Tiering configuration.
    */
  var IntelligentTieringConfiguration: typings.awsSdk.s3Mod.IntelligentTieringConfiguration = js.native
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
  implicit class PutBucketIntelligentTieringConfigurationRequestOps[Self <: PutBucketIntelligentTieringConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IntelligentTieringId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntelligentTieringConfiguration(value: IntelligentTieringConfiguration): Self = this.set("IntelligentTieringConfiguration", value.asInstanceOf[js.Any])
  }
}
