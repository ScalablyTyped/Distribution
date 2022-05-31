package typings.cesium.global.Cesium

import typings.cesium.anon.AccessToken
import typings.cesium.anon.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.IonResource")
@js.native
class IonResource protected ()
  extends typings.cesium.mod.IonResource {
  def this(option: Endpoint) = this()
}
object IonResource {
  
  @JSGlobal("Cesium.IonResource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromAssetId(assetId: String): js.Promise[typings.cesium.mod.IonResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.cesium.mod.IonResource]]
  inline def fromAssetId(assetId: String, options: AccessToken): js.Promise[typings.cesium.mod.IonResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.cesium.mod.IonResource]]
}
