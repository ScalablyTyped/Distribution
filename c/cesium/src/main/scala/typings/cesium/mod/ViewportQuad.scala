package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ViewportQuad")
@js.native
open class ViewportQuad () extends StObject {
  def this(rectangle: BoundingRectangle) = this()
  def this(rectangle: Unit, material: Material) = this()
  def this(rectangle: BoundingRectangle, material: Material) = this()
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * quad = quad && quad.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The surface appearance of the viewport quad.  This can be one of several built-in {@link Material} objects or a custom material, scripted with
    * {@link https://github.com/CesiumGS/cesium/wiki/Fabric|Fabric}.
    * <p>
    * The default material is <code>Material.ColorType</code>.
    * </p>
    * @example
    * // 1. Change the color of the default material to yellow
    * viewportQuad.material.uniforms.color = new Cesium.Color(1.0, 1.0, 0.0, 1.0);
    *
    * // 2. Change material to horizontal stripes
    * viewportQuad.material = Cesium.Material.fromType(Cesium.Material.StripeType);
    */
  var material: Material = js.native
  
  /**
    * The BoundingRectangle defining the quad's position within the viewport.
    * @example
    * viewportQuad.rectangle = new Cesium.BoundingRectangle(0, 0, 80, 40);
    */
  var rectangle: BoundingRectangle = js.native
  
  /**
    * Determines if the viewport quad primitive will be shown.
    */
  var show: Boolean = js.native
  
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
