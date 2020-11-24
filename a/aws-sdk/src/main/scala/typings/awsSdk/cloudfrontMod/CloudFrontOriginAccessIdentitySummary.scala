package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFrontOriginAccessIdentitySummary extends js.Object {
  
  /**
    * The comment for this origin access identity, as originally specified when created.
    */
  var Comment: String = js.native
  
  /**
    * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
    */
  var Id: String = js.native
  
  /**
    * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access identity read permission to an object in Amazon S3.
    */
  var S3CanonicalUserId: String = js.native
}
object CloudFrontOriginAccessIdentitySummary {
  
  @scala.inline
  def apply(Comment: String, Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentitySummary = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], S3CanonicalUserId = S3CanonicalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentitySummary]
  }
  
  @scala.inline
  implicit class CloudFrontOriginAccessIdentitySummaryOps[Self <: CloudFrontOriginAccessIdentitySummary] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3CanonicalUserId(value: String): Self = this.set("S3CanonicalUserId", value.asInstanceOf[js.Any])
  }
}
