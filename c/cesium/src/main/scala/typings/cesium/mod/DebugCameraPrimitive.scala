package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DebugCameraPrimitive")
@js.native
open class DebugCameraPrimitive protected () extends StObject {
  def this(options: typings.cesium.anon.Camera) = this()
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * </p>
    * @example
    * p = p && p.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * User-defined value returned when the primitive is picked.
    */
  var id: Any = js.native
  
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
    * Determines if this primitive will be shown.
    */
  var show: Boolean = js.native
}
