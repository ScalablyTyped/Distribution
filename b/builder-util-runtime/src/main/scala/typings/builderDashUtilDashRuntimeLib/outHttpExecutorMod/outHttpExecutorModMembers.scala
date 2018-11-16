package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", JSImport.Namespace)
@js.native
object outHttpExecutorModMembers extends js.Object {
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
  def createHttpError(response: nodeLib.httpMod.IncomingMessage): HttpError = js.native
  def createHttpError(response: nodeLib.httpMod.IncomingMessage, description: js.Any): HttpError = js.native
  def parseJson(result: stdLib.Promise[java.lang.String | scala.Null]): stdLib.Promise[_] = js.native
  def safeGetHeader(response: js.Any, headerKey: java.lang.String): js.Any = js.native
  def safeStringifyJson(data: js.Any): java.lang.String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: nodeLib.Set[java.lang.String]): java.lang.String = js.native
}

