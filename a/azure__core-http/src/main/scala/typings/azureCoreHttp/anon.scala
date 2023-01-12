package typings.azureCoreHttp

import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreHttp.typesLatestSrcOperationOptionsMod.OperationOptions
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AUTHORIZATION extends StObject {
    
    /**
      * The Authorization header.
      */
    var AUTHORIZATION: String
    
    var AUTHORIZATION_SCHEME: String
    
    /**
      * The Retry-After response-header field can be used with a 503 (Service
      * Unavailable) or 349 (Too Many Requests) responses to indicate how long
      * the service is expected to be unavailable to the requesting client.
      */
    var RETRY_AFTER: String
    
    /**
      * The UserAgent header.
      */
    var USER_AGENT: String
  }
  object AUTHORIZATION {
    
    inline def apply(AUTHORIZATION: String, AUTHORIZATION_SCHEME: String, RETRY_AFTER: String, USER_AGENT: String): AUTHORIZATION = {
      val __obj = js.Dynamic.literal(AUTHORIZATION = AUTHORIZATION.asInstanceOf[js.Any], AUTHORIZATION_SCHEME = AUTHORIZATION_SCHEME.asInstanceOf[js.Any], RETRY_AFTER = RETRY_AFTER.asInstanceOf[js.Any], USER_AGENT = USER_AGENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[AUTHORIZATION]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AUTHORIZATION] (val x: Self) extends AnyVal {
      
      inline def setAUTHORIZATION(value: String): Self = StObject.set(x, "AUTHORIZATION", value.asInstanceOf[js.Any])
      
      inline def setAUTHORIZATION_SCHEME(value: String): Self = StObject.set(x, "AUTHORIZATION_SCHEME", value.asInstanceOf[js.Any])
      
      inline def setRETRY_AFTER(value: String): Self = StObject.set(x, "RETRY_AFTER", value.asInstanceOf[js.Any])
      
      inline def setUSER_AGENT(value: String): Self = StObject.set(x, "USER_AGENT", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbortErrorMsg extends StObject {
    
    var abortErrorMsg: js.UndefOr[String] = js.undefined
    
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  }
  object AbortErrorMsg {
    
    inline def apply(): AbortErrorMsg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortErrorMsg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortErrorMsg] (val x: Self) extends AnyVal {
      
      inline def setAbortErrorMsg(value: String): Self = StObject.set(x, "abortErrorMsg", value.asInstanceOf[js.Any])
      
      inline def setAbortErrorMsgUndefined: Self = StObject.set(x, "abortErrorMsg", js.undefined)
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    }
  }
  
  trait CustomNoProxyList extends StObject {
    
    /** a list of patterns to override those loaded from NO_PROXY environment variable. */
    var customNoProxyList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CustomNoProxyList {
    
    inline def apply(): CustomNoProxyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomNoProxyList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomNoProxyList] (val x: Self) extends AnyVal {
      
      inline def setCustomNoProxyList(value: js.Array[String]): Self = StObject.set(x, "customNoProxyList", value.asInstanceOf[js.Any])
      
      inline def setCustomNoProxyListUndefined: Self = StObject.set(x, "customNoProxyList", js.undefined)
      
      inline def setCustomNoProxyListVarargs(value: String*): Self = StObject.set(x, "customNoProxyList", js.Array(value*))
    }
  }
  
  trait DELETE extends StObject {
    
    var DELETE: String
    
    var GET: String
    
    var HEAD: String
    
    var MERGE: String
    
    var PATCH: String
    
    var POST: String
    
    var PUT: String
  }
  object DELETE {
    
    inline def apply(DELETE: String, GET: String, HEAD: String, MERGE: String, PATCH: String, POST: String, PUT: String): DELETE = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], MERGE = MERGE.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DELETE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DELETE] (val x: Self) extends AnyVal {
      
      inline def setDELETE(value: String): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: String): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setHEAD(value: String): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      inline def setMERGE(value: String): Self = StObject.set(x, "MERGE", value.asInstanceOf[js.Any])
      
      inline def setPATCH(value: String): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: String): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPUT(value: String): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpVerbs extends StObject {
    
    /**
      * Http Verbs
      */
    var HttpVerbs: DELETE
    
    var StatusCodes: ServiceUnavailable
  }
  object HttpVerbs {
    
    inline def apply(HttpVerbs: DELETE, StatusCodes: ServiceUnavailable): HttpVerbs = {
      val __obj = js.Dynamic.literal(HttpVerbs = HttpVerbs.asInstanceOf[js.Any], StatusCodes = StatusCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpVerbs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpVerbs] (val x: Self) extends AnyVal {
      
      inline def setHttpVerbs(value: DELETE): Self = StObject.set(x, "HttpVerbs", value.asInstanceOf[js.Any])
      
      inline def setStatusCodes(value: ServiceUnavailable): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxRetryInterval extends StObject {
    
    var maxRetryInterval: Double
    
    var minRetryInterval: Double
    
    var retryInterval: Double
  }
  object MaxRetryInterval {
    
    inline def apply(maxRetryInterval: Double, minRetryInterval: Double, retryInterval: Double): MaxRetryInterval = {
      val __obj = js.Dynamic.literal(maxRetryInterval = maxRetryInterval.asInstanceOf[js.Any], minRetryInterval = minRetryInterval.asInstanceOf[js.Any], retryInterval = retryInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxRetryInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxRetryInterval] (val x: Self) extends AnyVal {
      
      inline def setMaxRetryInterval(value: Double): Self = StObject.set(x, "maxRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setMinRetryInterval(value: Double): Self = StObject.set(x, "minRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.RequestInit> */
  trait PartialRequestInit extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object PartialRequestInit {
    
    inline def apply(): PartialRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRequestInit] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait PreserveCase extends StObject {
    
    var preserveCase: js.UndefOr[Boolean] = js.undefined
  }
  object PreserveCase {
    
    inline def apply(): PreserveCase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreserveCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreserveCase] (val x: Self) extends AnyVal {
      
      inline def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveCaseUndefined: Self = StObject.set(x, "preserveCase", js.undefined)
    }
  }
  
  trait Protocol extends StObject {
    
    var protocol: String
  }
  object Protocol {
    
    inline def apply(protocol: String): Protocol = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceUnavailable extends StObject {
    
    var ServiceUnavailable: Double
    
    var TooManyRequests: Double
  }
  object ServiceUnavailable {
    
    inline def apply(ServiceUnavailable: Double, TooManyRequests: Double): ServiceUnavailable = {
      val __obj = js.Dynamic.literal(ServiceUnavailable = ServiceUnavailable.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceUnavailable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceUnavailable] (val x: Self) extends AnyVal {
      
      inline def setServiceUnavailable(value: Double): Self = StObject.set(x, "ServiceUnavailable", value.asInstanceOf[js.Any])
      
      inline def setTooManyRequests(value: Double): Self = StObject.set(x, "TooManyRequests", value.asInstanceOf[js.Any])
    }
  }
  
  trait Span[T /* <: OperationOptions */] extends StObject {
    
    var span: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Span */ Any
    
    var updatedOptions: T
  }
  object Span {
    
    inline def apply[T /* <: OperationOptions */](
      span: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Span */ Any,
      updatedOptions: T
    ): Span[T] = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], updatedOptions = updatedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Span[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Span[?], T /* <: OperationOptions */] (val x: Self & Span[T]) extends AnyVal {
      
      inline def setSpan(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Span */ Any
      ): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setUpdatedOptions(value: T): Self = StObject.set(x, "updatedOptions", value.asInstanceOf[js.Any])
    }
  }
}
