package typings.cesium.mod

import typings.cesium.anon.Headers
import typings.cesium.anon.OverrideMimeType
import typings.cesium.anon.PreferBlob
import typings.cesium.anon.QueryParameters
import typings.cesium.anon.Request
import typings.cesium.anon.ResponseType
import typings.cesium.anon.RetryAttempts
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Resource")
@js.native
class Resource () extends StObject {
  def this(options: QueryParameters) = this()
  
  def addQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  
  def addTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
  
  def appendForwardSlash(): Unit = js.native
  
  def appendQueryParameters(params: js.Any): Unit = js.native
  
  def clone(result: Resource): Resource = js.native
  
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  def delete(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  val extension: String = js.native
  
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  def fetch(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  
  def fetchImage(preferBlob: Boolean): js.UndefOr[js.Promise[_]] = js.native
  
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  
  def fetchJsonp(callbackParameterName: String): js.UndefOr[js.Promise[_]] = js.native
  
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  
  def getBaseUri(includeQuery: Boolean): String = js.native
  
  def getDerivedResource(options: Request): Resource = js.native
  
  def getUrlComponent(query: Boolean, proxy: Boolean): String = js.native
  
  var hasHeaders: Boolean = js.native
  
  def head(): js.UndefOr[js.Promise[_]] = js.native
  def head(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  var headers: js.Any = js.native
  
  var isBlobUri: Boolean = js.native
  
  var isCrossOriginUrl: Boolean = js.native
  
  var isDataUri: Boolean = js.native
  
  def options(): js.UndefOr[js.Promise[_]] = js.native
  def options(options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  def patch(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def patch(data: js.Any, options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  def post(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def post(data: js.Any, options: OverrideMimeType): js.UndefOr[js.Promise[_]] = js.native
  
  var proxy: DefaultProxy = js.native
  
  def put(data: js.Any): js.UndefOr[js.Promise[_]] = js.native
  def put(data: js.Any, options: Headers): js.UndefOr[js.Promise[_]] = js.native
  
  val queryParameters: js.Any = js.native
  
  var request: typings.std.Request = js.native
  
  var retryAttempts: Double = js.native
  
  def retryCallback(): Unit = js.native
  
  def setQueryParameters(params: js.Any, useAsDefault: Boolean): Unit = js.native
  
  def setTemplateValues(template: js.Any, useAsDefault: Boolean): Unit = js.native
  
  val templateValues: js.Any = js.native
  
  var url: String = js.native
}
object Resource {
  
  @JSImport("cesium", "Resource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.DEFAULT")
  @js.native
  def DEFAULT: Resource = js.native
  @scala.inline
  def DEFAULT_=(x: Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Resource.delete")
  @js.native
  def delete(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.delete")
  @js.native
  def delete(options: ResponseType): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetch")
  @js.native
  def fetch(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.fetch")
  @js.native
  def fetch(options: RetryAttempts): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchArrayBuffer")
  @js.native
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  @JSImport("cesium", "Resource.fetchArrayBuffer")
  @js.native
  def fetchArrayBuffer(options: QueryParameters): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchBlob")
  @js.native
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  @JSImport("cesium", "Resource.fetchBlob")
  @js.native
  def fetchBlob(options: QueryParameters): js.UndefOr[js.Promise[Blob]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchImage")
  @js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.fetchImage")
  @js.native
  def fetchImage(options: PreferBlob): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchJson")
  @js.native
  def fetchJson(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.fetchJson")
  @js.native
  def fetchJson(options: QueryParameters): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchJsonp")
  @js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.fetchJsonp")
  @js.native
  def fetchJsonp(options: typings.cesium.anon.RetryCallback): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchText")
  @js.native
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  @JSImport("cesium", "Resource.fetchText")
  @js.native
  def fetchText(options: QueryParameters): js.UndefOr[js.Promise[String]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.fetchXml")
  @js.native
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  @JSImport("cesium", "Resource.fetchXml")
  @js.native
  def fetchXml(options: QueryParameters): js.UndefOr[js.Promise[XMLDocument]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.head")
  @js.native
  def head(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.head")
  @js.native
  def head(options: RetryAttempts): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.isBlobSupported")
  @js.native
  val isBlobSupported: Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.options")
  @js.native
  def options(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.options")
  @js.native
  def options(options: RetryAttempts): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.patch")
  @js.native
  def patch(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.patch")
  @js.native
  def patch(options: ResponseType): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.post")
  @js.native
  def post(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.post")
  @js.native
  def post(options: ResponseType): js.UndefOr[js.Promise[_]] = js.native
  
  /* static member */
  @JSImport("cesium", "Resource.put")
  @js.native
  def put(): js.UndefOr[js.Promise[_]] = js.native
  @JSImport("cesium", "Resource.put")
  @js.native
  def put(options: ResponseType): js.UndefOr[js.Promise[_]] = js.native
  
  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ Error, Unit]
}
