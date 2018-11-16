package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  val extension: java.lang.String = js.native
  var hasHeaders: scala.Boolean = js.native
  var headers: js.Any = js.native
  var isBlobUri: scala.Boolean = js.native
  var isCrossOriginUrl: scala.Boolean = js.native
  var isDataUri: scala.Boolean = js.native
  var proxy: DefaultProxy = js.native
  val queryParameters: js.Any = js.native
  var request: stdLib.Request = js.native
  var retryAttempts: scala.Double = js.native
  val templateValues: js.Any = js.native
  var url: java.lang.String = js.native
  def addQueryParameters(params: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
  def addTemplateValues(template: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
  def appendForwardSlash(): scala.Unit = js.native
  def appendQueryParameters(params: js.Any): scala.Unit = js.native
  def clone(result: Resource): Resource = js.native
  def delete(): js.UndefOr[stdLib.Promise[_]] = js.native
  def delete(options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetch(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetch(options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[stdLib.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[stdLib.Promise[stdLib.Blob]] = js.native
  def fetchImage(preferBlob: scala.Boolean): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJsonp(callbackParameterName: java.lang.String): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchText(): js.UndefOr[stdLib.Promise[java.lang.String]] = js.native
  def fetchXml(): js.UndefOr[stdLib.Promise[stdLib.XMLDocument]] = js.native
  def getBaseUri(includeQuery: scala.Boolean): java.lang.String = js.native
  def getDerivedResource(options: cesiumLib.Anon_RequestUrlPreserveQueryParameters): Resource = js.native
  def getUrlComponent(query: scala.Boolean, proxy: scala.Boolean): java.lang.String = js.native
  def head(): js.UndefOr[stdLib.Promise[_]] = js.native
  def head(options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def options(): js.UndefOr[stdLib.Promise[_]] = js.native
  def options(options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def patch(data: js.Any): js.UndefOr[stdLib.Promise[_]] = js.native
  def patch(data: js.Any, options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def post(data: js.Any): js.UndefOr[stdLib.Promise[_]] = js.native
  def post(data: js.Any, options: cesiumLib.Anon_DataResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def put(data: js.Any): js.UndefOr[stdLib.Promise[_]] = js.native
  def put(data: js.Any, options: cesiumLib.Anon_ResponseType): js.UndefOr[stdLib.Promise[_]] = js.native
  def retryCallback(): scala.Unit = js.native
  def setQueryParameters(params: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
  def setTemplateValues(template: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
}

