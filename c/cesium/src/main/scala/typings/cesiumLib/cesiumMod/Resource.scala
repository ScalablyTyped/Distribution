package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Resource")
@js.native
class Resource ()
  extends cesiumLib.cesiumMod.CesiumNs.Resource {
  def this(options: cesiumLib.Anon_RequestUrlProxy) = this()
}

@JSImport("cesium", "Resource")
@js.native
object Resource extends js.Object {
  var DEFAULT: cesiumLib.cesiumMod.CesiumNs.Resource = js.native
  val isBlobSupported: scala.Boolean = js.native
  def delete(): js.UndefOr[stdLib.Promise[_]] = js.native
  def delete(options: cesiumLib.Anon_RequestUrl): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetch(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetch(options: cesiumLib.Anon_RequestUrlOverrideMimeType): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchArrayBuffer(): js.UndefOr[stdLib.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchArrayBuffer(options: cesiumLib.Anon_RequestUrlProxy): js.UndefOr[stdLib.Promise[stdLib.ArrayBuffer]] = js.native
  def fetchBlob(): js.UndefOr[stdLib.Promise[stdLib.Blob]] = js.native
  def fetchBlob(options: cesiumLib.Anon_RequestUrlProxy): js.UndefOr[stdLib.Promise[stdLib.Blob]] = js.native
  def fetchImage(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchImage(options: cesiumLib.Anon_RequestUrlProxyPreferBlob): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJson(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJson(options: cesiumLib.Anon_RequestUrlProxy): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchJsonp(options: cesiumLib.Anon_Request): js.UndefOr[stdLib.Promise[_]] = js.native
  def fetchText(): js.UndefOr[stdLib.Promise[java.lang.String]] = js.native
  def fetchText(options: cesiumLib.Anon_RequestUrlProxy): js.UndefOr[stdLib.Promise[java.lang.String]] = js.native
  def fetchXml(): js.UndefOr[stdLib.Promise[stdLib.XMLDocument]] = js.native
  def fetchXml(options: cesiumLib.Anon_RequestUrlProxy): js.UndefOr[stdLib.Promise[stdLib.XMLDocument]] = js.native
  def head(): js.UndefOr[stdLib.Promise[_]] = js.native
  def head(options: cesiumLib.Anon_RequestUrlOverrideMimeType): js.UndefOr[stdLib.Promise[_]] = js.native
  def options(): js.UndefOr[stdLib.Promise[_]] = js.native
  def options(options: cesiumLib.Anon_RequestUrlOverrideMimeType): js.UndefOr[stdLib.Promise[_]] = js.native
  def patch(): js.UndefOr[stdLib.Promise[_]] = js.native
  def patch(options: cesiumLib.Anon_RequestUrl): js.UndefOr[stdLib.Promise[_]] = js.native
  def post(): js.UndefOr[stdLib.Promise[_]] = js.native
  def post(options: cesiumLib.Anon_RequestUrl): js.UndefOr[stdLib.Promise[_]] = js.native
  def put(): js.UndefOr[stdLib.Promise[_]] = js.native
  def put(options: cesiumLib.Anon_RequestUrl): js.UndefOr[stdLib.Promise[_]] = js.native
}

