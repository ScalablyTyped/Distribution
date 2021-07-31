package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFrontOriginAccessIdentitySummary extends StObject {
  
  /**
    * The comment for this origin access identity, as originally specified when created.
    */
  var Comment: String
  
  /**
    * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
    */
  var Id: String
  
  /**
    * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access identity read permission to an object in Amazon S3.
    */
  var S3CanonicalUserId: String
}
object CloudFrontOriginAccessIdentitySummary {
  
  @scala.inline
  def apply(Comment: String, Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentitySummary = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], S3CanonicalUserId = S3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentitySummary]
  }
  
  @scala.inline
  implicit class CloudFrontOriginAccessIdentitySummaryMutableBuilder[Self <: CloudFrontOriginAccessIdentitySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3CanonicalUserId(value: String): Self = StObject.set(x, "S3CanonicalUserId", value.asInstanceOf[js.Any])
  }
}
