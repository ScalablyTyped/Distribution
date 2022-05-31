package typings.cesium.global.Cesium

import typings.cesium.anon.OverrideMimeType
import typings.cesium.anon.PreferBlob
import typings.cesium.anon.QueryParameters
import typings.cesium.anon.Request
import typings.cesium.anon.RetryAttempts
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Resource")
@js.native
class Resource ()
  extends typings.cesium.mod.Resource {
  def this(options: QueryParameters) = this()
}
object Resource {
  
  @JSGlobal("Cesium.Resource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Resource.DEFAULT")
  @js.native
  def DEFAULT: typings.cesium.mod.Resource = js.native
  inline def DEFAULT_=(x: typings.cesium.mod.Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def delete(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def delete(options: OverrideMimeType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def fetch(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def fetch(options: Request): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def fetchArrayBuffer(): js.UndefOr[js.Promise[ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")().asInstanceOf[js.UndefOr[js.Promise[ArrayBuffer]]]
  inline def fetchArrayBuffer(options: QueryParameters): js.UndefOr[js.Promise[ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[ArrayBuffer]]]
  
  /* static member */
  inline def fetchBlob(): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")().asInstanceOf[js.UndefOr[js.Promise[Blob]]]
  inline def fetchBlob(options: QueryParameters): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Blob]]]
  
  /* static member */
  inline def fetchImage(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImage")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def fetchImage(options: PreferBlob): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImage")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def fetchJson(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def fetchJson(options: QueryParameters): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def fetchJsonp(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonp")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def fetchJsonp(options: RetryAttempts): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonp")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def fetchText(): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")().asInstanceOf[js.UndefOr[js.Promise[String]]]
  inline def fetchText(options: QueryParameters): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[String]]]
  
  /* static member */
  inline def fetchXml(): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXml")().asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
  inline def fetchXml(options: QueryParameters): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXml")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
  
  /* static member */
  inline def head(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def head(options: Request): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  @JSGlobal("Cesium.Resource.isBlobSupported")
  @js.native
  val isBlobSupported: Boolean = js.native
  
  /* static member */
  inline def options(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def options(options: Request): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def patch(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def patch(options: OverrideMimeType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def post(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def post(options: OverrideMimeType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  
  /* static member */
  inline def put(): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")().asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
  inline def put(options: OverrideMimeType): js.UndefOr[js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Any]]]
}
