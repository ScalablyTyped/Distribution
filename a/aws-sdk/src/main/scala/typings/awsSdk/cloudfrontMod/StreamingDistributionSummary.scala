package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistributionSummary extends StObject {
  
  /**
    *  The ARN (Amazon Resource Name) for the streaming distribution. For example: arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5, where 123456789012 is your Amazon Web Services account ID.
    */
  var ARN: String
  
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution.
    */
  var Aliases: typings.awsSdk.cloudfrontMod.Aliases
  
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String
  
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String
  
  /**
    * Whether the distribution is enabled to accept end user requests for content.
    */
  var Enabled: Boolean
  
  /**
    * The identifier for the distribution, for example, EDFDVBD632BHDS5.
    */
  var Id: String
  
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typings.awsSdk.cloudfrontMod.PriceClass
  
  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  var S3Origin: typings.awsSdk.cloudfrontMod.S3Origin
  
  /**
    *  Indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated throughout the Amazon CloudFront system.
    */
  var Status: String
  
  /**
    * A complex type that specifies the Amazon Web Services accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items.If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var TrustedSigners: typings.awsSdk.cloudfrontMod.TrustedSigners
}
object StreamingDistributionSummary {
  
  inline def apply(
    ARN: String,
    Aliases: Aliases,
    Comment: String,
    DomainName: String,
    Enabled: Boolean,
    Id: String,
    LastModifiedTime: js.Date,
    PriceClass: PriceClass,
    S3Origin: S3Origin,
    Status: String,
    TrustedSigners: TrustedSigners
  ): StreamingDistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Aliases = Aliases.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], PriceClass = PriceClass.asInstanceOf[js.Any], S3Origin = S3Origin.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionSummary]
  }
  
  extension [Self <: StreamingDistributionSummary](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setPriceClass(value: PriceClass): Self = StObject.set(x, "PriceClass", value.asInstanceOf[js.Any])
    
    inline def setS3Origin(value: S3Origin): Self = StObject.set(x, "S3Origin", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTrustedSigners(value: TrustedSigners): Self = StObject.set(x, "TrustedSigners", value.asInstanceOf[js.Any])
  }
}
