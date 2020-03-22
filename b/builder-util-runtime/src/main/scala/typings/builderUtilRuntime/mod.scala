package typings.builderUtilRuntime

import typings.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typings.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typings.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typings.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typings.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typings.builderUtilRuntime.builderUtilRuntimeStrings.installerDotexe
import typings.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typings.builderUtilRuntime.builderUtilRuntimeStrings.packageDot7z
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CancellationError ()
    extends typings.builderUtilRuntime.cancellationTokenMod.CancellationError
  
  @js.native
  class CancellationToken ()
    extends typings.builderUtilRuntime.cancellationTokenMod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class DigestTransform protected ()
    extends typings.builderUtilRuntime.httpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
  }
  
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typings.builderUtilRuntime.httpExecutorMod.HttpExecutor[REQUEST]
  
  @js.native
  class ProgressCallbackTransform protected ()
    extends typings.builderUtilRuntime.progressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
    ) = this()
  }
  
  @js.native
  class UUID protected ()
    extends typings.builderUtilRuntime.uuidMod.UUID {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
  }
  
  @js.native
  class XElement protected ()
    extends typings.builderUtilRuntime.xmlMod.XElement {
    def this(name: String) = this()
  }
  
  val CURRENT_APP_INSTALLER_FILE_NAME: installerDotexe = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: packageDot7z = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = js.native
  def createHttpError(response: IncomingMessage): typings.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typings.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  def githubUrl(options: GithubOptions): String = js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  def newError(message: String, code: String): Error = js.native
  def parseDn(seq: String): Map[String, String] = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def parseXml(data: String): typings.builderUtilRuntime.xmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  /* static members */
  @js.native
  object HttpExecutor extends js.Object {
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  /* static members */
  @js.native
  object UUID extends js.Object {
    val OID: Buffer = js.native
    def check(uuid: String): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: String, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def parse(input: String): Buffer = js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
}

