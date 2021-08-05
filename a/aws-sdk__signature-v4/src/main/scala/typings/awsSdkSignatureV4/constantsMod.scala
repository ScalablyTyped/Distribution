package typings.awsSdkSignatureV4

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALGORITHM_IDENTIFIER")
  @js.native
  val ALGORITHM_IDENTIFIER: /* "AWS4-HMAC-SHA256" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALGORITHM_QUERY_PARAM")
  @js.native
  val ALGORITHM_QUERY_PARAM: /* "X-Amz-Algorithm" */ String = js.native
  
  object ALWAYS_UNSIGNABLE_HEADERS {
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.authorization")
    @js.native
    def authorization: Boolean = js.native
    inline def authorization_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authorization")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.cache-control")
    @js.native
    def cacheControl: Boolean = js.native
    
    inline def cacheControl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache-control")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.connection")
    @js.native
    def connection: Boolean = js.native
    inline def connection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connection")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.expect")
    @js.native
    def expect: Boolean = js.native
    inline def expect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expect")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.from")
    @js.native
    def from: Boolean = js.native
    inline def from_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.keep-alive")
    @js.native
    def keepAlive: Boolean = js.native
    
    inline def keepAlive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keep-alive")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.max-forwards")
    @js.native
    def maxForwards: Boolean = js.native
    
    inline def maxForwards_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max-forwards")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.pragma")
    @js.native
    def pragma: Boolean = js.native
    inline def pragma_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pragma")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.referer")
    @js.native
    def referer: Boolean = js.native
    inline def referer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("referer")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.te")
    @js.native
    def te: Boolean = js.native
    inline def te_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("te")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.trailer")
    @js.native
    def trailer: Boolean = js.native
    inline def trailer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trailer")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.transfer-encoding")
    @js.native
    def transferEncoding: Boolean = js.native
    
    inline def transferEncoding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transfer-encoding")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.upgrade")
    @js.native
    def upgrade: Boolean = js.native
    inline def upgrade_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.user-agent")
    @js.native
    def userAgent: Boolean = js.native
    
    inline def userAgent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user-agent")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "ALWAYS_UNSIGNABLE_HEADERS.x-amzn-trace-id")
    @js.native
    def xAmznTraceId: Boolean = js.native
    
    inline def xAmznTraceId_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x-amzn-trace-id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "AMZ_DATE_HEADER")
  @js.native
  val AMZ_DATE_HEADER: String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "AMZ_DATE_QUERY_PARAM")
  @js.native
  val AMZ_DATE_QUERY_PARAM: /* "X-Amz-Date" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "AUTH_HEADER")
  @js.native
  val AUTH_HEADER: /* "authorization" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "CREDENTIAL_QUERY_PARAM")
  @js.native
  val CREDENTIAL_QUERY_PARAM: /* "X-Amz-Credential" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "DATE_HEADER")
  @js.native
  val DATE_HEADER: /* "date" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "EVENT_ALGORITHM_IDENTIFIER")
  @js.native
  val EVENT_ALGORITHM_IDENTIFIER: /* "AWS4-HMAC-SHA256-PAYLOAD" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "EXPIRES_QUERY_PARAM")
  @js.native
  val EXPIRES_QUERY_PARAM: /* "X-Amz-Expires" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "GENERATED_HEADERS")
  @js.native
  val GENERATED_HEADERS: js.Array[String] = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "HOST_HEADER")
  @js.native
  val HOST_HEADER: /* "host" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "KEY_TYPE_IDENTIFIER")
  @js.native
  val KEY_TYPE_IDENTIFIER: /* "aws4_request" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "MAX_CACHE_SIZE")
  @js.native
  val MAX_CACHE_SIZE: /* 50 */ Double = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "MAX_PRESIGNED_TTL")
  @js.native
  val MAX_PRESIGNED_TTL: Double = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "PROXY_HEADER_PATTERN")
  @js.native
  val PROXY_HEADER_PATTERN: RegExp = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "SEC_HEADER_PATTERN")
  @js.native
  val SEC_HEADER_PATTERN: RegExp = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "SHA256_HEADER")
  @js.native
  val SHA256_HEADER: /* "x-amz-content-sha256" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "SIGNATURE_HEADER")
  @js.native
  val SIGNATURE_HEADER: String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "SIGNATURE_QUERY_PARAM")
  @js.native
  val SIGNATURE_QUERY_PARAM: /* "X-Amz-Signature" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "SIGNED_HEADERS_QUERY_PARAM")
  @js.native
  val SIGNED_HEADERS_QUERY_PARAM: /* "X-Amz-SignedHeaders" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "TOKEN_HEADER")
  @js.native
  val TOKEN_HEADER: String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "TOKEN_QUERY_PARAM")
  @js.native
  val TOKEN_QUERY_PARAM: /* "X-Amz-Security-Token" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "UNSIGNABLE_PATTERNS")
  @js.native
  val UNSIGNABLE_PATTERNS: js.Array[RegExp] = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/constants", "UNSIGNED_PAYLOAD")
  @js.native
  val UNSIGNED_PAYLOAD: /* "UNSIGNED-PAYLOAD" */ String = js.native
}
