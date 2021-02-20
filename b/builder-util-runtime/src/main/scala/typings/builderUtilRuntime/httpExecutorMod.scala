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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpExecutorMod {
  
  @JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
  @js.native
  class DigestTransform protected () extends Transform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: base64) = this()
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: hex) = this()
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: latin1) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
    
    var _actual: js.Any = js.native
    
    def _flush(callback: js.Any): Unit = js.native
    
    def _transform(chunk: Buffer, encoding: String, callback: js.Any): Unit = js.native
    
    def actual: String | Null = js.native
    
    val algorithm: js.Any = js.native
    
    val digester: js.Any = js.native
    
    val encoding: js.Any = js.native
    
    val expected: String = js.native
    
    var isValidateOnEnd: Boolean = js.native
    
    def validate(): Null = js.native
  }
  
  @JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
  @js.native
  class HttpError protected () extends Error {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: js.UndefOr[scala.Nothing], description: js.Any) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
    
    val description: js.Any | Null = js.native
    
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
    
    var addTimeOutHandler: js.Any = js.native
    
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
    
    var handleResponse: js.Any = js.native
    
    val maxRedirects: /* 10 */ Double = js.native
    
    def request(options: RequestOptions): js.Promise[String | Null] = js.native
    def request(
      options: RequestOptions,
      cancellationToken: js.UndefOr[scala.Nothing],
      data: StringDictionary[js.Any]
    ): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken, data: StringDictionary[js.Any]): js.Promise[String | Null] = js.native
  }
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor.prepareRedirectUrlOptions")
    @js.native
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptionsFromUrl")
  @js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: PUT): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "configureRequestUrl")
  @js.native
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "createHttpError")
  @js.native
  def createHttpError(response: IncomingMessage): HttpError = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "createHttpError")
  @js.native
  def createHttpError(response: IncomingMessage, description: js.Any): HttpError = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "parseJson")
  @js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "safeGetHeader")
  @js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any): String = js.native
  @JSImport("builder-util-runtime/out/httpExecutor", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  
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
  
  @js.native
  trait DownloadOptions extends StObject {
    
    val cancellationToken: CancellationToken = js.native
    
    val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.native
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.native
    
    val sha2: js.UndefOr[String | Null] = js.native
    
    val sha512: js.UndefOr[String | Null] = js.native
  }
  object DownloadOptions {
    
    @scala.inline
    def apply(cancellationToken: CancellationToken): DownloadOptions = {
      val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* progress */ ProgressInfo => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setSha2(value: String): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha2Null: Self = StObject.set(x, "sha2", null)
      
      @scala.inline
      def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
      
      @scala.inline
      def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha512Null: Self = StObject.set(x, "sha512", null)
      
      @scala.inline
      def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @js.native
  trait RequestHeaders extends Dict[OutgoingHttpHeader]
  object RequestHeaders {
    
    @scala.inline
    def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
  }
}
