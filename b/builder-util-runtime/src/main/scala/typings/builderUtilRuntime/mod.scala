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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: base64) = this()
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: hex) = this()
    def this(expected: String, algorithm: js.UndefOr[scala.Nothing], encoding: latin1) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
  }
  
  @JSImport("builder-util-runtime", "HttpError")
  @js.native
  class HttpError protected ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: js.UndefOr[scala.Nothing], description: js.Any) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
  }
  
  @JSImport("builder-util-runtime", "HttpExecutor")
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpExecutor[REQUEST]
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime", "HttpExecutor.prepareRedirectUrlOptions")
    @js.native
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  @JSImport("builder-util-runtime", "ProgressCallbackTransform")
  @js.native
  class ProgressCallbackTransform protected ()
    extends typings.builderUtilRuntime.progressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
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
    
    @JSImport("builder-util-runtime", "UUID.OID")
    @js.native
    val OID: Buffer = js.native
    
    @JSImport("builder-util-runtime", "UUID.check")
    @js.native
    def check(uuid: String): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime", "UUID.check")
    @js.native
    def check(uuid: String, offset: Double): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime", "UUID.check")
    @js.native
    def check(uuid: Buffer): `false` | Format | Variant = js.native
    @JSImport("builder-util-runtime", "UUID.check")
    @js.native
    def check(uuid: Buffer, offset: Double): `false` | Format | Variant = js.native
    
    @JSImport("builder-util-runtime", "UUID.parse")
    @js.native
    def parse(input: String): Buffer = js.native
    
    @JSImport("builder-util-runtime", "UUID.v5")
    @js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    @JSImport("builder-util-runtime", "UUID.v5")
    @js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
  @JSImport("builder-util-runtime", "XElement")
  @js.native
  class XElement protected ()
    extends typings.builderUtilRuntime.xmlMod.XElement {
    def this(name: String) = this()
  }
  
  @JSImport("builder-util-runtime", "asArray")
  @js.native
  def asArray[T](): js.Array[T] = js.native
  @JSImport("builder-util-runtime", "asArray")
  @js.native
  def asArray[T](v: T): js.Array[T] = js.native
  @JSImport("builder-util-runtime", "asArray")
  @js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  
  @JSImport("builder-util-runtime", "configureRequestOptionsFromUrl")
  @js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: js.UndefOr[scala.Nothing], method: PUT): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSImport("builder-util-runtime", "configureRequestOptions")
  @js.native
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  
  @JSImport("builder-util-runtime", "configureRequestUrl")
  @js.native
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = js.native
  
  @JSImport("builder-util-runtime", "createHttpError")
  @js.native
  def createHttpError(response: IncomingMessage): typings.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  @JSImport("builder-util-runtime", "createHttpError")
  @js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typings.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  
  @JSImport("builder-util-runtime", "getS3LikeProviderBaseUrl")
  @js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  
  @JSImport("builder-util-runtime", "githubUrl")
  @js.native
  def githubUrl(options: GithubOptions): String = js.native
  @JSImport("builder-util-runtime", "githubUrl")
  @js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  
  @JSImport("builder-util-runtime", "newError")
  @js.native
  def newError(message: String, code: String): Error = js.native
  
  @JSImport("builder-util-runtime", "parseDn")
  @js.native
  def parseDn(seq: String): Map[String, String] = js.native
  
  @JSImport("builder-util-runtime", "parseJson")
  @js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  
  @JSImport("builder-util-runtime", "parseXml")
  @js.native
  def parseXml(data: String): typings.builderUtilRuntime.xmlMod.XElement = js.native
  
  @JSImport("builder-util-runtime", "safeGetHeader")
  @js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  
  @JSImport("builder-util-runtime", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any): String = js.native
  @JSImport("builder-util-runtime", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
}
