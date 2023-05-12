package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.ClippingPlanes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "TimeDynamicPointCloud")
@js.native
open class TimeDynamicPointCloud protected () extends StObject {
  def this(options: ClippingPlanes) = this()
  
  /**
    * The bounding sphere of the frame being rendered. Returns <code>undefined</code> if no frame is being rendered.
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * The {@link ClippingPlaneCollection} used to selectively disable rendering the point cloud.
    */
  var clippingPlanes: ClippingPlaneCollection = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * pointCloud = pointCloud && pointCloud.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * The event fired to indicate that a new frame was rendered.
    * <p>
    * The time dynamic point cloud {@link TimeDynamicPointCloud} is passed to the event listener.
    * </p>
    * @example
    * pointCloud.frameChanged.addEventListener(function(timeDynamicPointCloud) {
    *     viewer.camera.viewBoundingSphere(timeDynamicPointCloud.boundingSphere);
    * });
    */
  var frameChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * The event fired to indicate that a frame failed to load. A frame may fail to load if the
    * request for its uri fails or processing fails due to invalid content.
    * <p>
    * If there are no event listeners, error messages will be logged to the console.
    * </p>
    * <p>
    * The error object passed to the listener contains two properties:
    * <ul>
    * <li><code>uri</code>: the uri of the failed frame.</li>
    * <li><code>message</code>: the error message.</li>
    * </ul>
    * @example
    * pointCloud.frameFailed.addEventListener(function(error) {
    *     console.log(`An error occurred loading frame: ${error.uri}`);
    *     console.log(`Error: ${error.message}`);
    * });
    */
  var frameFailed: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Marks the point cloud's {@link TimeDynamicPointCloud#style} as dirty, which forces all
    * points to re-evaluate the style in the next frame.
    */
  def makeStyleDirty(): Unit = js.native
  
  /**
    * The maximum amount of GPU memory (in MB) that may be used to cache point cloud frames.
    * <p>
    * Frames that are not being loaded or rendered are unloaded to enforce this.
    * </p>
    * <p>
    * If decreasing this value results in unloading tiles, the tiles are unloaded the next frame.
    * </p>
    */
  var maximumMemoryUsage: Double = js.native
  
  /**
    * A 4x4 transformation matrix that transforms the point cloud.
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Gets the promise that will be resolved when the point cloud renders a frame for the first time.
    */
  val readyPromise: js.Promise[TimeDynamicPointCloud] = js.native
  
  /**
    * Options for controlling point size based on geometric error and eye dome lighting.
    */
  var shading: PointCloudShading = js.native
  
  /**
    * Determines whether the point cloud casts or receives shadows from light sources.
    * <p>
    * Enabling shadows has a performance impact. A point cloud that casts shadows must be rendered twice, once from the camera and again from the light's point of view.
    * </p>
    * <p>
    * Shadows are rendered only when {@link Viewer#shadows} is <code>true</code>.
    * </p>
    */
  var shadows: ShadowMode = js.native
  
  /**
    * Determines if the point cloud will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * The style, defined using the
    * {@link https://github.com/CesiumGS/3d-tiles/tree/main/specification/Styling|3D Tiles Styling language},
    * applied to each point in the point cloud.
    * <p>
    * Assign <code>undefined</code> to remove the style, which will restore the visual
    * appearance of the point cloud to its default when no style was applied.
    * </p>
    * @example
    * pointCloud.style = new Cesium.Cesium3DTileStyle({
    *    color : {
    *        conditions : [
    *            ['${Classification} === 0', 'color("purple", 0.5)'],
    *            ['${Classification} === 1', 'color("red")'],
    *            ['true', '${COLOR}']
    *        ]
    *    },
    *    show : '${Classification} !== 2'
    * });
    */
  var style: Cesium3DTileStyle = js.native
  
  /**
    * The total amount of GPU memory in bytes used by the point cloud.
    */
  val totalMemoryUsageInBytes: Double = js.native
}
