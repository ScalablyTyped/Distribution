package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerCertificate extends js.Object {
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs) and the SSL/TLS certificate is stored in AWS Certificate Manager (ACM), provide the Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates in the US East (N. Virginia) Region (us-east-1). If you specify an ACM certificate ARN, you must also specify values for MinimumProtocolVerison and SSLSupportMethod. 
    */
  var ACMCertificateArn: js.UndefOr[String] = js.native
  /**
    * This field is deprecated. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var Certificate: js.UndefOr[String] = js.native
  /**
    * This field is deprecated. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var CertificateSource: js.UndefOr[typings.awsSdk.cloudfrontMod.CertificateSource] = js.native
  /**
    * If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net, set this field to true. If the distribution uses Aliases (alternate domain names or CNAMEs), set this field to false and specify values for the following fields:    ACMCertificateArn or IAMCertificateId (specify a value for one, not both)    MinimumProtocolVersion     SSLSupportMethod   
    */
  var CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.native
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs) and the SSL/TLS certificate is stored in AWS Identity and Access Management (AWS IAM), provide the ID of the IAM certificate. If you specify an IAM certificate ID, you must also specify values for MinimumProtocolVerison and SSLSupportMethod. 
    */
  var IAMCertificateId: js.UndefOr[String] = js.native
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections with viewers. The security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.   The ciphers that CloudFront can use to encrypt the content that it returns to viewers.   For more information, see Security Policy and Supported Protocols and Ciphers Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  On the CloudFront console, this setting is called Security Policy.  We recommend that you specify TLSv1.2_2018 unless your viewers are using browsers or devices that don’t support TLSv1.2. When you’re using SNI only (you set SSLSupportMethod to sni-only), you must specify TLSv1 or higher.  If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net (you set CloudFrontDefaultCertificate to true), CloudFront automatically sets the security policy to TLSv1 regardless of the value that you set here.
    */
  var MinimumProtocolVersion: js.UndefOr[typings.awsSdk.cloudfrontMod.MinimumProtocolVersion] = js.native
  /**
    * If the distribution uses Aliases (alternate domain names or CNAMEs), specify which viewers the distribution accepts HTTPS connections from.    sni-only – The distribution accepts HTTPS connections from only viewers that support server name indication (SNI). This is recommended. Most browsers and clients released after 2010 support SNI.    vip – The distribution accepts HTTPS connections from all viewers including those that don’t support SNI. This is not recommended, and results in additional monthly charges from CloudFront.   If the distribution uses the CloudFront domain name such as d111111abcdef8.cloudfront.net, don’t set a value for this field.
    */
  var SSLSupportMethod: js.UndefOr[typings.awsSdk.cloudfrontMod.SSLSupportMethod] = js.native
}

object ViewerCertificate {
  @scala.inline
  def apply(
    ACMCertificateArn: String = null,
    Certificate: String = null,
    CertificateSource: CertificateSource = null,
    CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
    IAMCertificateId: String = null,
    MinimumProtocolVersion: MinimumProtocolVersion = null,
    SSLSupportMethod: SSLSupportMethod = null
  ): ViewerCertificate = {
    val __obj = js.Dynamic.literal()
    if (ACMCertificateArn != null) __obj.updateDynamic("ACMCertificateArn")(ACMCertificateArn.asInstanceOf[js.Any])
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CertificateSource != null) __obj.updateDynamic("CertificateSource")(CertificateSource.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudFrontDefaultCertificate)) __obj.updateDynamic("CloudFrontDefaultCertificate")(CloudFrontDefaultCertificate.get.asInstanceOf[js.Any])
    if (IAMCertificateId != null) __obj.updateDynamic("IAMCertificateId")(IAMCertificateId.asInstanceOf[js.Any])
    if (MinimumProtocolVersion != null) __obj.updateDynamic("MinimumProtocolVersion")(MinimumProtocolVersion.asInstanceOf[js.Any])
    if (SSLSupportMethod != null) __obj.updateDynamic("SSLSupportMethod")(SSLSupportMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerCertificate]
  }
}

