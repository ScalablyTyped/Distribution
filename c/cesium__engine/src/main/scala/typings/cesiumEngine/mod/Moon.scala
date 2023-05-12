package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.OnlySunLighting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Moon")
@js.native
open class Moon () extends StObject {
  def this(options: OnlySunLighting) = this()
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * moon = moon && moon.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Get the ellipsoid that defines the shape of the moon.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Use the sun as the only light source.
    */
  var onlySunLighting: Boolean = js.native
  
  /**
    * Determines if the moon will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * The moon texture.
    */
  var textureUrl: String = js.native
}
