package typings.builderUtilRuntime

import typings.builderUtilRuntime.anon.Format
import typings.builderUtilRuntime.anon.Variant
import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typings.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typings.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typings.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typings.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typings.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typings.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typings.builderUtilRuntime.publishOptionsMod.GithubOptions
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL_
import typings.std.Error
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
  class CancellationError ()
    extends typings.builderUtilRuntime.cancellationTokenMod.CancellationError
  
  @JSImport("builder-util-runtime", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typings.builderUtilRuntime.cancellationTokenMod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("builder-util-runtime", "DigestTransform")
  @js.native
  class DigestTransform protected ()
    extends typings.builderUtilRuntime.httpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
    def this(expected: String, algorithm: Unit, encoding: base64) = this()
    def this(expected: String, algorithm: Unit, encoding: hex) = this()
    def this(expected: String, algorithm: Unit, encoding: latin1) = this()
  }
  
  @JSImport("builder-util-runtime", "HttpError")
  @js.native
  class HttpError protected ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
    def this(statusCode: Double, message: Unit, description: js.Any) = this()
  }
  
  @JSImport("builder-util-runtime", "HttpExecutor")
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpExecutor[REQUEST]
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime", "HttpExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRedirectUrlOptions")(redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  }
  
  @JSImport("builder-util-runtime", "ProgressCallbackTransform")
  @js.native
  class ProgressCallbackTransform protected ()
    extends typings.builderUtilRuntime.progressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, js.Any]
    ) = this()
  }
  
  @JSImport("builder-util-runtime", "UUID")
  @js.native
  class UUID protected ()
    extends typings.builderUtilRuntime.uuidMod.UUID {
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
    
    @scala.inline
    def check(uuid: String): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: String, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: Buffer): `false` | Format | Variant = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[`false` | Format | Variant]
    @scala.inline
    def check(uuid: Buffer, offset: Double): `false` | Format | Variant = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[`false` | Format | Variant]
    
    @scala.inline
    def parse(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def v5(name: String, namespace: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def v5(name: Buffer, namespace: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("builder-util-runtime", "XElement")
  @js.native
  class XElement protected ()
    extends typings.builderUtilRuntime.xmlMod.XElement {
    def this(name: String) = this()
  }
  
  @scala.inline
  def asArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")().asInstanceOf[js.Array[T]]
  @scala.inline
  def asArray[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def asArray[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def configureRequestOptions(options: RequestOptions): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  @scala.inline
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptionsFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  @scala.inline
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_DELETE(options: RequestOptions, token: Unit, method: DELETE): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  @scala.inline
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_GET(options: RequestOptions, token: Unit, method: GET): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  @scala.inline
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  @scala.inline
  def configureRequestOptions_PUT(options: RequestOptions, token: Unit, method: PUT): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  @scala.inline
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createHttpError(response: IncomingMessage): typings.builderUtilRuntime.httpExecutorMod.HttpError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any]).asInstanceOf[typings.builderUtilRuntime.httpExecutorMod.HttpError]
  @scala.inline
  def createHttpError(response: IncomingMessage, description: js.Any): typings.builderUtilRuntime.httpExecutorMod.HttpError = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.builderUtilRuntime.httpExecutorMod.HttpError]
  
  @scala.inline
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getS3LikeProviderBaseUrl")(configuration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def githubUrl(options: GithubOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def githubUrl(options: GithubOptions, defaultHost: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("githubUrl")(options.asInstanceOf[js.Any], defaultHost.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def newError(message: String, code: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("newError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def parseDn(seq: String): Map[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDn")(seq.asInstanceOf[js.Any]).asInstanceOf[Map[String, String]]
  
  @scala.inline
  def parseJson(result: js.Promise[String | Null]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(result.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def parseXml(data: String): typings.builderUtilRuntime.xmlMod.XElement = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(data.asInstanceOf[js.Any]).asInstanceOf[typings.builderUtilRuntime.xmlMod.XElement]
  
  @scala.inline
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGetHeader")(response.asInstanceOf[js.Any], headerKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def safeStringifyJson(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any], skippedNames.asInstanceOf[js.Any])).asInstanceOf[String]
}
