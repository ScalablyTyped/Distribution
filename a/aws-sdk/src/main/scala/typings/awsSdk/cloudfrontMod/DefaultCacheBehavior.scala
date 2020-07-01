package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultCacheBehavior extends js.Object {
  var AllowedMethods: js.UndefOr[typings.awsSdk.cloudfrontMod.AllowedMethods] = js.native
  /**
    * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
    */
  var Compress: js.UndefOr[Boolean] = js.native
  /**
    * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var DefaultTTL: js.UndefOr[long] = js.native
  /**
    * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for the default cache behavior.
    */
  var FieldLevelEncryptionId: js.UndefOr[String] = js.native
  /**
    * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
    */
  var ForwardedValues: typings.awsSdk.cloudfrontMod.ForwardedValues = js.native
  /**
    * A complex type that contains zero or more Lambda function associations for a cache behavior.
    */
  var LambdaFunctionAssociations: js.UndefOr[typings.awsSdk.cloudfrontMod.LambdaFunctionAssociations] = js.native
  /**
    * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var MaxTTL: js.UndefOr[long] = js.native
  /**
    * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
    */
  var MinTTL: long = js.native
  /**
    * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin that is associated with this cache behavior. If so, specify true; if not, specify false. If you specify true for SmoothStreaming, you can still distribute other content using this cache behavior if the content matches the value of PathPattern. 
    */
  var SmoothStreaming: js.UndefOr[Boolean] = js.native
  /**
    * The value of ID for the origin that you want CloudFront to route requests to when they use the default cache behavior.
    */
  var TargetOriginId: String = js.native
  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, see Serving Private Content with Signed URLs and Signed Cookies in the Amazon CloudFront Developer Guide. If you don’t want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it’s currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
    */
  var TrustedSigners: typings.awsSdk.cloudfrontMod.TrustedSigners = js.native
  /**
    * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.    https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).   For more information about requiring the HTTPS protocol, see Requiring HTTPS Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Managing Cache Expiration in the Amazon CloudFront Developer Guide. 
    */
  var ViewerProtocolPolicy: typings.awsSdk.cloudfrontMod.ViewerProtocolPolicy = js.native
}

object DefaultCacheBehavior {
  @scala.inline
  def apply(
    ForwardedValues: ForwardedValues,
    MinTTL: long,
    TargetOriginId: String,
    TrustedSigners: TrustedSigners,
    ViewerProtocolPolicy: ViewerProtocolPolicy,
    AllowedMethods: AllowedMethods = null,
    Compress: js.UndefOr[Boolean] = js.undefined,
    DefaultTTL: js.UndefOr[long] = js.undefined,
    FieldLevelEncryptionId: String = null,
    LambdaFunctionAssociations: LambdaFunctionAssociations = null,
    MaxTTL: js.UndefOr[long] = js.undefined,
    SmoothStreaming: js.UndefOr[Boolean] = js.undefined
  ): DefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(ForwardedValues = ForwardedValues.asInstanceOf[js.Any], MinTTL = MinTTL.asInstanceOf[js.Any], TargetOriginId = TargetOriginId.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any], ViewerProtocolPolicy = ViewerProtocolPolicy.asInstanceOf[js.Any])
    if (AllowedMethods != null) __obj.updateDynamic("AllowedMethods")(AllowedMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(Compress)) __obj.updateDynamic("Compress")(Compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultTTL)) __obj.updateDynamic("DefaultTTL")(DefaultTTL.get.asInstanceOf[js.Any])
    if (FieldLevelEncryptionId != null) __obj.updateDynamic("FieldLevelEncryptionId")(FieldLevelEncryptionId.asInstanceOf[js.Any])
    if (LambdaFunctionAssociations != null) __obj.updateDynamic("LambdaFunctionAssociations")(LambdaFunctionAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxTTL)) __obj.updateDynamic("MaxTTL")(MaxTTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SmoothStreaming)) __obj.updateDynamic("SmoothStreaming")(SmoothStreaming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCacheBehavior]
  }
}

