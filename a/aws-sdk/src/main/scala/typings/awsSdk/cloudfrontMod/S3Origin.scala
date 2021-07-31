package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Origin extends StObject {
  
  /**
    * The DNS name of the Amazon S3 origin. 
    */
  var DomainName: String
  
  /**
    * The CloudFront origin access identity to associate with the distribution. Use an origin access identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront. If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify an empty OriginAccessIdentity element. To delete the origin access identity from an existing distribution, update the distribution configuration and include an empty OriginAccessIdentity element. To replace the origin access identity, update the distribution configuration and specify the new origin access identity. For more information, see Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content in the  Amazon CloudFront Developer Guide.
    */
  var OriginAccessIdentity: String
}
object S3Origin {
  
  @scala.inline
  def apply(DomainName: String, OriginAccessIdentity: String): S3Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OriginAccessIdentity = OriginAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Origin]
  }
  
  @scala.inline
  implicit class S3OriginMutableBuilder[Self <: S3Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginAccessIdentity(value: String): Self = StObject.set(x, "OriginAccessIdentity", value.asInstanceOf[js.Any])
  }
}
