package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionSummary extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your Amazon Web Services account ID.
    */
  var ARN: String
  
  /**
    * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with Amazon Web Services services in China.
    */
  var AliasICPRecordals: js.UndefOr[typings.awsSdk.cloudfrontMod.AliasICPRecordals] = js.undefined
  
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: typings.awsSdk.cloudfrontMod.Aliases
  
  /**
    * A complex type that contains zero or more CacheBehavior elements.
    */
  var CacheBehaviors: typings.awsSdk.cloudfrontMod.CacheBehaviors
  
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String
  
  /**
    * A complex type that contains zero or more CustomErrorResponses elements.
    */
  var CustomErrorResponses: typings.awsSdk.cloudfrontMod.CustomErrorResponses
  
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: typings.awsSdk.cloudfrontMod.DefaultCacheBehavior
  
  /**
    * The domain name that corresponds to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String
  
  /**
    * Whether the distribution is enabled to accept user requests for content.
    */
  var Enabled: Boolean
  
  /**
    *  Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 will automatically use an earlier version.
    */
  var HttpVersion: typings.awsSdk.cloudfrontMod.HttpVersion
  
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5.
    */
  var Id: String
  
  /**
    * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
    */
  var IsIPV6Enabled: Boolean
  
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginGroups] = js.undefined
  
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: typings.awsSdk.cloudfrontMod.Origins
  
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typings.awsSdk.cloudfrontMod.PriceClass
  
  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  var Restrictions: typings.awsSdk.cloudfrontMod.Restrictions
  
  /**
    * The current status of the distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String
  
  /**
    * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
    */
  var ViewerCertificate: typings.awsSdk.cloudfrontMod.ViewerCertificate
  
  /**
    * The Web ACL Id (if any) associated with the distribution.
    */
  var WebACLId: String
}
object DistributionSummary {
  
  inline def apply(
    ARN: String,
    Aliases: Aliases,
    CacheBehaviors: CacheBehaviors,
    Comment: String,
    CustomErrorResponses: CustomErrorResponses,
    DefaultCacheBehavior: DefaultCacheBehavior,
    DomainName: String,
    Enabled: Boolean,
    HttpVersion: HttpVersion,
    Id: String,
    IsIPV6Enabled: Boolean,
    LastModifiedTime: js.Date,
    Origins: Origins,
    PriceClass: PriceClass,
    Restrictions: Restrictions,
    Status: String,
    ViewerCertificate: ViewerCertificate,
    WebACLId: String
  ): DistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Aliases = Aliases.asInstanceOf[js.Any], CacheBehaviors = CacheBehaviors.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], CustomErrorResponses = CustomErrorResponses.asInstanceOf[js.Any], DefaultCacheBehavior = DefaultCacheBehavior.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], HttpVersion = HttpVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsIPV6Enabled = IsIPV6Enabled.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Origins = Origins.asInstanceOf[js.Any], PriceClass = PriceClass.asInstanceOf[js.Any], Restrictions = Restrictions.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], ViewerCertificate = ViewerCertificate.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionSummary]
  }
  
  extension [Self <: DistributionSummary](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setAliasICPRecordals(value: AliasICPRecordals): Self = StObject.set(x, "AliasICPRecordals", value.asInstanceOf[js.Any])
    
    inline def setAliasICPRecordalsUndefined: Self = StObject.set(x, "AliasICPRecordals", js.undefined)
    
    inline def setAliasICPRecordalsVarargs(value: AliasICPRecordal*): Self = StObject.set(x, "AliasICPRecordals", js.Array(value*))
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setCacheBehaviors(value: CacheBehaviors): Self = StObject.set(x, "CacheBehaviors", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCustomErrorResponses(value: CustomErrorResponses): Self = StObject.set(x, "CustomErrorResponses", value.asInstanceOf[js.Any])
    
    inline def setDefaultCacheBehavior(value: DefaultCacheBehavior): Self = StObject.set(x, "DefaultCacheBehavior", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setHttpVersion(value: HttpVersion): Self = StObject.set(x, "HttpVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsIPV6Enabled(value: Boolean): Self = StObject.set(x, "IsIPV6Enabled", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setOriginGroups(value: OriginGroups): Self = StObject.set(x, "OriginGroups", value.asInstanceOf[js.Any])
    
    inline def setOriginGroupsUndefined: Self = StObject.set(x, "OriginGroups", js.undefined)
    
    inline def setOrigins(value: Origins): Self = StObject.set(x, "Origins", value.asInstanceOf[js.Any])
    
    inline def setPriceClass(value: PriceClass): Self = StObject.set(x, "PriceClass", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: Restrictions): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setViewerCertificate(value: ViewerCertificate): Self = StObject.set(x, "ViewerCertificate", value.asInstanceOf[js.Any])
    
    inline def setWebACLId(value: String): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
