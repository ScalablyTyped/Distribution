package typings
package builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CURRENT_APP_INSTALLER_FILE_NAME: /* installer.exe */ java.lang.String = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: /* package.7z */ java.lang.String = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def configureRequestOptions(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.RequestOptions = js.native
  def configureRequestOptions(options: nodeLib.httpMod.RequestOptions, token: java.lang.String): nodeLib.httpMod.RequestOptions = js.native
  def configureRequestOptionsFromUrl(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(
    options: nodeLib.httpMod.RequestOptions,
    token: java.lang.String,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.DELETE
  ): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(
    options: nodeLib.httpMod.RequestOptions,
    token: scala.Null,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.DELETE
  ): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(
    options: nodeLib.httpMod.RequestOptions,
    token: java.lang.String,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.GET
  ): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(
    options: nodeLib.httpMod.RequestOptions,
    token: scala.Null,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.GET
  ): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(
    options: nodeLib.httpMod.RequestOptions,
    token: java.lang.String,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.PUT
  ): nodeLib.httpMod.RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(
    options: nodeLib.httpMod.RequestOptions,
    token: scala.Null,
    method: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.PUT
  ): nodeLib.httpMod.RequestOptions = js.native
  def configureRequestUrl(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def createHttpError(response: nodeLib.httpMod.IncomingMessage): builderDashUtilDashRuntimeLib.outHttpExecutorMod.HttpError = js.native
  def createHttpError(response: nodeLib.httpMod.IncomingMessage, description: js.Any): builderDashUtilDashRuntimeLib.outHttpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration): java.lang.String = js.native
  def githubUrl(options: builderDashUtilDashRuntimeLib.outPublishOptionsMod.GithubOptions): java.lang.String = js.native
  def githubUrl(
    options: builderDashUtilDashRuntimeLib.outPublishOptionsMod.GithubOptions,
    defaultHost: java.lang.String
  ): java.lang.String = js.native
  def newError(message: java.lang.String, code: java.lang.String): nodeLib.Error = js.native
  def parseDn(seq: java.lang.String): nodeLib.Map[java.lang.String, java.lang.String] = js.native
  def parseJson(result: js.Promise[java.lang.String | scala.Null]): js.Promise[_] = js.native
  def parseXml(data: java.lang.String): builderDashUtilDashRuntimeLib.outXmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: java.lang.String): js.Any = js.native
  def safeStringifyJson(data: js.Any): java.lang.String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: nodeLib.Set[java.lang.String]): java.lang.String = js.native
}

