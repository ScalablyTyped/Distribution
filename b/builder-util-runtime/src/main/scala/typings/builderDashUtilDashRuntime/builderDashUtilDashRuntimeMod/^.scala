package typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.DELETE
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.GET
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.PUT
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.installerDOTexe
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.packageDOT7z
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.GithubOptions
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import typings.std.Error
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CURRENT_APP_INSTALLER_FILE_NAME: installerDOTexe = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: packageDOT7z = js.native
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
  def configureRequestUrl(url: URL, options: RequestOptions): Unit = js.native
  def createHttpError(response: IncomingMessage): typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  def githubUrl(options: GithubOptions): String = js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  def newError(message: String, code: String): Error = js.native
  def parseDn(seq: String): Map[String, String] = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def parseXml(data: String): typings.builderDashUtilDashRuntime.outXmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
}

