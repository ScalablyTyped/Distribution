package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A directional light is defined by a direction (what a surprise!).
     * The light is emitted from everywhere in the specified direction, and has an infinite range.
     * An example of a directional light is when a distance planet is lit by the apparently parallel lines of light from its sun. Light in a downward direction will light the top of an object.
     * Documentation: https://doc.babylonjs.com/babylon101/lights
     */
@JSImport("babylonjs", "DirectionalLight")
@js.native
class DirectionalLight protected ()
  extends babylonjsLib.BABYLONNs.DirectionalLight {
  /**
           * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
           * The directional light is emitted from everywhere in the given direction.
           * It can cast shadows.
           * Documentation : http://doc.babylonjs.com/tutorials/lights
           * @param name The friendly name of the light
           * @param direction The direction of the light
           * @param scene The scene the light belongs to
           */
  def this(name: java.lang.String, direction: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

