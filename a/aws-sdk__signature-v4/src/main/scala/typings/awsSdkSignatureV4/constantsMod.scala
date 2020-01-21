package typings.awsSdkSignatureV4

import typings.awsSdkSignatureV4.awsSdkSignatureV4Numbers.`50`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`AWS4-HMAC-SHA256`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`UNSIGNED-PAYLOAD`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Algorithm`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Credential`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Date`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Expires`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Security-Token`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-Signature`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`X-Amz-SignedHeaders`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.`x-amz-content-sha256`
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.authorization
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.aws4_request
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.date
import typings.awsSdkSignatureV4.awsSdkSignatureV4Strings.host
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signature-v4/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val ALGORITHM_IDENTIFIER: `AWS4-HMAC-SHA256` = js.native
  val ALGORITHM_QUERY_PARAM: `X-Amz-Algorithm` = js.native
  val AMZ_DATE_HEADER: String = js.native
  val AMZ_DATE_QUERY_PARAM: `X-Amz-Date` = js.native
  val AUTH_HEADER: authorization = js.native
  val CREDENTIAL_QUERY_PARAM: `X-Amz-Credential` = js.native
  val DATE_HEADER: date = js.native
  val EXPIRES_QUERY_PARAM: `X-Amz-Expires` = js.native
  val GENERATED_HEADERS: js.Array[String] = js.native
  val HOST_HEADER: host = js.native
  val KEY_TYPE_IDENTIFIER: aws4_request = js.native
  val MAX_CACHE_SIZE: `50` = js.native
  val MAX_PRESIGNED_TTL: Double = js.native
  val PROXY_HEADER_PATTERN: RegExp = js.native
  val SEC_HEADER_PATTERN: RegExp = js.native
  val SHA256_HEADER: `x-amz-content-sha256` = js.native
  val SIGNATURE_HEADER: String = js.native
  val SIGNATURE_QUERY_PARAM: `X-Amz-Signature` = js.native
  val SIGNED_HEADERS_QUERY_PARAM: `X-Amz-SignedHeaders` = js.native
  val TOKEN_HEADER: String = js.native
  val TOKEN_QUERY_PARAM: `X-Amz-Security-Token` = js.native
  val UNSIGNABLE_PATTERNS: js.Array[RegExp] = js.native
  val UNSIGNED_PAYLOAD: `UNSIGNED-PAYLOAD` = js.native
  @js.native
  object ALWAYS_UNSIGNABLE_HEADERS extends js.Object {
    var authorization: Boolean = js.native
    var `cache-control`: Boolean = js.native
    var connection: Boolean = js.native
    var expect: Boolean = js.native
    var from: Boolean = js.native
    var `keep-alive`: Boolean = js.native
    var `max-forwards`: Boolean = js.native
    var pragma: Boolean = js.native
    var referer: Boolean = js.native
    var te: Boolean = js.native
    var trailer: Boolean = js.native
    var `transfer-encoding`: Boolean = js.native
    var upgrade: Boolean = js.native
    var `user-agent`: Boolean = js.native
    var `x-amzn-trace-id`: Boolean = js.native
  }
  
}

