package typings.cesium.mod

import typings.cesium.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DebugModelMatrixPrimitive")
@js.native
open class DebugModelMatrixPrimitive () extends StObject {
  def this(options: Id) = this()
  
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
    * The length of the axes in meters.
    */
  var length: Double = js.native
  
  /**
    * The 4x4 matrix that defines the reference frame, i.e., origin plus axes, to visualize.
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Determines if this primitive will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * The width of the axes in pixels.
    */
  var width: Double = js.native
}
