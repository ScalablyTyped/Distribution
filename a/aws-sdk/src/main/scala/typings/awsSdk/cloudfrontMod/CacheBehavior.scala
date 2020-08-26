package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheBehavior extends js.Object {
  var AllowedMethods: js.UndefOr[typings.awsSdk.cloudfrontMod.AllowedMethods] = js.native
  /**
    * The unique identifier of the cache policy that is attached to this cache behavior. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide.
    */
  var CachePolicyId: js.UndefOr[String] = js.native
  /**
    * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
    */
  var Compress: js.UndefOr[Boolean] = js.native
  /**
    * This field is deprecated. We recommend that you use the DefaultTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var DefaultTTL: js.UndefOr[long] = js.native
  /**
    * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for this cache behavior.
    */
  var FieldLevelEncryptionId: js.UndefOr[String] = js.native
  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field. For more information, see Working with policies in the Amazon CloudFront Developer Guide. If you want to include values in the cache key, use a cache policy. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. If you want to send values to the origin but not include them in the cache key, use an origin request policy. For more information, see Creating origin request policies or Using the managed origin request policies in the Amazon CloudFront Developer Guide. A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
    */
  var ForwardedValues: js.UndefOr[typings.awsSdk.cloudfrontMod.ForwardedValues] = js.native
  /**
    * A complex type that contains zero or more Lambda function associations for a cache behavior.
    */
  var LambdaFunctionAssociations: js.UndefOr[typings.awsSdk.cloudfrontMod.LambdaFunctionAssociations] = js.native
  /**
    * This field is deprecated. We recommend that you use the MaxTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var MaxTTL: js.UndefOr[long] = js.native
  /**
    * This field is deprecated. We recommend that you use the MinTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see  Managing How Long Content Stays in an Edge Cache (Expiration) in the  Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
    */
  var MinTTL: js.UndefOr[long] = js.native
  /**
    * The unique identifier of the origin request policy that is attached to this cache behavior. For more information, see Creating origin request policies or Using the managed origin request policies in the Amazon CloudFront Developer Guide.
    */
  var OriginRequestPolicyId: js.UndefOr[String] = js.native
  /**
    * The pattern (for example, images/ *.jpg) that specifies which requests to apply the behavior to. When CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which cache behaviors are listed in the distribution.  You can optionally include a slash (/) at the beginning of the path pattern. For example, /images/ *.jpg. CloudFront behavior is the same with or without the leading /.  The path pattern for the default cache behavior is * and cannot be changed. If the request for an object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default cache behavior. For more information, see Path Pattern in the  Amazon CloudFront Developer Guide.
    */
  var PathPattern: String = js.native
  /**
    * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin that is associated with this cache behavior. If so, specify true; if not, specify false. If you specify true for SmoothStreaming, you can still distribute other content using this cache behavior if the content matches the value of PathPattern. 
    */
  var SmoothStreaming: js.UndefOr[Boolean] = js.native
  /**
    * The value of ID for the origin that you want CloudFront to route requests to when they match this cache behavior.
    */
  var TargetOriginId: String = js.native
  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, see Serving Private Content with Signed URLs and Signed Cookies in the Amazon CloudFront Developer Guide.  If you don’t want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it’s currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
    */
  var TrustedSigners: typings.awsSdk.cloudfrontMod.TrustedSigners = js.native
  /**
    * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.     https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).    For more information about requiring the HTTPS protocol, see Requiring HTTPS Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Managing Cache Expiration in the Amazon CloudFront Developer Guide. 
    */
  var ViewerProtocolPolicy: typings.awsSdk.cloudfrontMod.ViewerProtocolPolicy = js.native
}

object CacheBehavior {
  @scala.inline
  def apply(
    PathPattern: String,
    TargetOriginId: String,
    TrustedSigners: TrustedSigners,
    ViewerProtocolPolicy: ViewerProtocolPolicy
  ): CacheBehavior = {
    val __obj = js.Dynamic.literal(PathPattern = PathPattern.asInstanceOf[js.Any], TargetOriginId = TargetOriginId.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any], ViewerProtocolPolicy = ViewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheBehavior]
  }
  @scala.inline
  implicit class CacheBehaviorOps[Self <: CacheBehavior] (val x: Self) extends AnyVal {
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
    def setPathPattern(value: String): Self = this.set("PathPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOriginId(value: String): Self = this.set("TargetOriginId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrustedSigners(value: TrustedSigners): Self = this.set("TrustedSigners", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewerProtocolPolicy(value: ViewerProtocolPolicy): Self = this.set("ViewerProtocolPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedMethods(value: AllowedMethods): Self = this.set("AllowedMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedMethods: Self = this.set("AllowedMethods", js.undefined)
    @scala.inline
    def setCachePolicyId(value: String): Self = this.set("CachePolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePolicyId: Self = this.set("CachePolicyId", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("Compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("Compress", js.undefined)
    @scala.inline
    def setDefaultTTL(value: long): Self = this.set("DefaultTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTTL: Self = this.set("DefaultTTL", js.undefined)
    @scala.inline
    def setFieldLevelEncryptionId(value: String): Self = this.set("FieldLevelEncryptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryptionId: Self = this.set("FieldLevelEncryptionId", js.undefined)
    @scala.inline
    def setForwardedValues(value: ForwardedValues): Self = this.set("ForwardedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedValues: Self = this.set("ForwardedValues", js.undefined)
    @scala.inline
    def setLambdaFunctionAssociations(value: LambdaFunctionAssociations): Self = this.set("LambdaFunctionAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionAssociations: Self = this.set("LambdaFunctionAssociations", js.undefined)
    @scala.inline
    def setMaxTTL(value: long): Self = this.set("MaxTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTTL: Self = this.set("MaxTTL", js.undefined)
    @scala.inline
    def setMinTTL(value: long): Self = this.set("MinTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTTL: Self = this.set("MinTTL", js.undefined)
    @scala.inline
    def setOriginRequestPolicyId(value: String): Self = this.set("OriginRequestPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginRequestPolicyId: Self = this.set("OriginRequestPolicyId", js.undefined)
    @scala.inline
    def setSmoothStreaming(value: Boolean): Self = this.set("SmoothStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothStreaming: Self = this.set("SmoothStreaming", js.undefined)
  }
  
}

