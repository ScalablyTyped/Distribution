package typings.awsSdkS3RequestPresigner

import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`AWS4-HMAC-SHA256`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`UNSIGNED-PAYLOAD`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-Algorithm`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-Content-Sha256`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-Credential`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-Date`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-Expires`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.`X-Amz-SignedHeaders`
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-request-presigner/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val ALGORITHM_IDENTIFIER: `AWS4-HMAC-SHA256` = js.native
  val ALGORITHM_QUERY_PARAM: `X-Amz-Algorithm` = js.native
  val AMZ_DATE_QUERY_PARAM: `X-Amz-Date` = js.native
  val CREDENTIAL_QUERY_PARAM: `X-Amz-Credential` = js.native
  val EXPIRES_QUERY_PARAM: `X-Amz-Expires` = js.native
  val HOST_HEADER: host = js.native
  val SHA256_HEADER: `X-Amz-Content-Sha256` = js.native
  val SIGNED_HEADERS_QUERY_PARAM: `X-Amz-SignedHeaders` = js.native
  val UNSIGNED_PAYLOAD: `UNSIGNED-PAYLOAD` = js.native
}

