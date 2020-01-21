package typings.cesium.mod

import typings.cesium.AnonCallbackParameterNameHeaders
import typings.cesium.AnonDataHeadersOverrideMimeType
import typings.cesium.AnonDataHeadersOverrideMimeTypeResponseType
import typings.cesium.AnonHeaders
import typings.cesium.AnonHeadersOverrideMimeType
import typings.cesium.AnonHeadersPreferBlob
import typings.cesium.AnonHeadersPreserveQueryParameters
import typings.cesium.AnonHeadersProxy
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.Request
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Resource")
@js.native
class Resource () extends js.Object {
  def this(options: AnonHeadersProxy) = this()
  val extension: String = js.native
  var hasHeaders: Boolean = js.native
  var headers: js.Any = js.native
  var isBlobUri: Boolean = js.native
  var isCrossOriginUrl: Boolean = js.native
  var isDataUri: Boolean = js.native
  var proxy: DefaultProxy = js.native
  val queryParameters: js.Any = js.native
  var request: Request = js.native
  var retryAttempts: Double = js.native
  val templateValues: js.Any = js.native
  var url: String = js.native
  def addQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  def addTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
  def appendForwardSlash(): Unit = js.native
  def appendQueryParameters(params: js.Any): Unit = js.native
  def clone(result: Resource): Resource = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchImage(preferBlob: Boolean): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(callbackParameterName: String): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def getBaseUri(includeQuery: Boolean): String = js.native
  def getDerivedResource(options: AnonHeadersPreserveQueryParameters): Resource = js.native
  def getUrlComponent(query: Boolean, proxy: Boolean): String = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any, options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any, options: AnonDataHeadersOverrideMimeTypeResponseType): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any, options: AnonHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def retryCallback(): Unit = js.native
  def setQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  def setTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
}

/* static members */
@JSImport("cesium", "Resource")
@js.native
object Resource extends js.Object {
  var DEFAULT: Resource = js.native
  val isBlobSupported: Boolean = js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: AnonDataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: AnonHeaders): js.UndefOr[js.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  def fetchArrayBuffer(options: AnonHeadersProxy): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchBlob(options: AnonHeadersProxy): js.UndefOr[js.Promise[Blob]] = js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  def fetchImage(options: AnonHeadersPreferBlob): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJson(options: AnonHeadersProxy): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(options: AnonCallbackParameterNameHeaders): js.UndefOr[js.Promise[_]] = js.native
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  def fetchText(options: AnonHeadersProxy): js.UndefOr[js.Promise[String]] = js.native
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def fetchXml(options: AnonHeadersProxy): js.UndefOr[js.Promise[XMLDocument]] = js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: AnonHeaders): js.UndefOr[js.Promise[_]] = js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: AnonHeaders): js.UndefOr[js.Promise[_]] = js.native
  def patch(): js.UndefOr[js.Promise[_]] = js.native
  def patch(options: AnonDataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def post(): js.UndefOr[js.Promise[_]] = js.native
  def post(options: AnonDataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  def put(): js.UndefOr[js.Promise[_]] = js.native
  def put(options: AnonDataHeadersOverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ Error, Unit]
}

