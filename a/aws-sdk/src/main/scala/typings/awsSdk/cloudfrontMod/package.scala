package typings.awsSdk.cloudfrontMod

import typings.awsSdk.awsSdkStrings.URLEncoded
import typings.awsSdk.awsSdkStrings.`cloudfront-js-1Dot0`
import typings.awsSdk.awsSdkStrings.s3_
import typings.awsSdk.awsSdkStrings.sigv4_
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlAllowHeadersList = js.Array[String]

type AccessControlAllowMethodsList = js.Array[ResponseHeadersPolicyAccessControlAllowMethodsValues]

type AccessControlAllowOriginsList = js.Array[String]

type AccessControlExposeHeadersList = js.Array[String]

type AliasICPRecordals = js.Array[AliasICPRecordal]

type AliasList = js.Array[String]

type AwsAccountNumberList = js.Array[String]

type CacheBehaviorList = js.Array[CacheBehavior]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.allExcept
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type CachePolicyCookieBehavior = _CachePolicyCookieBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - java.lang.String
*/
type CachePolicyHeaderBehavior = _CachePolicyHeaderBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.allExcept
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type CachePolicyQueryStringBehavior = _CachePolicyQueryStringBehavior | String

type CachePolicySummaryList = js.Array[CachePolicySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.managed_
  - typings.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type CachePolicyType = _CachePolicyType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.cloudfront_
  - typings.awsSdk.awsSdkStrings.iam_
  - typings.awsSdk.awsSdkStrings.acm
  - java.lang.String
*/
type CertificateSource = _CertificateSource | String

type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]

type CommentType = String

type ConflictingAliases = js.Array[ConflictingAlias]

type ContentTypeProfileList = js.Array[ContentTypeProfile]

type CookieNameList = js.Array[String]

type CustomErrorResponseList = js.Array[CustomErrorResponse]

type DistributionIdListSummary = js.Array[String]

type DistributionSummaryList = js.Array[DistributionSummary]

type EncryptionEntityList = js.Array[EncryptionEntity]

type EndPointList = js.Array[EndPoint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`viewer-request`
  - typings.awsSdk.awsSdkStrings.`viewer-response`
  - typings.awsSdk.awsSdkStrings.`origin-request`
  - typings.awsSdk.awsSdkStrings.`origin-response`
  - java.lang.String
*/
type EventType = _EventType | String

type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]

type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]

type FieldList = js.Array[String]

type FieldPatternList = js.Array[String]

type Format = URLEncoded | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DENY
  - typings.awsSdk.awsSdkStrings.SAMEORIGIN
  - java.lang.String
*/
type FrameOptionsList = _FrameOptionsList | String

type FunctionARN = String

type FunctionAssociationList = js.Array[FunctionAssociation]

type FunctionBlob = Buffer | js.typedarray.Uint8Array | Blob | String

type FunctionEventObject = Buffer | js.typedarray.Uint8Array | Blob | String

type FunctionExecutionLogList = js.Array[String]

type FunctionName = String

type FunctionRuntime = `cloudfront-js-1Dot0` | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVELOPMENT
  - typings.awsSdk.awsSdkStrings.LIVE
  - java.lang.String
*/
type FunctionStage = _FunctionStage | String

type FunctionSummaryList = js.Array[FunctionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.blacklist
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type GeoRestrictionType = _GeoRestrictionType | String

type HeaderList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.http1Dot1
  - typings.awsSdk.awsSdkStrings.http2
  - typings.awsSdk.awsSdkStrings.http3
  - typings.awsSdk.awsSdkStrings.http2and3
  - java.lang.String
*/
type HttpVersion = _HttpVersion | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type ICPRecordalStatus = _ICPRecordalStatus | String

type InvalidationSummaryList = js.Array[InvalidationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type ItemSelection = _ItemSelection | String

type KGKeyPairIdsList = js.Array[KGKeyPairIds]

type KeyGroupSummaryList = js.Array[KeyGroupSummary]

type KeyPairIdList = js.Array[String]

type LambdaFunctionARN = String

type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]

type LocationList = js.Array[String]

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
type Method = _Method | String

type MethodsList = js.Array[Method]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSLv3
  - typings.awsSdk.awsSdkStrings.TLSv1
  - typings.awsSdk.awsSdkStrings.TLSv1_2016
  - typings.awsSdk.awsSdkStrings.TLSv1Dot1_2016
  - typings.awsSdk.awsSdkStrings.TLSv1Dot2_2018
  - typings.awsSdk.awsSdkStrings.TLSv1Dot2_2019
  - typings.awsSdk.awsSdkStrings.TLSv1Dot2_2021
  - java.lang.String
*/
type MinimumProtocolVersion = _MinimumProtocolVersion | String

type OriginAccessControlOriginTypes = s3_ | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.never__
  - typings.awsSdk.awsSdkStrings.always__
  - typings.awsSdk.awsSdkStrings.`no-override`
  - java.lang.String
*/
type OriginAccessControlSigningBehaviors = _OriginAccessControlSigningBehaviors | String

type OriginAccessControlSigningProtocols = sigv4_ | String

type OriginAccessControlSummaryList = js.Array[OriginAccessControlSummary]

type OriginCustomHeadersList = js.Array[OriginCustomHeader]

type OriginGroupList = js.Array[OriginGroup]

type OriginGroupMemberList = js.Array[OriginGroupMember]

type OriginList = js.Array[Origin]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`http-only`
  - typings.awsSdk.awsSdkStrings.`match-viewer`
  - typings.awsSdk.awsSdkStrings.`https-only`
  - java.lang.String
*/
type OriginProtocolPolicy = _OriginProtocolPolicy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type OriginRequestPolicyCookieBehavior = _OriginRequestPolicyCookieBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.allViewer
  - typings.awsSdk.awsSdkStrings.allViewerAndWhitelistCloudFront
  - java.lang.String
*/
type OriginRequestPolicyHeaderBehavior = _OriginRequestPolicyHeaderBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.whitelist
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type OriginRequestPolicyQueryStringBehavior = _OriginRequestPolicyQueryStringBehavior | String

type OriginRequestPolicySummaryList = js.Array[OriginRequestPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.managed_
  - typings.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type OriginRequestPolicyType = _OriginRequestPolicyType | String

type OriginShieldRegion = String

type PathList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PriceClass_100
  - typings.awsSdk.awsSdkStrings.PriceClass_200
  - typings.awsSdk.awsSdkStrings.PriceClass_All
  - java.lang.String
*/
type PriceClass = _PriceClass | String

type PublicKeyIdList = js.Array[String]

type PublicKeySummaryList = js.Array[PublicKeySummary]

type QueryArgProfileList = js.Array[QueryArgProfile]

type QueryStringCacheKeysList = js.Array[String]

type QueryStringNamesList = js.Array[String]

type RealtimeLogConfigList = js.Array[RealtimeLogConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type RealtimeMetricsSubscriptionStatus = _RealtimeMetricsSubscriptionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`no-referrer`
  - typings.awsSdk.awsSdkStrings.`no-referrer-when-downgrade`
  - typings.awsSdk.awsSdkStrings.origin__
  - typings.awsSdk.awsSdkStrings.`origin-when-cross-origin`
  - typings.awsSdk.awsSdkStrings.`same-origin`
  - typings.awsSdk.awsSdkStrings.`strict-origin`
  - typings.awsSdk.awsSdkStrings.`strict-origin-when-cross-origin`
  - typings.awsSdk.awsSdkStrings.`unsafe-url`
  - java.lang.String
*/
type ReferrerPolicyList = _ReferrerPolicyList | String

type ResourceARN = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.POST
  - typings.awsSdk.awsSdkStrings.OPTIONS
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.PATCH
  - typings.awsSdk.awsSdkStrings.HEAD
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResponseHeadersPolicyAccessControlAllowMethodsValues = _ResponseHeadersPolicyAccessControlAllowMethodsValues | String

type ResponseHeadersPolicyCustomHeaderList = js.Array[ResponseHeadersPolicyCustomHeader]

type ResponseHeadersPolicySummaryList = js.Array[ResponseHeadersPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.managed_
  - typings.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type ResponseHeadersPolicyType = _ResponseHeadersPolicyType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`sni-only`
  - typings.awsSdk.awsSdkStrings.vip
  - typings.awsSdk.awsSdkStrings.`static-ip`
  - java.lang.String
*/
type SSLSupportMethod = _SSLSupportMethod | String

type SamplingRate = Double

type SignerList = js.Array[_Signer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSLv3
  - typings.awsSdk.awsSdkStrings.TLSv1
  - typings.awsSdk.awsSdkStrings.TLSv1Dot1
  - typings.awsSdk.awsSdkStrings.TLSv1Dot2
  - java.lang.String
*/
type SslProtocol = _SslProtocol | String

type SslProtocolsList = js.Array[SslProtocol]

type StatusCodeList = js.Array[integer]

type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TrustedKeyGroupIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`allow-all`
  - typings.awsSdk.awsSdkStrings.`https-only`
  - typings.awsSdk.awsSdkStrings.`redirect-to-https`
  - java.lang.String
*/
type ViewerProtocolPolicy = _ViewerProtocolPolicy | String

type aliasString = String

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
type apiVersion = _apiVersion | String

type distributionIdString = String

type integer = Double

type listConflictingAliasesMaxItemsInteger = Double

type long = Double

type sensitiveStringType = String

type timestamp = js.Date
