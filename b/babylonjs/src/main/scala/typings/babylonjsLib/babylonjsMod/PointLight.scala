package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A point light is a light defined by an unique point in world space.
  * The light is emitted in every direction from this point.
  * A good example of a point light is a standard light bulb.
  * Documentation: https://doc.babylonjs.com/babylon101/lights
  */
@JSImport("babylonjs", "PointLight")
@js.native
class PointLight protected ()
  extends babylonjsLib.BABYLONNs.PointLight {
  /**
    * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
    * A PointLight emits the light in every direction.
    * It can cast shadows.
    * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
    * ```javascript
    * var pointLight = new BABYLON.PointLight("pl", camera.position, scene);
    * ```
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The light friendly name
    * @param position The position of the point light in the scene
    * @param scene The scene the lights belongs to
    */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

