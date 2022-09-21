package typings.cesium.mod

import typings.cesium.anon.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SkyBox")
@js.native
open class SkyBox protected () extends StObject {
  def this(options: Show) = this()
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * skyBox = skyBox && skyBox.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Determines if the sky box will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * The sources used to create the cube map faces: an object
    * with <code>positiveX</code>, <code>negativeX</code>, <code>positiveY</code>,
    * <code>negativeY</code>, <code>positiveZ</code>, and <code>negativeZ</code> properties.
    * These can be either URLs or <code>Image</code> objects.
    */
  var sources: Any = js.native
  
  /**
    * Called when {@link Viewer} or {@link CesiumWidget} render the scene to
    * get the draw commands needed to render this primitive.
    * <p>
    * Do not call this function directly.  This is documented just to
    * list the exceptions that may be propagated when the scene is rendered:
    * </p>
    */
  def update(): Unit = js.native
}
