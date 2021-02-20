package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudfrontMod {
  
  type AliasICPRecordals = js.Array[typings.awsSdk.cloudfrontMod.AliasICPRecordal]
  
  type AliasList = js.Array[java.lang.String]
  
  type AwsAccountNumberList = js.Array[java.lang.String]
  
  type CacheBehaviorList = js.Array[typings.awsSdk.cloudfrontMod.CacheBehavior]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.allExcept
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type CachePolicyCookieBehavior = typings.awsSdk.cloudfrontMod._CachePolicyCookieBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - java.lang.String
  */
  type CachePolicyHeaderBehavior = typings.awsSdk.cloudfrontMod._CachePolicyHeaderBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.allExcept
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type CachePolicyQueryStringBehavior = typings.awsSdk.cloudfrontMod._CachePolicyQueryStringBehavior | java.lang.String
  
  type CachePolicySummaryList = js.Array[typings.awsSdk.cloudfrontMod.CachePolicySummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.managed_
    - typings.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type CachePolicyType = typings.awsSdk.cloudfrontMod._CachePolicyType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.cloudfront_
    - typings.awsSdk.awsSdkStrings.iam_
    - typings.awsSdk.awsSdkStrings.acm
    - java.lang.String
  */
  type CertificateSource = typings.awsSdk.cloudfrontMod._CertificateSource | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudfrontMod.ClientApiVersions
  
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[typings.awsSdk.cloudfrontMod.CloudFrontOriginAccessIdentitySummary]
  
  type CommentType = java.lang.String
  
  type ContentTypeProfileList = js.Array[typings.awsSdk.cloudfrontMod.ContentTypeProfile]
  
  type CookieNameList = js.Array[java.lang.String]
  
  type CustomErrorResponseList = js.Array[typings.awsSdk.cloudfrontMod.CustomErrorResponse]
  
  type DistributionIdListSummary = js.Array[java.lang.String]
  
  type DistributionSummaryList = js.Array[typings.awsSdk.cloudfrontMod.DistributionSummary]
  
  type EncryptionEntityList = js.Array[typings.awsSdk.cloudfrontMod.EncryptionEntity]
  
  type EndPointList = js.Array[typings.awsSdk.cloudfrontMod.EndPoint]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`viewer-request`
    - typings.awsSdk.awsSdkStrings.`viewer-response`
    - typings.awsSdk.awsSdkStrings.`origin-request`
    - typings.awsSdk.awsSdkStrings.`origin-response`
    - java.lang.String
  */
  type EventType = typings.awsSdk.cloudfrontMod._EventType | java.lang.String
  
  type FieldLevelEncryptionProfileSummaryList = js.Array[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileSummary]
  
  type FieldLevelEncryptionSummaryList = js.Array[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionSummary]
  
  type FieldList = js.Array[java.lang.String]
  
  type FieldPatternList = js.Array[java.lang.String]
  
  type Format = typings.awsSdk.awsSdkStrings.URLEncoded | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.blacklist
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type GeoRestrictionType = typings.awsSdk.cloudfrontMod._GeoRestrictionType | java.lang.String
  
  type HeaderList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.http1Dot1
    - typings.awsSdk.awsSdkStrings.http2
    - java.lang.String
  */
  type HttpVersion = typings.awsSdk.cloudfrontMod._HttpVersion | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPROVED
    - typings.awsSdk.awsSdkStrings.SUSPENDED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ICPRecordalStatus = typings.awsSdk.cloudfrontMod._ICPRecordalStatus | java.lang.String
  
  type InvalidationSummaryList = js.Array[typings.awsSdk.cloudfrontMod.InvalidationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type ItemSelection = typings.awsSdk.cloudfrontMod._ItemSelection | java.lang.String
  
  type KGKeyPairIdsList = js.Array[typings.awsSdk.cloudfrontMod.KGKeyPairIds]
  
  type KeyGroupSummaryList = js.Array[typings.awsSdk.cloudfrontMod.KeyGroupSummary]
  
  type KeyPairIdList = js.Array[java.lang.String]
  
  type LambdaFunctionARN = java.lang.String
  
  type LambdaFunctionAssociationList = js.Array[typings.awsSdk.cloudfrontMod.LambdaFunctionAssociation]
  
  type LocationList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GET
    - typings.awsSdk.awsSdkStrings.HEAD
    - typings.awsSdk.awsSdkStrings.POST
    - typings.awsSdk.awsSdkStrings.PUT
    - typings.awsSdk.awsSdkStrings.PATCH
    - typings.awsSdk.awsSdkStrings.OPTIONS
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type Method = typings.awsSdk.cloudfrontMod._Method | java.lang.String
  
  type MethodsList = js.Array[typings.awsSdk.cloudfrontMod.Method]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSLv3
    - typings.awsSdk.awsSdkStrings.TLSv1
    - typings.awsSdk.awsSdkStrings.TLSv1_2016
    - typings.awsSdk.awsSdkStrings.TLSv1Dot1_2016
    - typings.awsSdk.awsSdkStrings.TLSv1Dot2_2018
    - typings.awsSdk.awsSdkStrings.TLSv1Dot2_2019
    - java.lang.String
  */
  type MinimumProtocolVersion = typings.awsSdk.cloudfrontMod._MinimumProtocolVersion | java.lang.String
  
  type OriginCustomHeadersList = js.Array[typings.awsSdk.cloudfrontMod.OriginCustomHeader]
  
  type OriginGroupList = js.Array[typings.awsSdk.cloudfrontMod.OriginGroup]
  
  type OriginGroupMemberList = js.Array[typings.awsSdk.cloudfrontMod.OriginGroupMember]
  
  type OriginList = js.Array[typings.awsSdk.cloudfrontMod.Origin]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`http-only`
    - typings.awsSdk.awsSdkStrings.`match-viewer`
    - typings.awsSdk.awsSdkStrings.`https-only`
    - java.lang.String
  */
  type OriginProtocolPolicy = typings.awsSdk.cloudfrontMod._OriginProtocolPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type OriginRequestPolicyCookieBehavior = typings.awsSdk.cloudfrontMod._OriginRequestPolicyCookieBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.allViewer
    - typings.awsSdk.awsSdkStrings.allViewerAndWhitelistCloudFront
    - java.lang.String
  */
  type OriginRequestPolicyHeaderBehavior = typings.awsSdk.cloudfrontMod._OriginRequestPolicyHeaderBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.whitelist
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type OriginRequestPolicyQueryStringBehavior = typings.awsSdk.cloudfrontMod._OriginRequestPolicyQueryStringBehavior | java.lang.String
  
  type OriginRequestPolicySummaryList = js.Array[typings.awsSdk.cloudfrontMod.OriginRequestPolicySummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.managed_
    - typings.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type OriginRequestPolicyType = typings.awsSdk.cloudfrontMod._OriginRequestPolicyType | java.lang.String
  
  type OriginShieldRegion = java.lang.String
  
  type PathList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PriceClass_100
    - typings.awsSdk.awsSdkStrings.PriceClass_200
    - typings.awsSdk.awsSdkStrings.PriceClass_All
    - java.lang.String
  */
  type PriceClass = typings.awsSdk.cloudfrontMod._PriceClass | java.lang.String
  
  type PublicKeyIdList = js.Array[java.lang.String]
  
  type PublicKeySummaryList = js.Array[typings.awsSdk.cloudfrontMod.PublicKeySummary]
  
  type QueryArgProfileList = js.Array[typings.awsSdk.cloudfrontMod.QueryArgProfile]
  
  type QueryStringCacheKeysList = js.Array[java.lang.String]
  
  type QueryStringNamesList = js.Array[java.lang.String]
  
  type RealtimeLogConfigList = js.Array[typings.awsSdk.cloudfrontMod.RealtimeLogConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type RealtimeMetricsSubscriptionStatus = typings.awsSdk.cloudfrontMod._RealtimeMetricsSubscriptionStatus | java.lang.String
  
  type ResourceARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`sni-only`
    - typings.awsSdk.awsSdkStrings.vip
    - typings.awsSdk.awsSdkStrings.`static-ip`
    - java.lang.String
  */
  type SSLSupportMethod = typings.awsSdk.cloudfrontMod._SSLSupportMethod | java.lang.String
  
  type SignerList = js.Array[typings.awsSdk.cloudfrontMod._Signer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSLv3
    - typings.awsSdk.awsSdkStrings.TLSv1
    - typings.awsSdk.awsSdkStrings.TLSv1Dot1
    - typings.awsSdk.awsSdkStrings.TLSv1Dot2
    - java.lang.String
  */
  type SslProtocol = typings.awsSdk.cloudfrontMod._SslProtocol | java.lang.String
  
  type SslProtocolsList = js.Array[typings.awsSdk.cloudfrontMod.SslProtocol]
  
  type StatusCodeList = js.Array[typings.awsSdk.cloudfrontMod.integer]
  
  type StreamingDistributionSummaryList = js.Array[typings.awsSdk.cloudfrontMod.StreamingDistributionSummary]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.cloudfrontMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.cloudfrontMod.Tag]
  
  type TagValue = java.lang.String
  
  type TrustedKeyGroupIdList = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`allow-all`
    - typings.awsSdk.awsSdkStrings.`https-only`
    - typings.awsSdk.awsSdkStrings.`redirect-to-https`
    - java.lang.String
  */
  type ViewerProtocolPolicy = typings.awsSdk.cloudfrontMod._ViewerProtocolPolicy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-05-12`
    - typings.awsSdk.awsSdkStrings.`2013-11-11`
    - typings.awsSdk.awsSdkStrings.`2014-05-31`
    - typings.awsSdk.awsSdkStrings.`2014-10-21`
    - typings.awsSdk.awsSdkStrings.`2014-11-06`
    - typings.awsSdk.awsSdkStrings.`2015-04-17`
    - typings.awsSdk.awsSdkStrings.`2015-07-27`
    - typings.awsSdk.awsSdkStrings.`2015-09-17`
    - typings.awsSdk.awsSdkStrings.`2016-01-13`
    - typings.awsSdk.awsSdkStrings.`2016-01-28`
    - typings.awsSdk.awsSdkStrings.`2016-08-01`
    - typings.awsSdk.awsSdkStrings.`2016-08-20`
    - typings.awsSdk.awsSdkStrings.`2016-09-07`
    - typings.awsSdk.awsSdkStrings.`2016-09-29`
    - typings.awsSdk.awsSdkStrings.`2016-11-25`
    - typings.awsSdk.awsSdkStrings.`2017-03-25`
    - typings.awsSdk.awsSdkStrings.`2017-10-30`
    - typings.awsSdk.awsSdkStrings.`2018-06-18`
    - typings.awsSdk.awsSdkStrings.`2018-11-05`
    - typings.awsSdk.awsSdkStrings.`2019-03-26`
    - typings.awsSdk.awsSdkStrings.`2020-05-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudfrontMod._apiVersion | java.lang.String
  
  type integer = scala.Double
  
  type long = scala.Double
  
  type timestamp = typings.std.Date
}
