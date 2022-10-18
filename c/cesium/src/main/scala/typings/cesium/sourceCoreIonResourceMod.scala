package typings.cesium

import typings.cesium.anon.Server
import typings.cesium.mod.IonResource
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreIonResourceMod {
  
  @JSImport("cesium/Source/Core/IonResource", JSImport.Default)
  @js.native
  open class default protected () extends IonResource {
    def this(endpoint: Any, endpointResource: Resource) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/IonResource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously creates an instance.
      * @example
      * //Load a Cesium3DTileset with asset ID of 124624234
      * viewer.scene.primitives.add(new Cesium.Cesium3DTileset({ url: Cesium.IonResource.fromAssetId(124624234) }));
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
}
