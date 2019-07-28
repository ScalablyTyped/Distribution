package typings.builderDashUtilDashRuntime.outHttpExecutorMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.DELETE
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.GET
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.PUT
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def createHttpError(response: IncomingMessage): HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): HttpError = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
}

