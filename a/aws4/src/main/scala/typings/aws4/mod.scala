package typings.aws4

import typings.aws4.anon.Path
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws4", "RequestSigner")
  @js.native
  open class RequestSigner protected () extends StObject {
    def this(requestOptions: String) = this()
    def this(requestOptions: Request) = this()
    def this(requestOptions: String, credentials: Credentials) = this()
    def this(requestOptions: Request, credentials: Credentials) = this()
    
    /**
      * Generate the Authorization header value.
      */
    def authHeader(): String = js.native
    
    /**
      * Generate a string representation of {@link request}.headers:
      * - one header per line, formatted as `<key>:<value>`
      * - lines are sorted.
      * - `<key>` is in lowercase and is trimmed.
      * - `<value>` is trimmed, and contiguous whitespaces are reduced to a
      *   single space character ` `.
      *
      * These headers are filtered out:
      * - `authorization`
      * - `connection`
      * - `x-amzn-trace-id`
      * - `user-agent`
      * - `expect`
      * - `presigned-expires`
      * - `range`
      */
    def canonicalHeaders(): String = js.native
    
    /**
      * Generate a string representation of the Request.
      * https://docs.aws.amazon.com/general/latest/gr/sigv4-create-canonical-request.html
      */
    def canonicalString(): String = js.native
    
    /**
      * Compute the Host name from the {@link service} and the {@link region}.
      */
    def createHost(): String = js.native
    
    /**
      * Generate the “credential scope” part of the signature.
      */
    def credentialString(): String = js.native
    
    var credentials: Credentials = js.native
    
    /**
      * Used as a cache by {@link getDateTime} and {@link getDate}.
      * Setting it will shortcut those functions.
      *
      * Set by:
      * - {@link prepareRequest}
      * - {@link getDateTime}
      * - {@link sign}
      */
    var datetime: js.UndefOr[String] = js.native
    
    /**
      * Extract credentials from the environment, if found.
      */
    def defaultCredentials(): Credentials = js.native
    
    /**
      * **Will throw if {@link parsedPath} is undefined!**
      *
      * Rebuild the path from {@link parsedPath}.
      */
    def formatPath(): String = js.native
    
    /**
      * If {@link datetime} is set, its first 8 characters are returned.
      *
      * Else, call {@link getDateTime} and return the first 8 characters.
      */
    def getDate(): String = js.native
    
    /**
      * If {@link datetime} is set, it is returned without further processing.
      *
      * Else, parse the `Date` header from {@link request}.headers,
      * or get the current date, and format it as (ISO 8601):
      * ```
      * YYYYMMDDThhmmssZ
      * ```
      * If {@link isCodeCommitGit} is `true`, then the trailing `Z` is removed.
      *
      * The result is stored to {@link datetime} before being returned.
      */
    def getDateTime(): String = js.native
    
    /**
      * `true` if {@link service} is `"codecommit"` and {@link request}.method
      * is `"GIT"`.
      */
    var isCodeCommitGit: Boolean = js.native
    
    /**
      * https://docs.aws.amazon.com/general/latest/gr/rande.html
      */
    def isSingleRegion(): Boolean = js.native
    
    /**
      * Extract the service code and region code from a Host name.
      * @returns two element string tuple with values [service, region].
      */
    def matchHost(host: String): js.Tuple2[String, String] = js.native
    
    /**
      * Parse {@link request}.path and store the results in {@link parsedPath}.
      */
    def parsePath(): Unit = js.native
    
    /**
      * Set by:
      * - {@link prepareRequest}
      * - {@link sign}
      * - {@link canonicalString}
      * - {@link parsePath}
      */
    var parsedPath: js.UndefOr[Path] = js.native
    
    /**
      * Calls {@link parsePath}.
      * Prepare the Request by setting the required headers,
      * or query parameters if {@link request}.signQuery is true.
      */
    def prepareRequest(): Unit = js.native
    
    var region: String = js.native
    
    var request: Request = js.native
    
    var service: String = js.native
    
    /**
      * Sign the Request. The Request is returned for convenience.
      */
    def sign(): Request = js.native
    
    /**
      * Compute the Request HMAC signature.
      */
    def signature(): String = js.native
    
    /**
      * Generates a list of the header names of {@link request}.headers separated
      * by `;`.
      *
      * These headers are filtered out:
      * - `authorization`
      * - `connection`
      * - `x-amzn-trace-id`
      * - `user-agent`
      * - `expect`
      * - `presigned-expires`
      * - `range`
      */
    def signedHeaders(): String = js.native
    
    /**
      * Generate the raw data to be signed.
      * https://docs.aws.amazon.com/general/latest/gr/sigv4-create-string-to-sign.html
      */
    def stringToSign(): String = js.native
  }
  
  inline def sign(requestOptions: String): Request = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[Request]
  inline def sign(requestOptions: String, credentials: Credentials): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(requestOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[Request]
  inline def sign(requestOptions: Request): Request = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[Request]
  inline def sign(requestOptions: Request, credentials: Credentials): Request = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(requestOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[Request]
  
  trait Credentials extends StObject {
    
    /** Equivalent to the env vars `AWS_ACCESS_KEY_ID` and `AWS_ACCESS_KEY`. */
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    /** Equivalent to the env vars `AWS_SECRET_ACCESS_KEY` and `AWS_SECRET_KEY`. */
    var secretAccessKey: js.UndefOr[String] = js.undefined
    
    /** Equivalent to the env var `AWS_SESSION_TOKEN`. */
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait Request
    extends StObject
       with ClientRequestArgs {
    
    /** Defaults to `""`. */
    var body: js.UndefOr[String | Buffer] = js.undefined
    
    /** If true, {@link path} won’t be encoded in the signature. */
    var doNotEncodePath: js.UndefOr[Boolean] = js.undefined
    
    /** If true, signing the Request won’t mutate the headers. */
    var doNotModifyHeaders: js.UndefOr[Boolean] = js.undefined
    
    /** Defaults to {@link RequestSigner.createHost}() if possible. */
    @JSName("host")
    var host_Request: js.UndefOr[String] = js.undefined
    
    /** Equivalent to {@link host} */
    @JSName("hostname")
    var hostname_Request: js.UndefOr[String] = js.undefined
    
    /** Defaults to `/`. */
    @JSName("path")
    var path_Request: js.UndefOr[String] = js.undefined
    
    /** Defaults to {@link RequestSigner.matchHost}()[1], or `"us-east-1"`. */
    var region: js.UndefOr[String] = js.undefined
    
    /** Defaults to {@link RequestSigner.matchHost}()[0], or `""`. */
    var service: js.UndefOr[String] = js.undefined
    
    /** To sign the query instead of adding an Authorization header, defaults to false. */
    var signQuery: js.UndefOr[Boolean] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDoNotEncodePath(value: Boolean): Self = StObject.set(x, "doNotEncodePath", value.asInstanceOf[js.Any])
      
      inline def setDoNotEncodePathUndefined: Self = StObject.set(x, "doNotEncodePath", js.undefined)
      
      inline def setDoNotModifyHeaders(value: Boolean): Self = StObject.set(x, "doNotModifyHeaders", value.asInstanceOf[js.Any])
      
      inline def setDoNotModifyHeadersUndefined: Self = StObject.set(x, "doNotModifyHeaders", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSignQuery(value: Boolean): Self = StObject.set(x, "signQuery", value.asInstanceOf[js.Any])
      
      inline def setSignQueryUndefined: Self = StObject.set(x, "signQuery", js.undefined)
    }
  }
}
