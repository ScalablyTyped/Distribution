package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Resource")
@js.native
class Resource () extends js.Object {
  def this(options: cesiumLib.Anon_HeadersProxy) = this()
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
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[stdLib.Blob]] = js.native
  def fetchImage(preferBlob: scala.Boolean): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(callbackParameterName: java.lang.String): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[java.lang.String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[stdLib.XMLDocument]] = js.native
  def getBaseUri(includeQuery: scala.Boolean): java.lang.String = js.native
  def getDerivedResource(options: cesiumLib.Anon_HeadersPreserveQueryParameters): Resource = js.native
  def getUrlComponent(query: scala.Boolean, proxy: scala.Boolean): java.lang.String = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any, options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any, options: cesiumLib.Anon_DataHeadersOverrideMimeTypeResponseType): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any, options: cesiumLib.Anon_HeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def retryCallback(): scala.Unit = js.native
  def setQueryParameters(params: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
  def setTemplateValues(template: js.Any, useAsDefault: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "Resource")
@js.native
object Resource extends js.Object {
  var DEFAULT: cesiumLib.cesiumMod.Resource = js.native
  val isBlobSupported: scala.Boolean = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: cesiumLib.Anon_DataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: cesiumLib.Anon_Headers): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchArrayBuffer(options: cesiumLib.Anon_HeadersProxy): js.UndefOr[js.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[stdLib.Blob]] = js.native
  def fetchBlob(options: cesiumLib.Anon_HeadersProxy): js.UndefOr[js.Promise[stdLib.Blob]] = js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  def fetchImage(options: cesiumLib.Anon_HeadersPreferBlob): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(options: cesiumLib.Anon_HeadersProxy): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(options: cesiumLib.Anon_CallbackParameterNameHeaders): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[java.lang.String]] = js.native
  def fetchText(options: cesiumLib.Anon_HeadersProxy): js.UndefOr[js.Promise[java.lang.String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[stdLib.XMLDocument]] = js.native
  def fetchXml(options: cesiumLib.Anon_HeadersProxy): js.UndefOr[js.Promise[stdLib.XMLDocument]] = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: cesiumLib.Anon_Headers): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: cesiumLib.Anon_Headers): js.UndefOr[js.Promise[_]] = js.native
  def patch(): js.UndefOr[js.Promise[_]] = js.native
  def patch(options: cesiumLib.Anon_DataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def post(): js.UndefOr[js.Promise[_]] = js.native
  def post(options: cesiumLib.Anon_DataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def put(): js.UndefOr[js.Promise[_]] = js.native
  def put(options: cesiumLib.Anon_DataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
}

