package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketIntelligentTieringConfigurationsRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
    */
  var Bucket: BucketName
  
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
}
object ListBucketIntelligentTieringConfigurationsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): ListBucketIntelligentTieringConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketIntelligentTieringConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListBucketIntelligentTieringConfigurationsRequestMutableBuilder[Self <: ListBucketIntelligentTieringConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
  }
}
