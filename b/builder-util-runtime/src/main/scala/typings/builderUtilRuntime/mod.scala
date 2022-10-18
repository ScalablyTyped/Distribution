package typings.builderUtilRuntime

import typings.builderUtilRuntime.anon.Format
import typings.builderUtilRuntime.anon.Variant
import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typings.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typings.builderUtilRuntime.builderUtilRuntimeStrings.POST
import typings.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typings.builderUtilRuntime.outHttpExecutorMod.Request
import typings.builderUtilRuntime.outProgressCallbackTransformMod.ProgressInfo
import typings.builderUtilRuntime.outPublishOptionsMod.GithubOptions
import typings.builderUtilRuntime.outPublishOptionsMod.PublishConfiguration
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryToTextEncoding
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL_
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("builder-util-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util-runtime", "CURRENT_APP_INSTALLER_FILE_NAME")
  @js.native
  val CURRENT_APP_INSTALLER_FILE_NAME: /* "installer.exe" */ String = js.native
  
  @JSImport("builder-util-runtime", "CURRENT_APP_PACKAGE_FILE_NAME")
  @js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: /* "package.7z" */ String = js.native
  
  @JSImport("builder-util-runtime", "CancellationError")
  @js.native
  open class CancellationError ()
    extends typings.builderUtilRuntime.outCancellationTokenMod.CancellationError
  
  @JSImport("builder-util-runtime", "CancellationToken")
  @js.native
  open class CancellationToken ()
    extends typings.builderUtilRuntime.outCancellationTokenMod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("builder-util-runtime", "DigestTransform")
  @js.native
  open class DigestTransform protected ()
    extends typings.builderUtilRuntime.outHttpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: BinaryToTextEncoding) = this()
    def this(expected: String, algorithm: Unit, encoding: BinaryToTextEncoding) = this()
  }
  
  @JSImport("builder-util-runtime", "HttpError")
  @js.native
  open class HttpError protected ()
    extends typings.builderUtilRuntime.outHttpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: Any) = this()
    def this(statusCode: Double, message: Unit, description: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("builder-util-runtime", "HttpExecutor")
  @js.native
  open class HttpExecutor[T /* <: Request */] ()
    extends typings.builderUtilRuntime.outHttpExecutorMod.HttpExecutor[T]
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime", "HttpExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRedirectUrlOptions")(redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
    
    inline def retryOnServerError(task: js.Function0[js.Promise[Any]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryOnServerError")(task.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def retryOnServerError(task: js.Function0[js.Promise[Any]], maxRetries: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryOnServerError")(task.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  @JSImport("builder-util-runtime", "ProgressCallbackTransform")
  @js.native
  open class ProgressCallbackTransform protected ()
    extends typings.builderUtilRuntime.outProgressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typings.builderUtilRuntime.outCancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, Any]
    ) = this()
  }
  
  @JSImport("builder-util-runtime", "UUID")
  @js.native
  open class UUID protected ()
    extends typings.builderUtilRuntime.outUuidMod.UUID {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
  }
  /* static members */
  object UUID {
    
    @JSImport("builder-util-runtime", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("builder-util-runtime", "UUID.OID")
    @js.native
    val OID: Buffer = js.native
    
    inline def check(uuid: String): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    inline def check(uuid: String, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    inline def check(uuid: Buffer): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    inline def check(uuid: Buffer, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    
    inline def parse(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def v5(name: String, namespace: Buffer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def v5(name: Buffer, namespace: Buffer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("builder-util-runtime", "XElement")
  @js.native
  open class XElement protected ()
    extends typings.builderUtilRuntime.outXmlMod.XElement {
    def this(name: String) = this()
  }
  
  inline def asArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")().asInstanceOf[js.Array[T]]
  inline def asArray[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asArray[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def configureRequestOptions(options: RequestOptions): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: String, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: Null, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: Unit, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptionsFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestUrl(url: URL_, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createHttpError(response: IncomingMessage): typings.builderUtilRuntime.outHttpExecutorMod.HttpError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any]).asInstanceOf[typings.builderUtilRuntime.outHttpExecutorMod.HttpError]
  inline def createHttpError(response: IncomingMessage, description: Any): typings.builderUtilRuntime.outHttpExecutorMod.HttpError = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.builderUtilRuntime.outHttpExecutorMod.HttpError]
  
  inline def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getS3LikeProviderBaseUrl")(configuration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def githubUrl(options: GithubOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def githubUrl(options: GithubOptions, defaultHost: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any], defaultHost.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def newError(message: String, code: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("newError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def parseDn(seq: String): Map[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDn")(seq.asInstanceOf[js.Any]).asInstanceOf[Map[String, String]]
  
  inline def parseJson(result: js.Promise[String | Null]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(result.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def parseXml(data: String): typings.builderUtilRuntime.outXmlMod.XElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(data.asInstanceOf[js.Any]).asInstanceOf[typings.builderUtilRuntime.outXmlMod.XElement]
  
  inline def safeGetHeader(response: Any, headerKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGetHeader")(response.asInstanceOf[js.Any], headerKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def safeStringifyJson(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeStringifyJson(data: Any, skippedNames: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any], skippedNames.asInstanceOf[js.Any])).asInstanceOf[String]
}
