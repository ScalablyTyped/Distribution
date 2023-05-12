package typings.cesium.mod

import typings.cesium.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTilesVoxelProvider")
@js.native
open class Cesium3DTilesVoxelProvider protected () extends VoxelProvider {
  def this(options: Url) = this()
  
  /**
    * Gets the promise that will be resolved when the provider is ready for use.
    */
  @JSName("readyPromise")
  val readyPromise_Cesium3DTilesVoxelProvider: js.Promise[Cesium3DTilesVoxelProvider] = js.native
}
/* static members */
object Cesium3DTilesVoxelProvider {
  
  @JSImport("cesium", "Cesium3DTilesVoxelProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(url: String): js.Promise[Cesium3DTilesVoxelProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cesium3DTilesVoxelProvider]]
  /**
    * Creates a {@link VoxelProvider} that fetches voxel data from a 3D Tiles tileset.
    * @param url - The URL to a tileset JSON file
    * @returns The created provider
    */
  inline def fromUrl(url: Resource): js.Promise[Cesium3DTilesVoxelProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cesium3DTilesVoxelProvider]]
}
