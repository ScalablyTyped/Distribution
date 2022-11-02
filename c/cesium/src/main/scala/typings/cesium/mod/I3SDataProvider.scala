package typings.cesium.mod

import typings.cesium.anon.Cesium3dTilesetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "I3SDataProvider")
@js.native
open class I3SDataProvider protected () extends StObject {
  def this(options: Cesium3dTilesetOptions) = this()
  
  /**
    * Gets the I3S data for this object.
    */
  val data: Any = js.native
  
  /**
    * Destroys the WebGL resources held by this object. Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception. Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * </p>
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the extent covered by this I3S.
    */
  val extent: Rectangle = js.native
  
  /**
    * The terrain provider referencing the GEOID service to be used for orthometric to ellipsoidal conversion.
    */
  val geoidTiledTerrainProvider: ArcGISTiledElevationTerrainProvider = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <p>
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * </p>
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the collection of layers.
    */
  val layers: js.Array[I3SLayer] = js.native
  
  /**
    * Gets a human-readable name for this dataset.
    */
  val name: String = js.native
  
  /**
    * When <code>true</code>, the I3S scene is loaded.
    * This is set to <code>true</code> right before {@link I3SDataProvider#readyPromise} is resolved.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when the I3S scene is loaded.
    */
  val readyPromise: js.Promise[I3SDataProvider] = js.native
  
  /**
    * The resource used to fetch the I3S dataset.
    */
  val resource: Resource = js.native
  
  /**
    * Determines if the dataset will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets debugging and tracing of I3S fetches.
    */
  var traceFetches: Boolean = js.native
}
