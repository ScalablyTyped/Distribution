package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFrontOriginAccessIdentityConfig extends StObject {
  
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the CloudFrontOriginAccessIdentityConfig object), a new origin access identity is created. If the CallerReference is a value already sent in a previous identity request, and the content of the CloudFrontOriginAccessIdentityConfig is identical to the original request (ignoring white space), the response includes the same information returned to the original request.  If the CallerReference is a value you already sent in a previous request to create an identity, but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error. 
    */
  var CallerReference: String = js.native
  
  /**
    * Any comments you want to include about the origin access identity. 
    */
  var Comment: String = js.native
}
object CloudFrontOriginAccessIdentityConfig {
  
  @scala.inline
  def apply(CallerReference: String, Comment: String): CloudFrontOriginAccessIdentityConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentityConfig]
  }
  
  @scala.inline
  implicit class CloudFrontOriginAccessIdentityConfigMutableBuilder[Self <: CloudFrontOriginAccessIdentityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
  }
}
