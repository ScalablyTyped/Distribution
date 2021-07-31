package typings.cesium.mod

import typings.cesium.anon.AccessToken
import typings.cesium.anon.Endpoint
import typings.cesium.anon.Headers
import typings.cesium.anon.PreserveQueryParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "IonResource")
@js.native
class IonResource protected () extends Resource {
  def this(option: Endpoint) = this()
  
  val credits: js.Array[String] = js.native
  
  def fetchImage(): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchJsonp(): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def fetchXMLS(): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def getDerivedResource(): Resource = js.native
  def getDerivedResource(option: PreserveQueryParameters): Resource = js.native
  
  def getUrlComponent(): String = js.native
  def getUrlComponent(query: Boolean): String = js.native
  def getUrlComponent(query: Unit, proxy: Boolean): String = js.native
  
  def post(data: js.Any, options: Headers): js.UndefOr[js.Promise[js.Any]] = js.native
  
  def setQueryParameters(params: js.Any): Unit = js.native
  
  def setTemplateValues(params: js.Any): Unit = js.native
}
object IonResource {
  
  @JSImport("cesium", "IonResource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromAssetId(assetId: String): js.Promise[IonResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IonResource]]
  @scala.inline
  def fromAssetId(assetId: String, options: AccessToken): js.Promise[IonResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IonResource]]
}
