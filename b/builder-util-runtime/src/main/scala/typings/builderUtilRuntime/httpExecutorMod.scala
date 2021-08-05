package typings.builderUtilRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typings.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typings.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typings.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typings.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typings.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typings.node.Buffer
import typings.node.NodeJS.Dict
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeader
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.Transform
import typings.node.urlMod.URL_
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpExecutorMod {
  
  @JSImport("builder-util-runtime/out/httpExecutor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
  @js.native
  class DigestTransform protected () extends Transform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
    def this(expected: String, algorithm: Unit, encoding: base64) = this()
    def this(expected: String, algorithm: Unit, encoding: hex) = this()
    def this(expected: String, algorithm: Unit, encoding: latin1) = this()
    
    /* private */ var _actual: js.Any = js.native
    
    def _flush(callback: js.Any): Unit = js.native
    
    def _transform(chunk: Buffer, encoding: String, callback: js.Any): Unit = js.native
    
    def actual: String | Null = js.native
    
    /* private */ val algorithm: js.Any = js.native
    
    /* private */ val digester: js.Any = js.native
    
    /* private */ val encoding: js.Any = js.native
    
    val expected: String = js.native
    
    var isValidateOnEnd: Boolean = js.native
    
    def validate(): Null = js.native
  }
  
  @JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
  @js.native
  class HttpError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
    def this(statusCode: Double, message: Unit, description: js.Any) = this()
    
    val description: js.Any | Null = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  @JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
  @js.native
  abstract class HttpExecutor[REQUEST] () extends StObject {
    
    def addErrorAndTimeoutHandlers(request: js.Any, reject: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /* protected */ def addRedirectHandlers(
      request: js.Any,
      options: RequestOptions,
      reject: js.Function1[/* error */ Error, Unit],
      redirectCount: Double,
      handler: js.Function1[/* options */ RequestOptions, Unit]
    ): Unit = js.native
    
    /* private */ var addTimeOutHandler: js.Any = js.native
    
    /* protected */ def createMaxRedirectError(): Error = js.native
    
    def createRequest(options: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): js.Any = js.native
    
    def doApiRequest(
      options: RequestOptions,
      cancellationToken: CancellationToken,
      requestProcessor: js.Function2[/* request */ REQUEST, /* reject */ js.Function1[/* error */ Error, Unit], Unit]
    ): js.Promise[String] = js.native
    def doApiRequest(
      options: RequestOptions,
      cancellationToken: CancellationToken,
      requestProcessor: js.Function2[/* request */ REQUEST, /* reject */ js.Function1[/* error */ Error, Unit], Unit],
      redirectCount: Double
    ): js.Promise[String] = js.native
    
    /* protected */ def doDownload(requestOptions: js.Any, options: DownloadCallOptions, redirectCount: Double): Unit = js.native
    
    def downloadToBuffer(url: URL_, options: DownloadOptions): js.Promise[Buffer] = js.native
    
    /* private */ var handleResponse: js.Any = js.native
    
    /* protected */ val maxRedirects: /* 10 */ Double = js.native
    
    def request(options: RequestOptions): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: Unit, data: StringDictionary[js.Any]): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken, data: StringDictionary[js.Any]): js.Promise[String | Null] = js.native
  }
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRedirectUrlOptions")(redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  }
  
  inline def configureRequestOptions(options: RequestOptions): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptionsFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_DELETE(options: RequestOptions, token: Unit, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_GET(options: RequestOptions, token: Unit, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions_PUT(options: RequestOptions, token: Unit, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestUrl(url: URL_, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createHttpError(response: IncomingMessage): HttpError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any]).asInstanceOf[HttpError]
  inline def createHttpError(response: IncomingMessage, description: js.Any): HttpError = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[HttpError]
  
  inline def parseJson(result: js.Promise[String | Null]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(result.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def safeGetHeader(response: js.Any, headerKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGetHeader")(response.asInstanceOf[js.Any], headerKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def safeStringifyJson(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any], skippedNames.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait DownloadCallOptions extends StObject {
    
    def callback(): Unit = js.native
    def callback(error: Error): Unit = js.native
    
    var destination: String | Null = js.native
    
    def onCancel(callback: js.Function0[Unit]): Unit = js.native
    
    var options: DownloadOptions = js.native
    
    var responseHandler: (js.Function2[
        /* response */ IncomingMessage, 
        /* callback */ js.Function1[/* error */ Error | Null, Unit], 
        Unit
      ]) | Null = js.native
  }
  
  trait DownloadOptions extends StObject {
    
    val cancellationToken: CancellationToken
    
    val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.undefined
    
    val sha2: js.UndefOr[String | Null] = js.undefined
    
    val sha512: js.UndefOr[String | Null] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(cancellationToken: CancellationToken): DownloadOptions = {
      val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOnProgress(value: /* progress */ ProgressInfo => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setSha2(value: String): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      inline def setSha2Null: Self = StObject.set(x, "sha2", null)
      
      inline def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
      
      inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setSha512Null: Self = StObject.set(x, "sha512", null)
      
      inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ trait RequestHeaders
    extends StObject
       with Dict[OutgoingHttpHeader]
  object RequestHeaders {
    
    inline def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
  }
}
