package typings.awsSdkSignatureV4

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4/dist/cjs/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val ALGORITHM_IDENTIFIER: /* "AWS4-HMAC-SHA256" */ String = js.native
  
  val ALGORITHM_QUERY_PARAM: /* "X-Amz-Algorithm" */ String = js.native
  
  val AMZ_DATE_HEADER: String = js.native
  
  val AMZ_DATE_QUERY_PARAM: /* "X-Amz-Date" */ String = js.native
  
  val AUTH_HEADER: /* "authorization" */ String = js.native
  
  val CREDENTIAL_QUERY_PARAM: /* "X-Amz-Credential" */ String = js.native
  
  val DATE_HEADER: /* "date" */ String = js.native
  
  val EVENT_ALGORITHM_IDENTIFIER: /* "AWS4-HMAC-SHA256-PAYLOAD" */ String = js.native
  
  val EXPIRES_QUERY_PARAM: /* "X-Amz-Expires" */ String = js.native
  
  val GENERATED_HEADERS: js.Array[String] = js.native
  
  val HOST_HEADER: /* "host" */ String = js.native
  
  val KEY_TYPE_IDENTIFIER: /* "aws4_request" */ String = js.native
  
  val MAX_CACHE_SIZE: /* 50 */ Double = js.native
  
  val MAX_PRESIGNED_TTL: Double = js.native
  
  val PROXY_HEADER_PATTERN: RegExp = js.native
  
  val SEC_HEADER_PATTERN: RegExp = js.native
  
  val SHA256_HEADER: /* "x-amz-content-sha256" */ String = js.native
  
  val SIGNATURE_HEADER: String = js.native
  
  val SIGNATURE_QUERY_PARAM: /* "X-Amz-Signature" */ String = js.native
  
  val SIGNED_HEADERS_QUERY_PARAM: /* "X-Amz-SignedHeaders" */ String = js.native
  
  val TOKEN_HEADER: String = js.native
  
  val TOKEN_QUERY_PARAM: /* "X-Amz-Security-Token" */ String = js.native
  
  val UNSIGNABLE_PATTERNS: js.Array[RegExp] = js.native
  
  val UNSIGNED_PAYLOAD: /* "UNSIGNED-PAYLOAD" */ String = js.native
  
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
