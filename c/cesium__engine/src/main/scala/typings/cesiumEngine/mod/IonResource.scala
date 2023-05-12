package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "IonResource")
@js.native
open class IonResource protected () extends Resource {
  def this(endpoint: Any, endpointResource: Resource) = this()
  
  /**
    * Gets the credits required for attribution of the asset.
    */
  val credits: js.Array[Credit] = js.native
}
/* static members */
object IonResource {
  
  @JSImport("@cesium/engine", "IonResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously creates an instance.
    * @example
    * // Load a Cesium3DTileset with asset ID of 124624234
    * try {
    *   const resource = await Cesium.IonResource.fromAssetId(124624234);
    *   const tileset = await Cesium.Cesium3DTileset.fromUrl(resource);
    *   scene.primitives.add(tileset);
    * } catch (error) {
    *   console.error(`Error creating tileset: ${error}`);
    * }
    * @example
    * //Load a CZML file with asset ID of 10890
    * Cesium.IonResource.fromAssetId(10890)
    *   .then(function (resource) {
    *     viewer.dataSources.add(Cesium.CzmlDataSource.load(resource));
    *   });
    * @param assetId - The Cesium ion asset id.
    * @param [options] - An object with the following properties:
    * @param [options.accessToken = Ion.defaultAccessToken] - The access token to use.
    * @param [options.server = Ion.defaultServer] - The resource to the Cesium ion API server.
    * @returns A Promise to am instance representing the Cesium ion Asset.
    */
  inline def fromAssetId(assetId: Double): js.Promise[IonResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IonResource]]
  inline def fromAssetId(assetId: Double, options: Server): js.Promise[IonResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAssetId")(assetId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IonResource]]
}
