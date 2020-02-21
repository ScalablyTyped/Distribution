package typings.cesium.mod

import typings.cesium.AnonAccessToken
import typings.cesium.AnonEndpoint
import typings.cesium.AnonHeaders
import typings.cesium.AnonHeadersPreserveQueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IonResource")
@js.native
class IonResource protected () extends Resource {
  def this(option: AnonEndpoint) = this()
  val credits: js.Array[String] = js.native
  def fetchImage(): js.UndefOr[js.Promise[_]] = js.native
  def fetchJsonp(): js.UndefOr[js.Promise[_]] = js.native
  def fetchXMLS(): js.UndefOr[js.Promise[_]] = js.native
  def getDerivedResource(): Resource = js.native
  def getDerivedResource(option: AnonHeadersPreserveQueryParameters): Resource = js.native
  def getUrlComponent(): String = js.native
  def getUrlComponent(query: Boolean): String = js.native
  def post(data: js.Any, options: AnonHeaders): js.UndefOr[js.Promise[_]] = js.native
  def setQueryParameters(params: js.Any): Unit = js.native
  def setTemplateValues(params: js.Any): Unit = js.native
}

/* static members */
@JSImport("cesium", "IonResource")
@js.native
object IonResource extends js.Object {
  def fromAssetId(assetId: String): js.Promise[IonResource] = js.native
  def fromAssetId(assetId: String, options: AnonAccessToken): js.Promise[IonResource] = js.native
}

