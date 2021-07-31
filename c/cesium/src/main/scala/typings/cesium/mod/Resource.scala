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
  
  def delete(): js.UndefOr[js.Promise[js.Any]] = js.native
  def delete(options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  val `extension`: String = js.native
  
  def fetch(): js.UndefOr[js.Promise[js.Any]] = js.native
  def fetch(options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = js.native
  
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  
  def fetchImage(preferBlob: Boolean): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchJson(): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchJsonp(callbackParameterName: String): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  
  def getBaseUri(includeQuery: Boolean): String = js.native
  
  def getDerivedResource(options: Request): Resource = js.native
  
  def getUrlComponent(query: Boolean, proxy: Boolean): String = js.native
  
  var hasHeaders: Boolean = js.native
  
  def head(): js.UndefOr[js.Promise[js.Any]] = js.native
  def head(options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  var headers: js.Any = js.native
  
  var isBlobUri: Boolean = js.native
  
  var isCrossOriginUrl: Boolean = js.native
  
  var isDataUri: Boolean = js.native
  
  def options(): js.UndefOr[js.Promise[js.Any]] = js.native
  def options(options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def patch(data: js.Any): js.UndefOr[js.Promise[js.Any]] = js.native
  def patch(data: js.Any, options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def post(data: js.Any): js.UndefOr[js.Promise[js.Any]] = js.native
  def post(data: js.Any, options: OverrideMimeType): js.UndefOr[js.Promise[js.Any]] = js.native
  
  var proxy: DefaultProxy = js.native
  
  def put(data: js.Any): js.UndefOr[js.Promise[js.Any]] = js.native
  def put(data: js.Any, options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
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
  @scala.inline
  def delete(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def delete(options: ResponseType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def fetch(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def fetch(options: RetryAttempts): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")().asInstanceOf[js.UndefOr[js.Promise[ArrayBuffer]]]
  @scala.inline
  def fetchArrayBuffer(options: QueryParameters): js.UndefOr[js.Promise[ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[ArrayBuffer]]]
  
  /* static member */
  @scala.inline
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")().asInstanceOf[js.UndefOr[js.Promise[Blob]]]
  @scala.inline
  def fetchBlob(options: QueryParameters): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Blob]]]
  
  /* static member */
  @scala.inline
  def fetchImage(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImage")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def fetchImage(options: PreferBlob): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImage")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def fetchJson(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def fetchJson(options: QueryParameters): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def fetchJsonp(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonp")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def fetchJsonp(options: typings.cesium.anon.RetryCallback): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonp")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def fetchText(): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")().asInstanceOf[js.UndefOr[js.Promise[String]]]
  @scala.inline
  def fetchText(options: QueryParameters): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[String]]]
  
  /* static member */
  @scala.inline
  def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXml")().asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
  @scala.inline
  def fetchXml(options: QueryParameters): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXml")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
  
  /* static member */
  @scala.inline
  def head(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def head(options: RetryAttempts): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @JSImport("cesium", "Resource.isBlobSupported")
  @js.native
  val isBlobSupported: Boolean = js.native
  
  /* static member */
  @scala.inline
  def options(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def options(options: RetryAttempts): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def patch(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def patch(options: ResponseType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def post(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def post(options: ResponseType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @scala.inline
  def put(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  @scala.inline
  def put(options: ResponseType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ Error, Unit]
}
